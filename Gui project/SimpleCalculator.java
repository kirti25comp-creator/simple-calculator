import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {

    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    SimpleCalculator() {

        // Labels
        Label l1 = new Label("First Number:");
        l1.setBounds(50, 50, 100, 30);
        add(l1);

        Label l2 = new Label("Second Number:");
        l2.setBounds(50, 100, 100, 30);
        add(l2);

        Label l3 = new Label("Result:");
        l3.setBounds(50, 150, 100, 30);
        add(l3);

        // TextFields
        t1 = new TextField();
        t1.setBounds(170, 50, 100, 30);
        add(t1);

        t2 = new TextField();
        t2.setBounds(170, 100, 100, 30);
        add(t2);

        t3 = new TextField();
        t3.setBounds(170, 150, 100, 30);
        add(t3);

        // Buttons
        b1 = new Button("+");
        b1.setBounds(50, 200, 50, 40);

        b2 = new Button("-");
        b2.setBounds(110, 200, 50, 40);

        b3 = new Button("*");
        b3.setBounds(170, 200, 50, 40);

        b4 = new Button("/");
        b4.setBounds(230, 200, 50, 40);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        // Action Listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        // Frame settings
        setSize(350, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(t1.getText());
        double num2 = Double.parseDouble(t2.getText());
        double result = 0;

        if (e.getSource() == b1)
            result = num1 + num2;

        if (e.getSource() == b2)
            result = num1 - num2;

        if (e.getSource() == b3)
            result = num1 * num2;

        if (e.getSource() == b4)
            result = num1 / num2;

        t3.setText("" + result);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
