package ws_dataconstructor;

import Objects.*;
import java.util.ArrayList;
import toolbox.*;

/**
 *
 * @author Isaac Gimenez
 */
public class WS_DataConstructor {
    
    public static Parametros PARAM = new Parametros();
    public static Archivos ARCH = new Archivos();
    public static Procesadores PROC = new Procesadores();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lanzarProceso();
    }

    private static void lanzarProceso() {
        
        //Lectura del Fichero inicial y creación de la lista correspondiente.
        ArrayList<ProductosGlobal> listaProductos = ARCH.leerProductosGlobal(PARAM.getRutaLocal_Global());
        
        //
        for (int contador = 0; contador <= listaProductos.size()-1; contador++) {
            ProductosGlobal registro = listaProductos.get(contador);
            ProductoParaImportar registroProcesado = PROC.procesarRegistro(registro);
        }
        
    }





}
