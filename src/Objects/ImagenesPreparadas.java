/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Isaac Gimenez
 */
public class ImagenesPreparadas {
    
    String imagenPrincipal;
    String imagenesSecundarias;

    public ImagenesPreparadas(String imagenPrincipal, String imagenesSecundarias) {
        this.imagenPrincipal = imagenPrincipal;
        this.imagenesSecundarias = imagenesSecundarias;
    }

    public String getImagenPrincipal() {
        return imagenPrincipal;
    }

    public void setImagenPrincipal(String imagenPrincipal) {
        this.imagenPrincipal = imagenPrincipal;
    }

    public String getImagenesSecundarias() {
        return imagenesSecundarias;
    }

    public void setImagenesSecundarias(String imagenesSecundarias) {
        this.imagenesSecundarias = imagenesSecundarias;
    }
    
    
}
