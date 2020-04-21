package org.formacion.di.bbdd;


public class InventarioBBDD implements Inventario{


    // Metodo de consulta a la base de datos

    /**
     *
     * @param tienda
     * @param producto
     * @return
     */
    @Override
     public int numeroProductos(String tienda, String producto) {
        return BBDD.stocs.get(tienda).get(producto);
    }
}
