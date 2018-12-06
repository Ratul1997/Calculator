
import java.awt.ComponentOrientation;
import javax.swing.*;
public class Calculator {

    JFrame frame;
    JPanel panel = new JPanel();
    JTextField text;
    Calculator(){
        frame= new JFrame();
        
        frame.setTitle("My Counting App");
        frame.setSize(330,410);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLayout(null);
        
        String get_input="0";
        text= new JTextField("",30);
        text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        All_Functions a= new All_Functions(text);
        
        text.setBounds(10,10,300,50);
        frame.add(text);
        frame.add(panel);
        frame.add(a);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
          try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        new Calculator();
    }
    
}
