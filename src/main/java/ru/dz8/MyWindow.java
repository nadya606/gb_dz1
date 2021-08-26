package ru.dz8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {
        setLocation(600,200);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton myFirstButton = new JButton("Нажми на меня");
        add(myFirstButton, BorderLayout.NORTH);

        JButton mySecondButton = new JButton("Назад");
        add(mySecondButton, BorderLayout.SOUTH);
        ActionListener myButtonListener = new CloseActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        };

        myFirstButton.addActionListener(myButtonListener);

        JPanel myPanel = new JPanel(new GridLayout(1, 2));
        myPanel.add(myFirstButton);
        myPanel.add(mySecondButton);

        add(myPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
