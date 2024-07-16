import java.applet.Applet;
import java.awt.*;
import java.lang.*;

public class Impact extends Applet {
 private TextField impactNumTF;
 private TextField[] guessTFs;
 private Button impactBttn;
 private Button resultsBttn;
 private final Font smallRomanFont=new Font("TimesNewRoman",Font.BOLD,10);
 private final Font romanFont=new Font("TimesNewRoman",Font.BOLD,14);
 private final Font courierFont=new Font("Courier",Font.BOLD,14);
 private final Font normalFont=new Font("TimesNewRoman",Font.PLAIN,12);
 private final Font bigFont=new Font("Courier",Font.BOLD,50);
 private Impactor[] impactor; 
 private int numOfImpactors=500;
 private int[] categoriesCount = new int[6];
 private int[] guesses = new int[6];
 private int[] errors = new int[6];
 private boolean impactorsInitialized=false;
 private boolean distributionRepaint=false;
 private Image mainOffScreenImage;
 private Graphics mainOffScreenG;
 private Image[] offScreenImage1, offScreenImage2;
 private Graphics[] offScreenG1, offScreenG2;
 private Image invImage, errImage;
 private Graphics invOffScreenG, errOffScreenG;
 private final int WIDTH=600, HEIGHT=400;

 public void init() {
   this.resize(WIDTH, HEIGHT);
   this.setLayout(null);                              
   impactNumTF = new TextField("500");
   impactBttn = new Button("New Impact");
   resultsBttn = new Button("Distribution");
   guessTFs = new TextField[6];
   for (int i=0; i<guessTFs.length; i++) {
     guessTFs[i]=new TextField();
     guessTFs[i].setFont(smallRomanFont);
   }  

   impactNumTF.setFont(courierFont);
   impactBttn.setFont(romanFont);
   resultsBttn.setFont(romanFont);

   add(impactNumTF);
   add(impactBttn);
   add(resultsBttn);
   for (int i=0; i<guessTFs.length; i++)
     add(guessTFs[i]);

   impactNumTF.reshape(528,60,57,25);
   impactBttn.reshape(385,115,90,30);
   resultsBttn.reshape(485,115,90,30);
   for (int i=0; i<guessTFs.length; i++) {
      guessTFs[i].reshape(437,197+23*i,44,18);
      guessTFs[i].disable();
   }      
      
      
 }  


 public void paint(Graphics g) {

     g.setColor(Color.lightGray);
     g.fillRect(0,0,WIDTH,HEIGHT);
     
     g.setFont(bigFont);
     String s="Impact!";
     EngravedText.draw(g,s,200,35,true);
    
     g.setColor(Color.gray);
     g.drawLine(365,50,595,50);
     g.drawLine(365,50,365,380);
     g.drawLine(595,50,595,380);
     g.drawLine(365,379,595,379);
     g.setColor(Color.white);
     g.drawLine(366,51,594,51);
     g.drawLine(366,51,366,379);
     g.drawLine(596,50,596,380);
     g.drawLine(366,380,595,380);
 
     g.setFont(romanFont);
     g.setColor(Color.black);                           
     EngravedText.draw(g,"Number of Impactors",375,75,false);
    
     g.setColor(Color.gray);
     g.drawLine(400,98,560,98);
     g.drawLine(400,159,560,159);
     g.setColor(Color.white);
     g.drawLine(400,99,560,99);
     g.drawLine(400,160,560,160);
     
     g.setColor(Color.black);
     g.setFont(normalFont);
     g.drawString("Categories",373,188);
     g.drawString("Guess",440,188);
     g.drawString("Distribution",487,188);
     g.drawString("Errors",555,188);
                             
     g.setColor(Color.gray);     
     g.drawLine(371,175,590,175);
     g.drawLine(371,193,590,193);
     g.drawLine(371,175,371,332);
     g.drawLine(590,175,590,332);                   
     g.drawLine(436,175,436,332);   
     g.drawLine(482,175,482,332);     
     g.drawLine(552,175,552,332);
     g.drawLine(371,332,590,332);
     g.drawLine(371,217,590,217);
     g.drawLine(371,240,590,240);
     g.drawLine(371,263,590,263);
     g.drawLine(371,286,590,286);
     g.drawLine(371,309,590,309);
  
     g.setColor(Color.blue);
     g.drawString("1 (blue)",382,209);
     g.setColor(Color.yellow);
     g.drawString("2 (yellow)",378,232);
     g.setColor(Color.red);
     g.drawString("3 (red)",384,255);
     g.setColor(Color.cyan);
     g.drawString("4 (cyan)",382,278);
     g.setColor(Color.white);
     g.drawString("5 (white)",380,301);                           
     g.setColor(Color.green);
     g.drawString("6 (green)",380,324);
    
     g.setColor(Color.black);          
     g.setFont(romanFont);
     EngravedText.draw(g,"Valid Guesses    ",390,353,false);
     EngravedText.draw(g,"Average Error    ",390,373,false);  
          
     update(g);
 } 

 public void update(Graphics g) {
   if(mainOffScreenImage == null) {
        mainOffScreenImage = createImage(350,330);
        mainOffScreenG = mainOffScreenImage.getGraphics();
        offScreenImage1 = new Image[6];
        offScreenImage2 = new Image[6];
        offScreenG1 = new Graphics[6];
        offScreenG2 = new Graphics[6];
        for(int i=0; i<offScreenImage1.length; i++) {
           offScreenImage1[i] = createImage(40,17);
           offScreenImage2[i] = createImage(35,17);
           offScreenG1[i] = offScreenImage1[i].getGraphics();
           offScreenG2[i] = offScreenImage2[i].getGraphics();
        }   
        invImage = createImage(90,15);
        invOffScreenG = invImage.getGraphics();
        errImage = createImage(90,15);
        errOffScreenG = errImage.getGraphics();
   }
  
   mainOffScreenG.setColor(Color.gray);
   mainOffScreenG.fill3DRect(0,0,350,330,true);    
   if(impactorsInitialized) { drawImpactors(mainOffScreenG); }   
      
   for(int i=0; i<offScreenG1.length; i++) {
     offScreenG1[i].setColor(Color.lightGray);
     offScreenG2[i].setColor(Color.lightGray);
     offScreenG1[i].setFont(normalFont);
     offScreenG2[i].setFont(normalFont);
     offScreenG1[i].fillRect(0,0,40,17);
     offScreenG2[i].fillRect(0,0,35,17);
   }  
          
   invOffScreenG.setColor(Color.lightGray);
   errOffScreenG.setColor(Color.lightGray);  
   invOffScreenG.setFont(courierFont);
   errOffScreenG.setFont(courierFont);
   invOffScreenG.fillRect(0,0,90,15); 
   errOffScreenG.fillRect(0,0,90,15);
   
   if(distributionRepaint) {
     for(int i=0; i<offScreenG1.length; i++) { 
        drawDistribution(offScreenG1[i],i);
        drawErrors(offScreenG2[i],i);
     } 
     drawValid(invOffScreenG);
     drawAverage(errOffScreenG);  
   }
  
 
   for(int i=0; i<offScreenImage1.length; i++) {
      g.drawImage(offScreenImage1[i],502,199+23*i,this);
      g.drawImage(offScreenImage2[i],554,199+23*i,this);
   }   
   
   g.drawImage(invImage,500,343,this);
   g.drawImage(errImage,500,363,this);   
   g.drawImage(mainOffScreenImage,10,50,this);

 }


 public boolean action(Event evt, Object what) {
   if(evt.target==impactBttn) {
     getNumOfImpactors(); 
     Distribution.init();
     createImpactors();
     enableGuessesTFs();
     resetGuessesTFs();
     guessTFs[0].requestFocus();
     distributionRepaint=false;
     repaint();
   }   
   else if(evt.target==resultsBttn) {
     getGuesses();
     calculateErrors();
     disableGuessesTFs();
     distributionRepaint=true;
     repaint();
   }
   else if(evt.target==impactNumTF) {
     getNumOfImpactors();
   }

   else if(evt.target==guessTFs[0]) guessTFs[1].requestFocus();  
   else if(evt.target==guessTFs[1]) guessTFs[2].requestFocus(); 
   else if(evt.target==guessTFs[2]) guessTFs[3].requestFocus();  
   else if(evt.target==guessTFs[3]) guessTFs[4].requestFocus();      
   else if(evt.target==guessTFs[4]) guessTFs[5].requestFocus();
   
   return super.action(evt,what);
 }

 private void getNumOfImpactors() {
    String s=impactNumTF.getText();
      try { 
        if( (Integer.parseInt(s)>=0) && (Integer.parseInt(s)<=9999) )
           numOfImpactors=Integer.parseInt(s);
        else impactNumTF.setText(""+numOfImpactors);   
      }
      catch(NumberFormatException e) { impactNumTF.setText(""+numOfImpactors); }
 } 

 private void createImpactors() {
   if(!impactorsInitialized)
     impactorsInitialized=true;
   initCategoriesCount();
   impactor = new Impactor[numOfImpactors];
   for(int i=0; i<numOfImpactors; i++) {
      impactor[i] = new Impactor();

      if(impactor[i].getCategory()==Categories.ONE)
         categoriesCount[0]++;
      else if(impactor[i].getCategory()==Categories.TWO)
         categoriesCount[1]++; 
      else if(impactor[i].getCategory()==Categories.THREE)
         categoriesCount[2]++;
      else if(impactor[i].getCategory()==Categories.FOUR)
         categoriesCount[3]++;
      else if(impactor[i].getCategory()==Categories.FIVE)
         categoriesCount[4]++;
      else if(impactor[i].getCategory()==Categories.SIX)
         categoriesCount[5]++;
   }
 }

 private void initCategoriesCount() {
   for(int i=0; i<6; i++) {
     categoriesCount[i] = 0;
   }
 }

 private void drawImpactors(Graphics g) {
   for(int i=0; i<numOfImpactors; i++) {
     impactor[i].draw(g); 
   }
 }

 private void drawDistribution(Graphics g, int i) {
   g.setColor(Color.black);
   if((categoriesCount[i]>=0) && (categoriesCount[i]<=9))
      g.drawString(""+categoriesCount[i],10,11);
   else if((categoriesCount[i]>=10) && (categoriesCount[i]<=99))  
      g.drawString(""+categoriesCount[i],7,11);
   else if((categoriesCount[i]>=100) && (categoriesCount[i]<=999))
      g.drawString(""+categoriesCount[i],4,11);
   else if((categoriesCount[i]>=1000) && (categoriesCount[i]<=9999))
      g.drawString(""+categoriesCount[i],1,11);   
 }   

 private void drawErrors(Graphics g, int i) { 
   g.setColor(Color.black);
   if(errors[i]!=BadData.BAD) {
     if((errors[i]>=0) && (errors[i]<=9))
       g.drawString(errors[i]+"%",8,11);
     else if((errors[i]>=10) && (errors[i]<=99))
       g.drawString(errors[i]+"%",5,11);
     else g.drawString(errors[i]+"%",1,11);
   }  
  
 }
 
 private void drawValid(Graphics g) {
     g.setColor(Color.black);
     g.drawString(""+numberOfValidGuesses(),1,11);
 }
 
 private void drawAverage(Graphics g) {     
     int avError = averageError();
     g.setColor(Color.black);
     if(avError!=BadData.BAD) 
        g.drawString(""+avError+"%",1,11);
  }

 private int numberOfValidGuesses() {
    int number=0;
    for(int i=0; i<guesses.length; i++) {
      if (guesses[i]!=BadData.BAD)
        number++;
    }    
    return number;
 }   

 private int averageError() {
    int sum = 0;
    for(int i=0; i<errors.length; i++) {
      if(errors[i]!=BadData.BAD)
         sum = sum + Math.abs(errors[i]);
    }
    int valid = numberOfValidGuesses();
    if(valid == 0)  return BadData.BAD;
       else return Math.round(sum/(float)valid);
         
 }   

 private void resetGuessesTFs() {
   for(int i=0; i<guessTFs.length; i++) {
     guessTFs[i].setText("");
   }
 }    
 
 private void disableGuessesTFs() {
   for(int i=0; i<guessTFs.length; i++) {
     guessTFs[i].disable();
   }
 }
 
 private void enableGuessesTFs() {
   for(int i=0; i<guessTFs.length; i++) {
     guessTFs[i].enable();
   }
 }
 
 
 private void getGuesses() {
   for(int i=0; i<guessTFs.length; i++) {
     String s=guessTFs[i].getText();
      try { 
        if( (Integer.parseInt(s)>=0) && 
            (Integer.parseInt(s)<=numOfImpactors))
           guesses[i]=Integer.parseInt(s);
        else guesses[i]=BadData.BAD;   
      }
      catch(NumberFormatException e) { guesses[i]=BadData.BAD; }
   } 
 }  
    
 private void calculateErrors() {
   for(int i=0; i<guesses.length; i++) {
     if(guesses[i]==BadData.BAD) 
       errors[i]=BadData.BAD;
     else 
        errors[i]=(int)(Math.round((guesses[i]-categoriesCount[i])
                                      *100/(float)categoriesCount[i]));
                               
     
   }
 }

}

