import java.System.out;

public class HelloWorld {
  
  public static void main(String args[]) {
    Printer hp = new Printer("Hello World");
  }


}

class Printer {
  String toPrint;
  public Printer(String toPrint){
    this.toPrint = toPrint;
  }
  
  public void print(){
    out.print(toPrint+"\n");
  }
}
