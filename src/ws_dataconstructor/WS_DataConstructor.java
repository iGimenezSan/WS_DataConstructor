package ws_dataconstructor;

import Objects.*;
import java.io.IOException;
import toolbox.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Isaac Gimenez
 */
public class WS_DataConstructor {
    
    public static Parametros PARAM = new Parametros();
    public static Archivos ARCH = new Archivos();
    public static Procesadores PROC = new Procesadores();
    public static Downloaders DOWN = new Downloaders();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Funcion para descarga del fichero principal y el fichero de campos
//        descargarFicheroOrigenDeProveedor();
//        System.out.println("Descarga de ficheros completada.");
        
        // Funcion primaria para procesar los registros del fichero del proveedor
        // a un fichero de salida listo para ser importado por el gestor OSCM
        lanzarProceso();
        System.out.println("Proceso Finalizado.");
        // Función secundaria para descargar las imagenes desde el proveedor
        // en bloque y directas a local siguiendo la estructura de carpetas
        // segun tipos de imagen
        //descargarImagenesEnBloque();
    }

    private static void lanzarProceso() {
        
        //Lectura del Fichero inicial y creación de la lista correspondiente.
        ArrayList<ProductoProveedor> listaProductoProveedor = ARCH.leerProductosGlobal(PARAM.getRutaLocal_Global());
        System.out.println("Preparado ArrayList Principal. Obtenidos " + listaProductoProveedor.size() + "registros.");
        
        ArrayList<ProductoPreparado> listaProductoPreparado = new ArrayList<>();
        ArrayList<ImagenesPreparadas> listaImagenesPreparadas = null;
        
        //Procesamiento de los registros de la lista de productos inicial
        for (int contador = 0; contador <= listaProductoProveedor.size()-1; contador++) {
            System.out.println("Procesando entrada " + (contador + 1) + " de " + listaProductoProveedor.size());

            // Obtencion del registro a tratar
            ProductoProveedor registro = listaProductoProveedor.get(contador);

            // Preparacion y procesamiento del registro
            // Adicion del registro al ArrayList listaProductoPreparado
            ProductoPreparado registroProcesado = PROC.procesarRegistro(registro);
            listaProductoPreparado.add(registroProcesado);

            // Preparación de la ruta al directorio
            String rutaDirectorio = PROC.prepararRutaFolderImagenPrincipal(registro, PARAM.getRutaLocal_Imagenes());
            DOWN.confirmarExistenciaFolder(rutaDirectorio);
            
            //Preparación de la ruta Completa
            String rutaCompletaImagenPrincipal = PROC.prepararRutaCompletaImagenPrincipal(rutaDirectorio, registro.getCodigo(), registro.getNombre());
            
            // Descarga de la imagen principal
            DOWN.descargarImagen(registro.getImagen_or(), rutaCompletaImagenPrincipal);
        }
        
        try {
            ARCH.escribirProductosParaImportar(listaProductoPreparado);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fallo I/O al mandar el ArrayList a escribir el fichero");
        }
    }
    
    private static void descargarFicheroOrigenDeProveedor() {
        DOWN.descargaCamposGlobal();
        DOWN.descargaGlobal();
    }    

    private static void descargarImagenesEnBloque() {
        ArrayList<ProductoProveedor> listaProductoProveedor = ARCH.leerProductosGlobal(PARAM.getRutaLocal_Global());
        ArrayList<ImagenesProveedor> listaImagenesPreparadas = new ArrayList<>();
        
        for (int contador = 0; contador <= listaProductoProveedor.size()-1; contador++) {
            ProductoProveedor registro = listaProductoProveedor.get(contador);
            
            ImagenesProveedor setDeImagenes = PROC.prepararImagenesRAW(registro);
            
            listaImagenesPreparadas.add(setDeImagenes);
        }
        DOWN.lanzarDescargaEnBloque(listaImagenesPreparadas);
    }



}
