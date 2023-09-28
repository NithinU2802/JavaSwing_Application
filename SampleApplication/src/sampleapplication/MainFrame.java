package sampleapplication;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
    public void init(String name){
        setTitle("WELCOME "+name);
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
