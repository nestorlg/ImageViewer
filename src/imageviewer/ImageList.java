/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ImageList {
    ArrayList<Imagen> images = new ArrayList<Imagen>();

    public ArrayList<Imagen> getImages() {
        return images;
    }
    
    public void addImage (Imagen i) {
        images.add(i);
    }
    
    public Imagen getImage (int i) {
        if (i >= 0 && i < this.images.size()) {
            return this.images.get(i);
        } else {
            return null;
        }
    }
    
    public int getSize () {
        return this.images.size();
    }
}
