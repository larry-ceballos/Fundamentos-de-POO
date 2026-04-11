package org.example;

import javax.swing.*;
import java.awt.*;

public class ejercicio_11 extends JDialog {
    private JPanel contentPane;
    private JMenu menuArchivo;
    private JMenu menuEdicion;
    private JMenu menuInsertar;
    private JMenuItem menuItemAbrir;
    private JMenuItem menuItemGuardar;
    private JMenuBar barraMenus;
    private JSeparator separador1;
    private JMenuItem menuItemSalir;
    private JMenuItem menuItemRojo;
    private JMenuItem menuItemVerde;
    private JMenuItem menuItemAzul;
    private JMenu menuColores;

    public ejercicio_11() {
        setContentPane(contentPane);
        setModal(true);

        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(separador1);
        menuArchivo.add(menuItemSalir);
        barraMenus.add(menuArchivo);

        menuEdicion.add(menuColores);
        menuColores.add(menuItemRojo);
        menuColores.add(menuItemVerde);
        menuColores.add(menuItemAzul);
        barraMenus.add(menuEdicion);

        barraMenus.add(menuInsertar);
        menuItemRojo.addActionListener(_ -> getContentPane().setBackground(Color.RED));
        menuItemVerde.addActionListener(_ -> getContentPane().setBackground(Color.GREEN));
        menuItemAzul.addActionListener(_ -> getContentPane().setBackground(Color.BLUE));

    }

    static void main(String[] args) {
        ejercicio_11 dialog = new ejercicio_11();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
