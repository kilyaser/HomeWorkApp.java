package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EighthLesson extends JFrame {
    int value;
    public EighthLesson( int initialValue){
        value = initialValue;
        setTitle("Test window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 300, 120);
        Font font = new Font("Arial", Font.BOLD,32);

       //  Изменить тип отображаемого значения счетчика на тестовое поле (JTextField).
        JTextField textField = new JTextField();
        textField.setFont(font);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        add(textField, BorderLayout.CENTER);
        JButton increaseButton = new JButton("+");
        JButton decreaseButton = new JButton("-");
        increaseButton.setFont(font);
        decreaseButton.setFont(font);
        add(decreaseButton, BorderLayout.WEST);
        add(increaseButton, BorderLayout.EAST);
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                //counterValue.setText(String.valueOf(value));
                textField.setText(String.valueOf(value));
            }
        });
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                //counterValue.setText(String.valueOf(value));
                textField.setText(String.valueOf(value));
            }
        });

       // Добавить возможность изменять значение счетчика во время работы приложения, с помощью ввода нового значения в текстовое поле и нажатию Enter.
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 value = Integer.parseInt(String.valueOf(textField.getText()));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new EighthLesson(0);

    }
}
