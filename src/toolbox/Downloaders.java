/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Isaac Gimenez
 */
public class Downloaders {
    
    public static Parametros PARAM = new Parametros();
    
    public void descargaGlobal () {
        try {
            URL url = new URL(PARAM.getURL_Global());
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(PARAM.getRutaLocal_Global());
 
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }
 
            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Ha fallado:");
            System.out.println(e);
        }
    }
    
    public void descargaCamposGlobal() {
        try {
            URL url = new URL(PARAM.getURL_CamposGlobal());
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(PARAM.getRutaLocal_CamposGlobal());
 
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }
 
            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Ha fallado:");
            System.out.println(e);
        }
    }
    
    public void descargarImagen(String urlImagen, String rutaLocalCompleta) {
        try {
            // Condicion para evitar el fallo cuando "Sin Imagen"
            if (!"Sin Imagen".equals(urlImagen)) {
                URL url = new URL(urlImagen);
                URLConnection urlCon = url.openConnection();
                InputStream is = urlCon.getInputStream();
                FileOutputStream fos = new FileOutputStream(rutaLocalCompleta);

                byte[] array = new byte[1000]; // buffer temporal de lectura.
                int leido = is.read(array);
                while (leido > 0) {
                    fos.write(array, 0, leido);
                    leido = is.read(array);
                }
                // cierre de conexion y fichero.
                is.close();
                fos.close();
            }
        } catch (Exception e) {
            System.out.println("Ha fallado:");
            System.out.println(e);
        }                
    }
    
    public void descargarImagenPrueba(String urlImagen, String rutaLocalCompleta) {
        try {
            URL url = new URL(urlImagen);
            URLConnection urlCon = url.openConnection();
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(rutaLocalCompleta);
 
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }
 
            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Ha fallado:");
            System.out.println(e);
        }                
    }    
    
    ////////////////////////////////////
    //////                      ////////
    //////    A futuro...       ////////
    //////                      ////////
    ////////////////////////////////////
//    public void descargaNovedades () {
//        try {
//            URL url = new URL(getURL_Novedades());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_Novedades());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    
//    public void descargaOfertas () {
//        try {
//            URL url = new URL(getURL_Ofertas());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_Ofertas());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    
//    public void descargaStock () {
//        try {
//            URL url = new URL(getURL_Stock());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_Stock());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    
//    public void descargaSinStock () {
//        try {
//            URL url = new URL(getURL_SinStock());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_SinStock());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    
//    public void descargaDescatalogados () {
//        try {
//            URL url = new URL(getURL_Descatalogados());
//            URLConnection urlCon = url.openConnection();
//            InputStream is = urlCon.getInputStream();
//            FileOutputStream fos = new FileOutputStream(getRutaLocal_Descatalogados());
// 
//            byte[] array = new byte[1000]; // buffer temporal de lectura.
//            int leido = is.read(array);
//            while (leido > 0) {
//                fos.write(array, 0, leido);
//                leido = is.read(array);
//            }
// 
//            // cierre de conexion y fichero.
//            is.close();
//            fos.close();
//        } catch (Exception e) {
//            System.out.println("Ha fallado:");
//            System.out.println(e);
//        }
//    }
//    


    
}
