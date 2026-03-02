package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ejercicio_05 extends JDialog {
    private JPanel contentPane;
    private JLabel etiResltado;
    private JList lstNombres;
    private JButton btnCurso1;
    private JButton btnCurso2;
    private JButton btnVaciar;

    public ejercicio_05() {
        setContentPane(contentPane);
        setModal(true);
        btnCurso1.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<Object> modelo = new DefaultListModel<>();
                modelo.addElement("Juan");
                modelo.addElement("Mario");
                modelo.addElement("Carlos");
                lstNombres.setModel(modelo);

            }
        });
        btnCurso2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<Object> modelo = new DefaultListModel<>();
                modelo.addElement("Larry");
                modelo.addElement("Dora");
                modelo.addElement("Sonia");

                lstNombres.setModel(modelo);
            }
        });
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<Object> modelo = new DefaultListModel<>();
                lstNombres.setModel(modelo);
            }
        });
        lstNombres.addMouseListener(new MouseAdapter() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void mouseClicked(MouseEvent e) {
               etiResltado.setText(lstNombres.getSelectedValue().toString());
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_05 dialog = new ejercicio_05();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
