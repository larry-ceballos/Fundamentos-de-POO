package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio_07 extends JDialog {
    private JPanel contentPane;
    private JTextField txtPrecioBase;
    private JButton btnCalcular;
    private JLabel etiTotal;
    private JToggleButton tbtnInstalacion;
    private JToggleButton tbtnFormacion;
    private JToggleButton tbtnAlimentacionBD;
    private JLabel etiPrecioInstalacion;
    private JLabel etiPrecioFormacion;
    private JLabel etiPrecioAlimentacionBD;

    public ejercicio_07() {
        setContentPane(contentPane);
        setModal(true);
        tbtnInstalacion.setSelected(true);

        btnCalcular.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                double precio_base;
                double precio_install; //precio instalación
                double precio_for; //precio formación
                double precio_ali; //precio alimentación
                //Recojo datos desde la ventana:
                String textPrecioBase = txtPrecioBase.getText();
                precio_base = Double.parseDouble(
                        textPrecioBase.isEmpty() ? "0" : textPrecioBase
                );
                precio_install = Double.parseDouble(etiPrecioInstalacion.getText());
                precio_for = Double.parseDouble(etiPrecioFormacion.getText());
                precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
                //Ahora que tengo los datos, puedo hacer cálculos.
                //Al precio base se le van añadiendo precio de extras
                //según estén o no activados los JToggleButtons
                double precio_total;
                precio_total = precio_base;
                if (tbtnInstalacion.isSelected()) { //Sí se seleccionó instalación
                    precio_total = precio_total+ precio_install;
                }
                if (tbtnFormacion.isSelected()) { //Sí se seleccionó formación
                    precio_total = precio_total+precio_for;
                }
                if (tbtnAlimentacionBD.isSelected()) { //Sí se seleccionó Alimentación BD
                    precio_total = precio_total+precio_ali;
                }
                //Finalmente, pongo el resultado en la etiqueta
                etiTotal.setText(precio_total+" €");
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_07 dialog = new ejercicio_07();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
