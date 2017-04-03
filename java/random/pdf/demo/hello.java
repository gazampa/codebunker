/* $Id: hello.java,v 1.19 2004/05/17 12:58:14 rp Exp $
 *
 * PDFlib client: hello example in Java
 */

import java.io.*;
import com.pdflib.pdflib;
import com.pdflib.PDFlibException;

public class hello
{
    public static void main (String argv[])
    {
	int font;
	pdflib p = null;

	String dummyText="Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Etiam posuere leo a quam. Aenean non dui id nibh fermentum rhoncus. Ut feugiat, felis sed dignissim elementum, nisi lectus placerat mauris, quis lobortis eros lacus ut nibh. Etiam semper augue vel purus. Etiam gravida dictum sem. Praesent varius. Aliquam erat volutpat. Pellentesque hendrerit condimentum lorem. In vestibulum magna quis neque. Cras sem. Pellentesque lectus est, fringilla sed, pretium id, suscipit vitae, quam. Nunc elit mauris, molestie in, sodales eget, laoreet ac, odio. Nam sed orci. Nulla facilisi. Fusce tempus nunc eget mauris.";
	String dummyText2="Maecenas augue purus, venenatis at, ullamcorper in, egestas a, nisl. Vivamus justo sapien, pretium ac, tincidunt sit amet, ornare id, turpis. Vestibulum non sapien nec est faucibus ultrices. Maecenas ligula lorem, aliquet eget, commodo nec, tempus quis, est. Fusce vitae felis vitae ante venenatis egestas. Integer vel erat id nunc accumsan placerat. Aliquam erat volutpat. Pellentesque blandit venenatis arcu. Vivamus accumsan.  Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos.";
	String optlist="",optlist2="";
	int textflow=-1, textflow2=-1;
	final float lowerleftx = 55;
	final float lowerlefty = 400;
	final float upperrightx = 530;
	final float upperrighty=670;
	float fontsize=14;
	float leading=18;
	float leading2=36;

	try{
	    p = new pdflib();

	    if (p.begin_document("pdf_example.pdf", "") == -1) {
		throw new Exception("Error: " + p.get_errmsg());
	    }

            p.set_info("Creator", "hello.java");
            p.set_info("Author", "Billy Murphy");
            p.set_info("Title", "Line spacing Example");

            p.begin_page_ext(595, 842, ""); /* start a new page     */

            font = p.load_font("Helvetica-Bold", "unicode", "");

            p.setfont(font, fontsize);

            p.set_value("leading", leading);

            p.set_text_pos(50, 700);
            p.show("PDF Example");
            p.continue_text("Single Line Spacing");

            //##########################First Paragraph####################################
            optlist = "fontsize 12 font " + font + " leading " + leading;
            textflow = p.create_textflow(dummyText, optlist);

            if ( textflow== -1){
                throw new Exception("Error : " + p.get_errmsg());
            }
            p.fit_textflow(textflow, lowerleftx, lowerlefty-leading, upperrightx, upperrighty-leading, "");

            System.out.print( "First Spacing : "+ p.info_textflow(textflow,"leading") +"\n");

            p.delete_textflow(textflow);

            //##########################Second Paragraph####################################

            p.set_value("leading", leading2);

            p.set_text_pos(50, 700-leading-218);
            p.show("PDF Example");
            p.continue_text("Double Line Spacing");

            optlist2 = "fontsize 12 font " + font + " leading " + leading2;
            textflow2 = p.create_textflow(dummyText2, optlist2);

            if ( textflow2== -1){
                throw new Exception("Error : " + p.get_errmsg());
            }
            p.fit_textflow(textflow2, lowerleftx, lowerlefty-leading-236, upperrightx, upperrighty-leading-236, "");

            System.out.print( "Second Spacing : "+p.info_textflow(textflow2,"leading") +"\n\n" );
            p.delete_textflow(textflow2);

            //#############################Close Document#####################################
            p.end_page_ext("");         /* close page           */

            p.end_document("");         /* close PDF document   */
        } catch (PDFlibException e) {
	    System.err.print("PDFlib exception occurred in hello sample:\n");
	    System.err.print("[" + e.get_errnum() + "] " + e.get_apiname() +
			    ": " + e.get_errmsg() + "\n");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (p != null) {
		p.delete();
            }
        }
    }
}