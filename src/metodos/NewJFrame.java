/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;
//Profesor Ruben 
/**
 *
 * @author Ruben
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        // Image ico = Toolkit.getDefaultToolkit().getImagen(ClassLoader.getSystemResource("img/ico.png"));
    }
    mVentas miData = null;
    int vend, mes, pos;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VendedorAño = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();
        VentaVendedor = new javax.swing.JButton();
        MesVenta = new javax.swing.JButton();
        VentaMes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VendedorAño.setBackground(new java.awt.Color(255, 255, 255));
        VendedorAño.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        VendedorAño.setForeground(new java.awt.Color(0, 0, 204));
        VendedorAño.setText("MEJOR VENDEDOR DEL AÑO");
        VendedorAño.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        VendedorAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendedorAñoActionPerformed(evt);
            }
        });
        getContentPane().add(VendedorAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 170, 34));

        Ventas.setBackground(new java.awt.Color(255, 255, 255));
        Ventas.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        Ventas.setForeground(new java.awt.Color(0, 0, 255));
        Ventas.setText("VENTAS");
        Ventas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        getContentPane().add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 100, 35));

        VentaVendedor.setBackground(new java.awt.Color(255, 255, 255));
        VentaVendedor.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        VentaVendedor.setForeground(new java.awt.Color(0, 51, 204));
        VentaVendedor.setText("VER VENTAS DEL VENDEDOR");
        VentaVendedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        VentaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(VentaVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 35));

        MesVenta.setBackground(new java.awt.Color(255, 255, 255));
        MesVenta.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        MesVenta.setForeground(new java.awt.Color(0, 51, 204));
        MesVenta.setText("MEJOR MES ");
        MesVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MesVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesVentaActionPerformed(evt);
            }
        });
        getContentPane().add(MesVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 170, 35));

        VentaMes.setBackground(new java.awt.Color(255, 255, 255));
        VentaMes.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        VentaMes.setForeground(new java.awt.Color(0, 51, 204));
        VentaMes.setText("VENTAS DE UN MES");
        VentaMes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        VentaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaMesActionPerformed(evt);
            }
        });
        getContentPane().add(VentaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 170, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/81305d3b1caebf9ccfd12fb79feca446.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(0, 51, 204));
        jMenu1.setText("Opciones");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("Agregar vendedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VendedorAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendedorAñoActionPerformed
        if (miData == null) {
            JOptionPane.showMessageDialog(null,
                    "Falta registar los datos!!");
        } else {
            pos = miData.getMejorVendorA();
            JOptionPane.showMessageDialog(null,
                    "El mejor vendedor del año es: " + pos
                    + ". Sus stocks fueron: " + miData.getVentasVendedor(pos));
        }
    }//GEN-LAST:event_VendedorAñoActionPerformed

    private void VentaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaVendedorActionPerformed
        if (miData == null) {
            JOptionPane.showMessageDialog(null,
                    "Falta registrar los datos!!");
        } else {
            vend = Integer.parseInt(JOptionPane.showInputDialog(
                    "Entre la posición del vendedor a consultar: "));
            if ((vend >= 0) && (vend < miData.nv)) {
                miData.getVentasdeUNVendedor(vend);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No existe esa posicion!");
            }
        }
    }//GEN-LAST:event_VentaVendedorActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        if (miData == null) {
            JOptionPane.showMessageDialog(null,
                    "Falta registrar los datos!!");
        } else {
            miData.getMostrarV();
        }
    }//GEN-LAST:event_VentasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        miData = new mVentas();
        miData.setLlenar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void VentaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaMesActionPerformed
        if (miData == null) {
            JOptionPane.showMessageDialog(null,
                    "Falta registrar los datos!!");
        } else {
            mes = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escriba el mes : "));
            if ((mes >= 0) && (mes < miData.nm)) {
                miData.getVentasdeUNMes(mes);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No existe ese mes!");
            }
        }
    }//GEN-LAST:event_VentaMesActionPerformed

    private void MesVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesVentaActionPerformed

        if (miData == null) {
            JOptionPane.showMessageDialog(null,
                    "Falta registrar esos datos!!");
        } else {
            pos = miData.getMejorMesV();
            JOptionPane.showMessageDialog(null,
                    "El mes con mas ventas es: " + pos
                    + ". Sus ventas fueron: " + miData.getVentasMes(pos));
        }
    }//GEN-LAST:event_MesVentaActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MesVenta;
    private javax.swing.JButton VendedorAño;
    private javax.swing.JButton VentaMes;
    private javax.swing.JButton VentaVendedor;
    private javax.swing.JButton Ventas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
