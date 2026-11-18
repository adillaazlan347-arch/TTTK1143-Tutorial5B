import javax.swing.*;
import java.awt.*;
import java.awt.event.*;                                   // line 3

class MyJButton extends JFrame implements ActionListener {
    JLabel my_label = new JLabel();                        // line 6
    JButton my_button = new JButton("Display message");    // line 7

    public MyJButton() {
        Container pane = getContentPane();
        pane.setBackground(Color.white);
        pane.setLayout(new FlowLayout());

        pane.add(my_button);
        pane.add(my_label);                                // line 16
        my_button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        my_label.setText("Hi");                            // line 21
    }

    public static void main(String[] args) {
        MyJButton frame = new MyJButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // line 26
        frame.setTitle("My Frame");                           // line 27
        frame.setSize(300, 150);                              // line 28
        frame.setVisible(true);                               // line 29
    }
}
