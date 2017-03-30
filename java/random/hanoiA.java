// Author   : Apostolos Syropoulos
// Program  : Recursive Towers of hanoi
// Date     : November 16, 1997
//
import java.io.*;

public class hanoiA
{
  static int moves=0; //number of moves so far
       static int getInt()
       {
           String line;
           BufferedReader in = 
           new BufferedReader(new InputStreamReader(System.in)); 
           try
           {
              line = in.readLine();
              int i = Integer.valueOf(line).intValue();
              return i;
           }
           catch (Exception e)
           {
              System.err.println("***Error: Input is not a number.\n" +
                                 "Input assumed to be the number 1");
              return 1;
           }
       }

       static void hanoi(int   height,
                  char  fromPole,
                  char  toPole,
                  char  withPole)
       {
           if (height >= 1)
           {
              hanoi(height-1, fromPole, withPole, toPole); 
              moveDisk(fromPole, toPole);
              hanoi(height-1, withPole, toPole, fromPole);
           }
       }

       static void moveDisk(char fromPole, char toPole)
       {
            moves++;
            System.out.print(fromPole);
            System.out.print(toPole);
            System.out.print(((moves % 20)==0) ? '\n' : ' ');
       }

       public static void main(String[] args)
       {
            long time1, time2; //for benchmarking
            int TowerHeight;
            char FromPole='A', ToPole='B', WithPole='C';

            System.out.println("Enter Tower height...");
            System.out.print("?");
            TowerHeight = getInt();
            time1 = System.currentTimeMillis();
            hanoi(TowerHeight, FromPole, ToPole, WithPole);
            time2 = System.currentTimeMillis();
            System.out.println();
            System.out.print(time2-time1); //print execution time in msec
            System.out.println(" msec execution time");
       }

}

