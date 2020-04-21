package org.formacion.di.bbdd;

/**
 * Interfaz del inventario, Aplicación de Inyección de dependencia, mejor extraer
 * el contenido a una interfaz
 */
public interface Inventario {
    public int numeroProductos(String tienda, String producto);
}
