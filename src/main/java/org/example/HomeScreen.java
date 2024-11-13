package org.example;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HomeScreen {

    public void homeScreen() {

        //Declaring a Frame and Label
        Frame frame = new Frame("Home");
        Label label = new Label("HI");

        //creating an instance of a button
        Button button = new Button("Click Me");
        button.setBounds(80, 100, 64, 30);

        //adding the button to the frame
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("done");
            }
        });

        //Aligning the label to CENTER
        label.setAlignment(Label.CENTER);

        //Adding label and setting the size of the frame
        frame.add(label);
        frame.setSize(300,300);

        //making the frame visible
        frame.setVisible(true);

        //using WindowListener for closing the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }



}
