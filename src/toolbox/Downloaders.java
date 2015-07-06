/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

import Objects.ImagenesProveedor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

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
    
    public void lanzarDescargaEnBloque(ArrayList<ImagenesProveedor> listaImagenesPreparadas) {
        
        for (int contador = 0; contador <= listaImagenesPreparadas.size()-1; contador++) {
            ImagenesProveedor registro = listaImagenesPreparadas.get(contador);
            
            // Descargar Imagen GR
            String rutaGR = PARAM.RutaBase_ImagenesBulk + "ImagenesGR/";
            File folderGR = new File(rutaGR);
            if (!folderGR.exists()) {
                folderGR.mkdirs();
            }
            if (!"".equals(registro.getImagen_gr()) || !"SinImagen".equals(registro.getImagen_gr())) {
                descargarImagen(registro.getImagen_gr(), rutaGR + "gr_"+registro.getCodigo()+".jpg");
            }
            
            // Descargar Imagen BU
            String rutaBU = PARAM.RutaBase_ImagenesBulk + "ImagenesBU/";
            File folderBU = new File(rutaBU);
            if (!folderBU.exists()) {
                folderBU.mkdirs();
            }
            if (!"".equals(registro.getImagen_bu()) || !"Sin Imagen".equals(registro.getImagen_bu())) {
                descargarImagen(registro.getImagen_bu(), rutaBU + "bu_"+registro.getCodigo()+".jpg");
            }

            // Descargar Imagen OR
            String rutaOR = PARAM.RutaBase_ImagenesBulk + "ImagenesOR/";
            File folderOR = new File(rutaOR);
            if (!folderOR.exists()) {
                folderOR.mkdirs();
            }
            if (!"".equals(registro.getImagen_or()) || !"Sin Imagen".equals(registro.getImagen_or())) {
                descargarImagen(registro.getImagen_or(), rutaOR + "or_"+registro.getCodigo()+".jpg");
            }
            
            // Descargar Imagen Imagen_grande_0
            String rutaGrande0 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande0/";
            File folderGrande0 = new File(rutaGrande0);
            if (!folderGrande0.exists()) {
                folderGrande0.mkdirs();
            }
            if (!"".equals(registro.getImagen_grande_0()) || !"Sin Imagen".equals(registro.getImagen_grande_0())) {
                descargarImagen(registro.getImagen_grande_0(), rutaGrande0 + "grande0_"+registro.getCodigo()+".jpg");
            }

            // Descargar Imagen Imagen_grande_1
            String rutaGrande1 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande1/";
            File folderGrande1 = new File (rutaGrande1);
            if (!folderGrande1.exists()) {
                folderGrande1.mkdir();
            }        
            if (!"".equals(registro.getImagen_grande_1()) || !"Sin Imagen".equals(registro.getImagen_grande_1())) {
                descargarImagen(registro.getImagen_grande_1(), rutaGrande1 + "grande_1"+registro.getCodigo()+".jpg");
            }
            
            // Descargar Imagen Imagen_grande_2
            String rutaGrande2 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande2/";
            File folderGrande2 = new File (rutaGrande2);
            if (!folderGrande2.exists()) {
                folderGrande2.mkdir();
            }             
            if (!"".equals(registro.getImagen_grande_2()) || !"Sin Imagen".equals(registro.getImagen_grande_2())) {
                descargarImagen(registro.getImagen_grande_2(), rutaGrande2 + "grande_2"+registro.getCodigo()+".jpg");
            }
            
            // Descargar Imagen Imagen_grande_3
            String rutaGrande3 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande3/";
            File folderGrande3 = new File (rutaGrande3);
            if (!folderGrande3.exists()) {
                folderGrande3.mkdir();
            }            
            if (!"".equals(registro.getImagen_grande_3()) || !"Sin Imagen".equals(registro.getImagen_grande_3())) {
                descargarImagen(registro.getImagen_grande_3(), rutaGrande3 + "grande_3"+registro.getCodigo()+".jpg");
            }

            // Descargar Imagen Imagen_grande_4
            String rutaGrande4 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande4/";
            File folderGrande4 = new File (rutaGrande4);
            if (!folderGrande4.exists()) {
                folderGrande4.mkdir();
            }            
            if (!"".equals(registro.getImagen_grande_4()) || !"Sin Imagen".equals(registro.getImagen_grande_4())) {
                descargarImagen(registro.getImagen_grande_4(), rutaGrande4 + "grande_4"+registro.getCodigo()+".jpg");
            }
            
            // Descargar Imagen Imagen_grande_5
            String rutaGrande5 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande5/";
            File folderGrande5 = new File (rutaGrande5);
            if (!folderGrande5.exists()) {
                folderGrande5.mkdir();
            }            
            if (!"".equals(registro.getImagen_grande_5()) || !"Sin Imagen".equals(registro.getImagen_grande_5())) {
                descargarImagen(registro.getImagen_grande_5(), rutaGrande5 + "grande_5"+registro.getCodigo()+".jpg");
            }
            
            // Descargar Imagen Imagen_grande_6
            String rutaGrande6 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande6/";
            File folderGrande6 = new File (rutaGrande6);
            if (!folderGrande6.exists()) {
                folderGrande6.mkdir();
            }           
            if (!"".equals(registro.getImagen_grande_6()) || !"Sin Imagen".equals(registro.getImagen_grande_6())) {
                descargarImagen(registro.getImagen_grande_6(), rutaGrande6 + "grande_6"+registro.getCodigo()+".jpg");
            }

            // Descargar Imagen Imagen_grande_7
            String rutaGrande7 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande7/";
            File folderGrande7 = new File (rutaGrande7);
            if (!folderGrande7.exists()) {
                folderGrande7.mkdir();
            }
            if (!"".equals(registro.getImagen_grande_7()) || !"Sin Imagen".equals(registro.getImagen_grande_7())) {
                descargarImagen(registro.getImagen_grande_7(), rutaGrande7 + "grande_7"+registro.getCodigo()+".jpg");
            }
            
            // Descargar Imagen Imagen_grande_8
            String rutaGrande8 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande8/";
            File folderGrande8 = new File (rutaGrande8);
            if (!folderGrande8.exists()) {
                folderGrande8.mkdir();
            } 
            if (!"".equals(registro.getImagen_grande_8()) || !"Sin Imagen".equals(registro.getImagen_grande_8())) {
                descargarImagen(registro.getImagen_grande_8(), rutaGrande8 + "grande_8"+registro.getCodigo()+".jpg");
            }
            
            // Descargar Imagen Imagen_grande_9
            String rutaGrande9 = PARAM.RutaBase_ImagenesBulk + "ImagenesGrande9/";
            File folderGrande9 = new File (rutaGrande9);
            if (!folderGrande9.exists()) {
                folderGrande9.mkdir();
            }
            if (!"".equals(registro.getImagen_grande_9()) || !"Sin Imagen".equals(registro.getImagen_grande_9())) {
                descargarImagen(registro.getImagen_grande_9(), rutaGrande9 + "grande_9"+registro.getCodigo()+".jpg");
            }

        }
        
    }
    
    public void confirmarExistenciaFolder(String rutaDirectorio) {
        File folderImagenPrincipal = new File (rutaDirectorio);
        if (!folderImagenPrincipal.exists()) {
            folderImagenPrincipal.mkdirs();
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
