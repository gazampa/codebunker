public class MainClass {
  enum Mconfig { Choice1, Choice2, Choice3 }
  public static void main(String[] args) {
    Mconfig ch = Mconfig.Choice1;

    switch(ch) {
      case Choice1:
        System.out.println("Choice1 selected");
        break;
     case Choice2:
       System.out.println("Choice2 selected");
       break;
     case Choice3:
       System.out.println("Choice3 selected");
       break;
    }
  }
}