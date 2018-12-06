
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class All_Functions extends JPanel implements ActionListener {

    JButton button[][] = new JButton[4][4];
    JTextField text;
    public String input_number;
    float numbers1, numbers2, num;
    char c;
    boolean result = false, float_used = false;

    All_Functions(JTextField text_f) {
        text = text_f;
        setLocation(10, 70);
        setSize(300, 300);
        setLayout(new GridLayout(4, 4));
        int s = 7;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                String character = null;
                String countt = Integer.toString(s);

                if (i == 0 && j == 3) {
                    countt = "/";
                    s = 3;
                }
                if (i == 1 && j == 3) {
                    countt = "*";
                    s = 0;
                }
                if (i == 2 && j == 3) {
                    countt = "-";
                }
                if (i == 0 && j == 0) {
                    s = 7;
                }
                if (i == 1 && j == 0) {
                    s = 4;
                }
                if (i == 2 && j == 0) {
                    s = 1;
                }
                button[i][j] = new JButton(countt);
                button[i][j].addActionListener(this);
                add(button[i][j]);
                s += 1;
            }
        }

        button[3][0] = new JButton(".");
        button[3][1] = new JButton("0");
        button[3][2] = new JButton("=");
        button[3][3] = new JButton("+");

        button[3][0].addActionListener(this);
        button[3][1].addActionListener(this);
        button[3][2].addActionListener(this);
        button[3][3].addActionListener(this);

        add(button[3][0]);
        add(button[3][1]);
        add(button[3][2]);
        add(button[3][3]);

    }

    public void functional_work() {
        if (c == '/') {
            num = numbers1 / numbers2;
            text.setText(Float.toString(num));
        }
        if (c == '-') {
            num = numbers1 - numbers2;
            text.setText(Float.toString(num));
        }
        if (c == '+') {
            num = numbers1 + numbers2;
            text.setText(Float.toString(num));
        }
        if (c == '*') {
            num = numbers1 * numbers2;
            text.setText(Float.toString(num));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button[0][0]) {
            if (result) {
                text.setText("");
                result = false;
            }
            input_number = text.getText() + "7";
            text.setText(input_number);

        }
        if (e.getSource() == button[0][1]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "8";
            text.setText(input_number);

        }
        if (e.getSource() == button[0][2]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "9";
            text.setText(input_number);

        }
        if (e.getSource() == button[1][0]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "4";
            text.setText(input_number);

        }
        if (e.getSource() == button[1][1]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "5";
            text.setText(input_number);

        }
        if (e.getSource() == button[1][2]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "6";
            text.setText(input_number);

        }
        if (e.getSource() == button[2][1]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "2";
            text.setText(input_number);

        }
        if (e.getSource() == button[2][2]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "3";
            text.setText(input_number);

        }
        if (e.getSource() == button[3][1]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "0";
            text.setText(input_number);

        }
        if (e.getSource() == button[2][0]) {
            if (result) {
                text.setText("");
                result = false;
            }

            input_number = text.getText() + "1";
            text.setText(input_number);

        }

        // float 
        if (e.getSource() == button[3][0]) {

            if (!float_used) {
                if (result) {
                    text.setText("");
                    result = false;
                }

                input_number = text.getText() + ".";
                text.setText(input_number);
                float_used = true;
            }
        }
        //division
        if (e.getSource() == button[0][3]) {
            if (result) {
                text.setText("");
                result = false;
                numbers1 = num;
                text.setText("");
            } else {
                text.setText("");
                numbers1 = Float.valueOf(input_number);
            }
            c = '/';
            float_used = false;
            System.out.println(numbers1);

        }
        //result
        if (e.getSource() == button[3][2]) {
            text.setText("");

            numbers2 = Float.valueOf(input_number);
            System.out.println(numbers1 + " " + numbers2);

            functional_work();

            float_used = false;
            result = true;
        }
        //summation
        if (e.getSource() == button[3][3]) {
            if (result) {
                text.setText("");
                result = false;
                numbers1 = num;
                text.setText("");
            } else {
                text.setText("");
                numbers1 = Float.valueOf(input_number);
            }
            c = '+';

            float_used = false;
            System.out.println(numbers1);

        }
        //substitution
        if (e.getSource() == button[2][3]) {
            if (result) {
                text.setText("");
                result = false;
                numbers1 = num;
                text.setText("");
            } else {
                text.setText("");
                numbers1 = Float.valueOf(input_number);
            }
            c = '-';

            float_used = false;
            System.out.println(numbers1);
        }

        //multyplication
        if (e.getSource() == button[1][3]) {
            if (result) {
                text.setText("");
                result = false;
                numbers1 = num;
                text.setText("");
            } else {
                text.setText("");
                numbers1 = Float.valueOf(input_number);
            }
            c = '*';

            float_used = false;
            System.out.println(numbers1);
        }
    }
}
