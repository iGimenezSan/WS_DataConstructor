/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

import Objects.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.FileWriter;
import java.util.Iterator;

/**
 *
 * @author Isaac Gimenez
 */
public class Archivos {
    
    public static Parametros PARAM = new Parametros();
    
    public ArrayList<ProductoProveedor> leerProductosGlobal (String ruta) {
        
        ArrayList<ProductoProveedor> ListaProductos = new ArrayList<>();
        
        try {
            CsvReader lector = new CsvReader(ruta);
            lector.setDelimiter(',');
            
            // Recogida de los datos de cada linea
            while (lector.readRecord()) {
                String familia = lector.get(0);
                String subfamilia = lector.get(1);
                String codigo = lector.get(2);
                String nombre = lector.get(3);
                String nombre_original = lector.get(4);
                String marca = lector.get(5);
                String descripcion_castellano = lector.get(6);
                String link = lector.get(7);
                String precio = lector.get(8);
                String precio_tarifa = lector.get(9);
                String stock = lector.get(10);
                String stock_disponible = lector.get(11);
                String reponer = lector.get(12);
                String talla = lector.get(13);
                String iva = lector.get(14);
                String imagen_gr = lector.get(15);
                String imagen_bu = lector.get(16);
                String imagen_or = lector.get(17);
                String imagen_grande_1 = lector.get(18);
                String imagen_grande_2 = lector.get(19);
                String imagen_grande_3 = lector.get(20);
                String imagen_grande_4 = lector.get(21);
                String imagen_grande_5 = lector.get(22);
                String imagen_grande_6 = lector.get(23);
                String imagen_grande_7 = lector.get(24);
                String imagen_grande_8 = lector.get(25);
                String imagen_grande_9 = lector.get(26);
                String imagen_grande_10 = lector.get(27);
                String ean = lector.get(28);
                String asociado_talla = lector.get(29);
                String descripcion_html = lector.get(30);
                String tarifa_basica = lector.get(31);
                String tarifa_preferente = lector.get(32);
                String tarifa_profesional = lector.get(33);
                String tarifa_premium = lector.get(34);
                String hashtalla = lector.get(35);
                
                ListaProductos.add(new ProductoProveedor(familia, subfamilia, codigo, nombre, nombre_original, marca, descripcion_castellano, link, precio, precio_tarifa, stock, stock_disponible, reponer, talla, iva, imagen_gr, imagen_bu, imagen_or, imagen_grande_1, imagen_grande_2, imagen_grande_3, imagen_grande_4, imagen_grande_5, imagen_grande_6, imagen_grande_7, imagen_grande_8, imagen_grande_9, imagen_grande_10, ean, asociado_talla, descripcion_html, tarifa_basica, tarifa_preferente, tarifa_profesional, tarifa_premium, hashtalla));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al localizar la ruta del fichero de Productos Global.");
        } catch (IOException e) {
            System.out.println("Fallo desconocido en entrada/salida.");
        }
        return ListaProductos;
    }
    
    public void escribirProductosParaImportar(ArrayList<ProductoPreparado> listaDeRegistros) throws IOException {
        
        String fichero = PARAM.getRutaLocal_ProductosPreparados();
        CsvWriter salida = new CsvWriter(new FileWriter(fichero, true), ',');
        
//        for (int contador = 0; contador < 10023; contador++) {
        Iterator it = listaDeRegistros.iterator();
        int contador = 0;
            if (it.hasNext()) {
//                ProductoParaImportar registro = listaDeRegistros.get(contador);
            
                Bucle1:
                while (it.hasNext()) {
                    ProductoPreparado registro = (ProductoPreparado) it.next();
                    try {
                        salida.write(registro.getModel());
                        salida.write(registro.getName());
                        salida.write(registro.getInOutStock());
                        salida.write(registro.getProductPrice());
                        salida.write(registro.getQuantity());
                        salida.write(registro.getCreationDate());
                        salida.write(registro.getLastModification());
                        salida.write(registro.getDateAvailable());
                        salida.write(registro.getManufacturerName());
                        salida.write(registro.getCategoriesName());
                        salida.write(registro.getDescription());
                        salida.write(registro.getProductImage());
                        salida.write(registro.getCategoriesImage());
                        salida.write(registro.getProductAttributes());
                        salida.write(registro.getTaxClassName());
                        salida.write(registro.getProductsViewed());
                        salida.endRecord();
                        contador++;
                
                        if (contador == listaDeRegistros.size()) {
                            salida.flush();
                            salida.close();
                            break Bucle1;
                        }
                    } catch (IOException e) {
                    }
                }
            }
    }    


}
