/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

import Objects.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Isaac Gimenez
 */
public class Procesadores {

    public ProductoParaImportar procesarRegistro(ProductosGlobal registro) {
        ProductoParaImportar registroProcesado = null;

        registroProcesado.setProductID("ProductID");
        registroProcesado.setModel(procesarCampoModel(registro.getCodigo()));
        registroProcesado.setName(procesarCampoName(registro.getNombre()));
        registroProcesado.setInOutStock(procesarCampoInOutStock(registro.getStock()));
        registroProcesado.setURL("URL");
        registroProcesado.setProductPrice(procesarCampoProductPrice(registro.getPrecio()));
        registroProcesado.setQuantity(null);
        registroProcesado.setCreationDate(procesarCampoCreationDate());
        registroProcesado.setLastModification(procesarCampoLastModification());
        registroProcesado.setDateAvailable(procesarCampoDateAvailable());
        registroProcesado.setManufacturerName(procesarCampoManufacturerName(registro.getMarca()));
        registroProcesado.setCategoriesName(procesarCampoCategoriesName(registro.getFamilia(), registro.getSubfamilia()));
        registroProcesado.setDescription(procesarCampoDescription(registro.getDescripcion_html()));
        registroProcesado.setProductImage(procesarCampoProductImage(registro.getNombre(), registro.getFamilia(), registro.getSubfamilia()));
        registroProcesado.setCategoriesImage(procesarCampoCategoriesImage(registro.getFamilia(), registro.getSubfamilia()));
        registroProcesado.setSpecialProductPrice(null);
        registroProcesado.setDateSpecialPriceCreated(null);
        registroProcesado.setSpecialLastModified(null);
        registroProcesado.setSpecialExpires(null);
        registroProcesado.setSpecialChanged(null);
        registroProcesado.setSpecialStatus(null);
        registroProcesado.setProductAttributes(procesarCampoProductAttributes(registro.getTalla()));
        registroProcesado.setTaxClassName(procesarCampoTaxClassName(registro.getIva()));
        registroProcesado.setProductsOrdered(null);
        registroProcesado.setProductsViewed(procesarCampoProductsViewed());
        registroProcesado.setManufacturersImage(null);
        registroProcesado.setFeatureDateAdded(null);
        registroProcesado.setFeaturedLastModified(null);
        registroProcesado.setFeaturedExpiresDate(null);
        registroProcesado.setFeaturedDateStatusChange(null);
        registroProcesado.setFeaturedStatus(null);
        registroProcesado.setWeight(null);
        registroProcesado.setProducts_Images(null);
        registroProcesado.setAttribute1Option(null);
        registroProcesado.setAttribute1Value(null);
        registroProcesado.setAttribute1Prefix(null);
        registroProcesado.setAttribute1Price(null);
        
        
        return registroProcesado;
    }

    private String procesarCampoModel (String codigo) {
        String retorno = codigo;
        return retorno;
    }
    
    private String procesarCampoName (String nombre) {
        String retorno = nombre;
        return retorno;
    }
    
    private String procesarCampoInOutStock (String InOutStock) {
        String retorno;
        
        if ("SI".equals(InOutStock)) {
            retorno = "1";
        } else if ("NO".equals(InOutStock)) {
            retorno = "0";
        } else {
            retorno = "";
        }
        
        return retorno;        
    }
    
    private String procesarCampoProductPrice (String precio) {
        String retorno = precio;
        return retorno;
    }
    
    private String procesarCampoCreationDate() {
        String resultado = crearFechaAhora();
        return resultado;
    }

    private String procesarCampoLastModification() {
        String resultado = crearFechaAhora();
        return resultado;
    }

    private String procesarCampoDateAvailable() {
        String resultado = crearFechaAhora();
        return resultado;
    }
    
    private String procesarCampoManufacturerName (String fabricante) {
        String retorno = fabricante;
        return retorno;
    }
    
    private String procesarCampoCategoriesName(String familia, String subfamilia) {
        String separador = "|";
        String retorno;
        
        retorno = familia + separador + subfamilia;
        
        return retorno;
    }    
    
    private String procesarCampoDescription(String descripcion_html) {
        String retorno = descripcion_html;
        return retorno;        
    }

    private String procesarCampoProductImage(String nombre, String familia, String subfamilia) {
        String rutaBase = "productos/";
        String extension = ".jpg";
        
        nombre = textoAMinusculas(nombre);
        nombre = quitarEspacios(nombre);
        
        String retorno = rutaBase + familia + "/" + subfamilia + "/" + nombre + extension;
        
        return retorno;
    }
    
    private String procesarCampoCategoriesImage(String familia, String subfamilia) {
        String rutaBase = "categorias/";
        String separador = "/";
        String extension = ".jpg";
        String retorno;
        
        //Quitar espacios del contenido
        familia = quitarEspacios(familia);
        subfamilia = quitarEspacios(subfamilia);
        
        //Poner todo en minusculas
        familia = textoAMinusculas(familia);
        subfamilia = textoAMinusculas(subfamilia);
        
        retorno = rutaBase + familia + separador + subfamilia + extension;
        
        return retorno;
    }

    private String procesarCampoProductAttributes(String talla) {
        String retorno;
        retorno = talla;
        return retorno;
    }

    private String procesarCampoTaxClassName(String iva) {
        String retorno;
        
        if ("21".equals(iva)) {
            retorno = "IVA (Normal)";
        } else if ("10".equals(iva)) {
            retorno = "IVA (Reducido)";
        } else if ("4".equals(iva)) {
            retorno = "IVA (Superreducido)";
        } else if ("0".equals(iva)){
            retorno = "Exento";
        } else {
            retorno = "";
        }

        return retorno;
    }

    private String procesarCampoProductsViewed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
    
    
    ///////////////////
    //  USO GENERAL  //
    ///////////////////
    
    private String crearFechaAhora() {
        String resultado;
        
        Date ahora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");
        
        resultado = formato.format(ahora);
        
        return resultado;
    }

    private String quitarEspacios(String texto) {
        String retorno = texto.replaceAll(" ", "_");
        return retorno;
    }

    private String textoAMinusculas(String texto) {
        String retorno = texto.toLowerCase();
        return retorno;
    }








}