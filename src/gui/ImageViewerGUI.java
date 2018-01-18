/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import imageviewer.ImageViewer;
import imageviewer.ImageList;
import imageviewer.Imagen;
import static java.rmi.Naming.list;
import static java.util.Collections.list;

/**
 *
 * @author usuario
 */
public class ImageViewerGUI extends javax.swing.JFrame {
    
    public static ImageList list = new ImageList();

    /**
     * Creates new form ImageViewerGUI
     */
    int i = 0;
    boolean firstTime = true;
    boolean way = false;//true = avanzando;false = retrocediendo
    
    public ImageViewerGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        list = new ImageList();
        Imagen im1 = new Imagen(panel,"/imagenes/imagen1.jpg");
        Imagen im2 = new Imagen(panel,"/imagenes/imagen2.jpg");
        Imagen im3 = new Imagen(panel,"/imagenes/imagen3.jpg");
        Imagen im4 = new Imagen(panel,"/imagenes/imagen4.jpg");
        Imagen im5 = new Imagen(panel,"/imagenes/imagen5.jpg");
        Imagen im6 = new Imagen(panel,"/imagenes/imagen6.jpg");
        Imagen im7 = new Imagen(panel,"/imagenes/imagen7.jpg");
        Imagen im8 = new Imagen(panel,"/imagenes/imagen8.jpg");
        Imagen im9 = new Imagen(panel,"/imagenes/imagen9.jpg");
        Imagen im10 = new Imagen(panel,"/imagenes/imagen10.jpg");
        Imagen im11 = new Imagen(panel,"/imagenes/imagen11.jpg");
        Imagen im12 = new Imagen(panel,"/imagenes/imagen12.jpg");
        list.addImage(im1);
        list.addImage(im2);
        list.addImage(im3);
        list.addImage(im4);
        list.addImage(im5);
        list.addImage(im6);
        list.addImage(im7);
        list.addImage(im8);
        list.addImage(im9);
        list.addImage(im10);
        list.addImage(im11);
        list.addImage(im12);
        panel.add(list.getImage(0));
        panel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        back.setText("<");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(next))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        if (way == false) {
            for (int j = 1;j < list.getSize() - 1;j++) {
                i++;
                if (i == list.getSize()) {
                    i = 0;
                }
                panel.add(list.getImage(i));
                panel.repaint();
            }
            way = true;
        }
        if (firstTime == true) {
            i++;
            if (i == list.getSize()) {
                i = 0;
            }
            panel.add(list.getImage(i));
            panel.repaint();
            way = true;
            firstTime = false;
        }
        i++;
        if (i == list.getSize()) {
            i = 0;
        }
        panel.add(list.getImage(i));
        panel.repaint();
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        if (way == true) {
            for (int j = 1;j < list.getSize() - 1;j++) {
                i--;
                if (i == -1) {
                    i = list.getSize() - 1;
                }
                panel.add(list.getImage(i));
                panel.repaint();
            }
            way = false;
        }
        if (firstTime == true) {
            i--;
            if (i == -1) {
                i = list.getSize() - 1;
            }
            panel.add(list.getImage(i));
            panel.repaint();
            way = false;
            firstTime = false;
        }
        i--;
        if (i == -1) {
            i = list.getSize() - 1;
        }
        panel.add(list.getImage(i));
        panel.repaint();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ImageViewerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton next;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}