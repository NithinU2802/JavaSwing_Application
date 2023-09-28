
package sampleapplication;
import java.util.Scanner;

public class SampleApplication {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.println("Enter Your Name: ");
    String name=x.nextLine();
    System.out.println("Hello, "+name);
   // SampleForm mainFrame=new SampleForm();
   MainFrame mainFrame=new MainFrame();
    mainFrame.init(name);
    }
    
}
