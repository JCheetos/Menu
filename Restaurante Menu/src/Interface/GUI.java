/*
 * Menu.java
 * Copyright (c) 2018 Valentina Tobo 20172020063, Camilo Torres 20172020067, Johan Mendez 20172020070
 */
package Interface;

import java.util.ArrayList;
import restaurante.menu.Menu;
import restaurante.menu.logica.*;

/**
 * La clase GUI permite inicializar los objetos menu (Una ArrayList que contiene
 * los Platos del Menú del Restaurante), plato y componente, para usarlos a lo
 * largo del programa
 *
 * @author Valentina Uscategui Tobo - 20172020063
 * @author Camilo Torres Rodriguez - 20172020067
 * @author Johan Mendez Vega - 20172020070
 */
public class GUI extends javax.swing.JFrame {

    protected static ArrayList<Plato> menu = new ArrayList<Plato>();
    Plato plato;
    Componente componente;

    /**
     * Crea el nuevo GUI y le da un valor a plato
     */
    public GUI() {
        initComponents();
        plato = new Plato();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ensalada = new javax.swing.JButton();
        Carnes = new javax.swing.JButton();
        BebidaCaliente = new javax.swing.JButton();
        EnsaladaAd = new javax.swing.JButton();
        Galletas = new javax.swing.JButton();
        GuardarPlato = new javax.swing.JButton();
        Quesos = new javax.swing.JButton();
        Sopa = new javax.swing.JButton();
        Pastas = new javax.swing.JButton();
        Gaseosa = new javax.swing.JButton();
        Jugos = new javax.swing.JButton();
        Licor = new javax.swing.JButton();
        Extra = new javax.swing.JButton();
        Gelatina = new javax.swing.JButton();
        Helado = new javax.swing.JButton();
        Tortas = new javax.swing.JButton();
        EntradaLabel = new javax.swing.JLabel();
        PlatoFuerteLabel = new javax.swing.JLabel();
        BebidasLabel = new javax.swing.JLabel();
        AdicionesLabel = new javax.swing.JLabel();
        PostreLabel = new javax.swing.JLabel();
        NombrePlato = new javax.swing.JTextField();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPlatos = new javax.swing.JTextArea();
        TextoParaElCapa8 = new javax.swing.JLabel();
        ReiniciarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(571, 361));
        setMinimumSize(new java.awt.Dimension(571, 361));
        setSize(new java.awt.Dimension(571, 361));

        Ensalada.setText("Ensalada");
        Ensalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnsaladaActionPerformed(evt);
            }
        });

        Carnes.setText("Carnes");
        Carnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarnesActionPerformed(evt);
            }
        });

        BebidaCaliente.setText("Bebida Caliente");
        BebidaCaliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BebidaCalienteActionPerformed(evt);
            }
        });

        EnsaladaAd.setText("Ensalada");
        EnsaladaAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnsaladaAdActionPerformed(evt);
            }
        });

        Galletas.setText("Galletas");
        Galletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GalletasActionPerformed(evt);
            }
        });

        GuardarPlato.setText("Guardar Plato");
        GuardarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPlatoActionPerformed(evt);
            }
        });

        Quesos.setText("Quesos");
        Quesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuesosActionPerformed(evt);
            }
        });

        Sopa.setText("Sopa");
        Sopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SopaActionPerformed(evt);
            }
        });

        Pastas.setText("Pastas");
        Pastas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastasActionPerformed(evt);
            }
        });

        Gaseosa.setText("Gaseosa");
        Gaseosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaseosaActionPerformed(evt);
            }
        });

        Jugos.setText("Jugos");
        Jugos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugosActionPerformed(evt);
            }
        });

        Licor.setText("Licor");
        Licor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LicorActionPerformed(evt);
            }
        });

        Extra.setText("Extra");
        Extra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraActionPerformed(evt);
            }
        });

        Gelatina.setText("Gelatina");
        Gelatina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GelatinaActionPerformed(evt);
            }
        });

        Helado.setText("Helado");
        Helado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeladoActionPerformed(evt);
            }
        });

        Tortas.setText("Tortas");
        Tortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TortasActionPerformed(evt);
            }
        });

        EntradaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntradaLabel.setText("Entrada");

        PlatoFuerteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlatoFuerteLabel.setText("Plato Fuerte");

        BebidasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BebidasLabel.setText("Bebidas");

        AdicionesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdicionesLabel.setText("Adiciones");

        PostreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PostreLabel.setText("Postre");

        NombrePlato.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        NombrePlato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombrePlato.setText("Nombre del Plato");
        NombrePlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePlatoActionPerformed(evt);
            }
        });

        ListaPlatos.setColumns(20);
        ListaPlatos.setRows(5);
        ListaPlatos.setText("Lista de Platos: ");
        jScrollPane1.setViewportView(ListaPlatos);

        TextoParaElCapa8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        TextoParaElCapa8.setText("Ingrese nombre para el nuevo plato del menú:");

        ReiniciarMenu.setText("Reiniciar Menu");
        ReiniciarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(TextoParaElCapa8)
                .addGap(18, 18, 18)
                .addComponent(NombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Ensalada, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(Quesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Sopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Carnes, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(Pastas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(EntradaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PlatoFuerteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BebidasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gaseosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BebidaCaliente, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(Jugos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Licor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdicionesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnsaladaAd, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Extra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Tortas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Helado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Gelatina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PostreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Galletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separador2)
                            .addComponent(Separador1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(GuardarPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ReiniciarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoParaElCapa8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BebidasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PostreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlatoFuerteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ensalada)
                    .addComponent(Carnes)
                    .addComponent(BebidaCaliente)
                    .addComponent(EnsaladaAd)
                    .addComponent(Galletas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quesos)
                    .addComponent(Pastas)
                    .addComponent(Gaseosa)
                    .addComponent(Gelatina)
                    .addComponent(Extra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jugos)
                    .addComponent(Helado)
                    .addComponent(Sopa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Licor)
                    .addComponent(Tortas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GuardarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReiniciarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombrePlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePlatoActionPerformed

    private void GuardarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPlatoActionPerformed
        Menu.agregarPlato(menu, plato, NombrePlato.getText());
        plato = new Plato();
        NombrePlato.setText("Nombre del Plato");
        ListaPlatos.setText("Lista de Platos: \n \n" + Menu.listarPlatos(menu));
    }//GEN-LAST:event_GuardarPlatoActionPerformed

    private void EnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnsaladaActionPerformed
        Menu.agregarComponente(plato, componente, "Ensalada");
    }//GEN-LAST:event_EnsaladaActionPerformed

    private void QuesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuesosActionPerformed
        Menu.agregarComponente(plato, componente, "Quesos");
    }//GEN-LAST:event_QuesosActionPerformed

    private void SopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SopaActionPerformed
        Menu.agregarComponente(plato, componente, "Sopa");
    }//GEN-LAST:event_SopaActionPerformed

    private void CarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarnesActionPerformed
        Menu.agregarComponente(plato, componente, "Carnes");
    }//GEN-LAST:event_CarnesActionPerformed

    private void PastasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastasActionPerformed
        Menu.agregarComponente(plato, componente, "Pastas");
    }//GEN-LAST:event_PastasActionPerformed

    private void BebidaCalienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BebidaCalienteActionPerformed
        Menu.agregarComponente(plato, componente, "BebidaCaliente");
    }//GEN-LAST:event_BebidaCalienteActionPerformed

    private void GaseosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaseosaActionPerformed
        Menu.agregarComponente(plato, componente, "Gaseosa");
    }//GEN-LAST:event_GaseosaActionPerformed

    private void JugosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugosActionPerformed
        Menu.agregarComponente(plato, componente, "Jugo");
    }//GEN-LAST:event_JugosActionPerformed

    private void LicorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicorActionPerformed
        Menu.agregarComponente(plato, componente, "Licor");
    }//GEN-LAST:event_LicorActionPerformed

    private void EnsaladaAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnsaladaAdActionPerformed
        Menu.agregarComponente(plato, componente, "EnsaladaAd");
    }//GEN-LAST:event_EnsaladaAdActionPerformed

    private void ExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraActionPerformed
        Menu.agregarComponente(plato, componente, "Extra");
    }//GEN-LAST:event_ExtraActionPerformed

    private void GalletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GalletasActionPerformed
        Menu.agregarComponente(plato, componente, "Galletas");
    }//GEN-LAST:event_GalletasActionPerformed

    private void GelatinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GelatinaActionPerformed
        Menu.agregarComponente(plato, componente, "Gelatinas");
    }//GEN-LAST:event_GelatinaActionPerformed

    private void HeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeladoActionPerformed
        Menu.agregarComponente(plato, componente, "Helado");
    }//GEN-LAST:event_HeladoActionPerformed

    private void TortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TortasActionPerformed
        Menu.agregarComponente(plato, componente, "Tortas");
    }//GEN-LAST:event_TortasActionPerformed

    private void ReiniciarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarMenuActionPerformed
        menu = new ArrayList<Plato>();
        ListaPlatos.setText("Lista de Platos:");
    }//GEN-LAST:event_ReiniciarMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y visualiza el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdicionesLabel;
    private javax.swing.JButton BebidaCaliente;
    private javax.swing.JLabel BebidasLabel;
    private javax.swing.JButton Carnes;
    private javax.swing.JButton Ensalada;
    private javax.swing.JButton EnsaladaAd;
    private javax.swing.JLabel EntradaLabel;
    private javax.swing.JButton Extra;
    private javax.swing.JButton Galletas;
    private javax.swing.JButton Gaseosa;
    private javax.swing.JButton Gelatina;
    private javax.swing.JButton GuardarPlato;
    private javax.swing.JButton Helado;
    private javax.swing.JButton Jugos;
    private javax.swing.JButton Licor;
    private javax.swing.JTextArea ListaPlatos;
    private javax.swing.JTextField NombrePlato;
    private javax.swing.JButton Pastas;
    private javax.swing.JLabel PlatoFuerteLabel;
    private javax.swing.JLabel PostreLabel;
    private javax.swing.JButton Quesos;
    private javax.swing.JButton ReiniciarMenu;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JButton Sopa;
    private javax.swing.JLabel TextoParaElCapa8;
    private javax.swing.JButton Tortas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
