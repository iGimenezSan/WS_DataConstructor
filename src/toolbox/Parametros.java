package toolbox;

/**
 *
 * @author Isaac Gimenez
 */
public class Parametros {

    // Datos Generales de la Base de Datos
  
    // URL de acceso a ficheros para descargar
    public String URL_Global = "http://media.grutinet.com/ficheros/productos_sin_dvd.csv";
    public String URL_CamposGlobal = "http://media.grutinet.com/ficheros/estructura_campos.txt";
    public String URL_Novedades = "http://media.grutinet.com/ficheros/productos_csv_novedades.csv";
    public String URL_Ofertas = "http://media.grutinet.com/ficheros/productos_csv_ofertas.csv";
    public String URL_Stock = "http://media.grutinet.com/ficheros/productos_stock.csv";
    public String URL_SinStock = "http://media.grutinet.com/ficheros/productos_csv_sin_stock.csv";
    public String URL_Descatalogados = "http://media.grutinet.com/ficheros/productos_csv_descatalogados.csv";

    // Rutas locales para los ficheros
    public String RutaLocal_Global = "d:/iGimenezSan/FicherosWS/Originales/globalfromgrutinet.csv";
    public String RutaLocal_CamposGlobal = "d:/iGimenezSan/FicherosWS/Originales/camposglobal.txt";
    public String RutaLocal_ProductosPreparados = "d:/iGimenezSan/FicherosWS/Preparados/productosparaimportar.csv";
    public String RutaLocal_Imagenes = "D:/iGimenezSan/FicherosWS/Imagenes/ParaImportar/";
    
    //A futuro
    public String RutaLocal_Novedades = "d:/iGimenezSan/FicherosGrutinet/descargados/novedades.csv";
    public String RutaLocal_Ofertas = "d:/iGimenezSan/FicherosGrutinet/descargados/ofertas.csv";
    public String RutaLocal_Stock = "d:/iGimenezSan/FicherosGrutinet/descargados/stock.csv";
    public String RutaLocal_SinStock = "d:/iGimenezSan/FicherosGrutinet/descargados/sinstock.csv";
    public String RutaLocal_Descatalogados = "d:/iGimenezSan/FicherosGrutinet/descargados/descatalogados.csv";
    
    // Descarga global de todas las imagenes
    public String RutaBase_ImagenesBulk = "d:/iGimenezSan/FicherosWS/Imagenes/DescargadasEnBloque/";
    
///////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
        
/////////////////////
// Getters & Setters
/////////////////////

    public String getURL_Global() {
        return URL_Global;
    }

    public void setURL_Global(String URL_Global) {
        this.URL_Global = URL_Global;
    }

    public String getURL_CamposGlobal() {
        return URL_CamposGlobal;
    }

    public void setURL_CamposGlobal(String URL_CamposGlobal) {
        this.URL_CamposGlobal = URL_CamposGlobal;
    }

    public String getURL_Novedades() {
        return URL_Novedades;
    }

    public void setURL_Novedades(String URL_Novedades) {
        this.URL_Novedades = URL_Novedades;
    }

    public String getURL_Ofertas() {
        return URL_Ofertas;
    }

    public void setURL_Ofertas(String URL_Ofertas) {
        this.URL_Ofertas = URL_Ofertas;
    }

    public String getURL_Stock() {
        return URL_Stock;
    }

    public void setURL_Stock(String URL_Stock) {
        this.URL_Stock = URL_Stock;
    }

    public String getURL_SinStock() {
        return URL_SinStock;
    }

    public void setURL_SinStock(String URL_SinStock) {
        this.URL_SinStock = URL_SinStock;
    }

    public String getURL_Descatalogados() {
        return URL_Descatalogados;
    }

    public void setURL_Descatalogados(String URL_Descatalogados) {
        this.URL_Descatalogados = URL_Descatalogados;
    }

    public String getRutaLocal_Global() {
        return RutaLocal_Global;
    }

    public void setRutaLocal_Global(String RutaLocal_Global) {
        this.RutaLocal_Global = RutaLocal_Global;
    }

    public String getRutaLocal_CamposGlobal() {
        return RutaLocal_CamposGlobal;
    }

    public void setRutaLocal_CamposGlobal(String RutaLocal_CamposGlobal) {
        this.RutaLocal_CamposGlobal = RutaLocal_CamposGlobal;
    }

    public String getRutaLocal_ProductosPreparados() {
        return RutaLocal_ProductosPreparados;
    }

    public void setRutaLocal_ProductosPreparados(String RutaLocal_ProductosPreparados) {
        this.RutaLocal_ProductosPreparados = RutaLocal_ProductosPreparados;
    }

    public String getRutaLocal_Imagenes() {
        return RutaLocal_Imagenes;
    }

    public void setRutaLocal_Imagenes(String RutaLocal_Imagenes) {
        this.RutaLocal_Imagenes = RutaLocal_Imagenes;
    }

    public String getRutaLocal_Novedades() {
        return RutaLocal_Novedades;
    }

    public void setRutaLocal_Novedades(String RutaLocal_Novedades) {
        this.RutaLocal_Novedades = RutaLocal_Novedades;
    }

    public String getRutaLocal_Ofertas() {
        return RutaLocal_Ofertas;
    }

    public void setRutaLocal_Ofertas(String RutaLocal_Ofertas) {
        this.RutaLocal_Ofertas = RutaLocal_Ofertas;
    }

    public String getRutaLocal_Stock() {
        return RutaLocal_Stock;
    }

    public void setRutaLocal_Stock(String RutaLocal_Stock) {
        this.RutaLocal_Stock = RutaLocal_Stock;
    }

    public String getRutaLocal_SinStock() {
        return RutaLocal_SinStock;
    }

    public void setRutaLocal_SinStock(String RutaLocal_SinStock) {
        this.RutaLocal_SinStock = RutaLocal_SinStock;
    }

    public String getRutaLocal_Descatalogados() {
        return RutaLocal_Descatalogados;
    }

    public void setRutaLocal_Descatalogados(String RutaLocal_Descatalogados) {
        this.RutaLocal_Descatalogados = RutaLocal_Descatalogados;
    }

    public String getRutaBase_ImagenesBulk() {
        return RutaBase_ImagenesBulk;
    }

    public void setRutaBase_ImagenesBulk(String RutaBase_ImagenesBulk) {
        this.RutaBase_ImagenesBulk = RutaBase_ImagenesBulk;
    }

    
}