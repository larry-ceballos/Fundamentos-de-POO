package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio_12 extends JDialog {
    private JPanel contentPane;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    public ejercicio_12() {
        setContentPane(contentPane);
        setModal(true);
        btn1.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Activaste el botón uno");
            }
        });
    }

    static void main(String[] args) {
        ejercicio_12 dialog = new ejercicio_12();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
