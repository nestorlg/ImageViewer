/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Imagen extends javax.swing.JPanel {
    int x, y;
    String path = "/imagenes/imagen1.jpg";
    public Imagen (JPanel panel,String path) {
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
        this.path = path;
    }
    
    public void paint(Graphics g) {
        ImageIcon img = new ImageIcon(getClass().getResource(this.path));
        g.drawImage(img.getImage(), 0, 0, x, y, null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
    public String getPath () {
        return this.path;
    }
}