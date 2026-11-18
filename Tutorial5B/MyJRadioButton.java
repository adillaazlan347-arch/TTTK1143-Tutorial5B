import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJRadioButton extends JFrame implements ActionListener {
    JRadioButton my_button1 = new JRadioButton("Blue");
    JRadioButton my_button2 = new JRadioButton("Green");
    JRadioButton my_button3 = new JRadioButton("Red");
    JRadioButton my_button4 = new JRadioButton("Yellow");   // NEW

    JLabel selection = new JLabel("You have selected:", JLabel.CENTER);

    public MyJRadioButton() {
        Container pane = getContentPane();
        pane.setBackground(Color.white);
        pane.setLayout(new BorderLayout());

        // Top panel: title + radio buttons
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.setBackground(Color.white);
        topPanel.add(new JLabel("Select your MOST favourite color:", JLabel.CENTER));

        JPanel radioPanel = new JPanel(new FlowLayout());
        radioPanel.setBackground(Color.white);
        my_button1.setBackground(Color.white);
        my_button2.setBackground(Color.white);
        my_button3.setBackground(Color.white);
        my_button4.setBackground(Color.white);

        radioPanel.add(my_button1);
        radioPanel.add(my_button2);
        radioPanel.add(my_button3);
        radioPanel.add(my_button4);
        topPanel.add(radioPanel);

        // ButtonGroup -> only ONE radio button can be selected at a time
        ButtonGroup btn_group = new ButtonGroup();
        btn_group.add(my_button1);
        btn_group.add(my_button2);
        btn_group.add(my_button3);
        btn_group.add(my_button4);

        my_button1.addActionListener(this);
        my_button2.addActionListener(this);
        my_button3.addActionListener(this);
        my_button4.addActionListener(this);

        pane.add(topPanel, BorderLayout.NORTH);
        pane.add(selection, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        String input = "";

        if (my_button1.isSelected())
            input = my_button1.getText();
        else if (my_button2.isSelected())
            input = my_button2.getText();
        else if (my_button3.isSelected())
            input = my_button3.getText();
        else if (my_button4.isSelected())
            input = my_button4.getText();

        selection.setText("You have selected:  " + input);
    }

    public static void main(String[] args) {
        MyJRadioButton frame = new MyJRadioButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Frame");
        frame.setSize(350, 200);
        frame.setVisible(true);
    }
}
