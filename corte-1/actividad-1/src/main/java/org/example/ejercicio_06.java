package org.example;

import javax.swing.*;

public class ejercicio_06 extends JDialog {
    private JPanel contentPane;

    public ejercicio_06() {
        setContentPane(contentPane);
        setModal(true);
    }

    public static void main(String[] args) {
        ejercicio_06 dialog = new ejercicio_06();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
