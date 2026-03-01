package org.example;

import javax.swing.*;

public class ejercicio_01 extends JDialog {
    private JPanel contentPane;


    public ejercicio_01() {
        setContentPane(contentPane);
        setModal(true);
    }

    public static void main(String[] args) {
        ejercicio_01 dialog = new ejercicio_01();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
