import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setLayout(new FlowLayout());
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        myFrame.add(male);
        myFrame.add(female);
        myFrame.pack();


        myFrame.setTitle("radioButtons");
        myFrame.setVisible(true);



    }
}