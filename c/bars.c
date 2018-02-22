#include <stdio.h>
#include <stdint.h>
#include <string.h>
#include <linux/fb.h>
#include <unistd.h>
#include <sys/ioctl.h>
#include <sys/mman.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

uint8_t* screen_mem;
struct fb_var_screeninfo vinfo;
struct fb_fix_screeninfo finfo;

static inline uint32_t pixel_color(uint8_t r, uint8_t g, uint8_t b, struct fb_var_screeninfo *vinfo)
{
    return (r<<vinfo->red.offset) |
           (g<<vinfo->green.offset) |
           (b<<vinfo->blue.offset);
}

void draw(){
    int x, y;
    uint32_t pixel; 
    pixel = pixel_color(0x00,0xFF,0x00, &vinfo);
    unsigned int pix_offset; 
    for (y=0;y<vinfo.yres;y++)
    {
        for (x=0;x<vinfo.xres;x++)
        {
            long location = (x+vinfo.xoffset) * 
                     (vinfo.bits_per_pixel/8) + (y+vinfo.yoffset) * finfo.line_length;
            pix_offset = (x) + (y * finfo.line_length); 
            //printf(" x :%d + y:%d\n", x, y);
            //*((uint32_t*)(screen_mem + location)) = pixel_color(0xFF,0x00,0xFF, &vinfo);//16 * x/vinfo.xres; //pixel;
            *((uint32_t*)(screen_mem + pix_offset))= 16 * x / vinfo.xres;// pixel_color(0xFF,0x00,0xFF, &vinfo);
            //*((char*)(screen_mem + pix_offset)) = 16 * x / vinfo.xres;
        }
    }

}

/* ###### MAIN ###### */
int main() {

    struct fb_var_screeninfo orig;
    int fbd, line_size, x, y;
    uint32_t pixel; 
    long buffer_size;

    fbd = open("/dev/fb0", O_RDWR);

    ioctl ( fbd, FBIOGET_VSCREENINFO, &vinfo);
    ioctl ( fbd, FBIOGET_FSCREENINFO, &finfo);

    line_size = vinfo.xres * vinfo.bits_per_pixel / 8;
    buffer_size = finfo.smem_len; //line_size * vinfo.yres

    // Store for reset (copy vinfo to vinfo_orig)
    memcpy(&orig, &vinfo, sizeof(struct fb_var_screeninfo));

    // Change variable info
    vinfo.bits_per_pixel = 8;
    if (ioctl(fbd, FBIOPUT_VSCREENINFO, &vinfo)) {
        printf("Error setting variable information.\n");
    }

    screen_mem = mmap ( 0, buffer_size, PROT_READ | PROT_WRITE,
                                         MAP_SHARED, fbd, 0); 

    printf(" x :%d + y:%d + line:%d + struct:%d", vinfo.xres, vinfo.yres,
                                                    line_size, finfo.line_length );
    printf(" screen:%d \n", buffer_size);

    draw();

    sleep(2);

    if (ioctl(fbd, FBIOPUT_VSCREENINFO, &orig)) {
        printf("Error re-setting variable information.\n");
    }

    close(fbd);

    return 0;
}
