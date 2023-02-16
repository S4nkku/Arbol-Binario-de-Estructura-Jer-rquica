package com.mycompany.arbol_binario_pruebas;

public interface ArbolMetodos < T extends Comparable> {
    
    void insertar ( T  empl);
    
    boolean existe (int id);
    
    T obtener (int id);

    boolean esHoja();
    
    boolean esVacio();
    
    void preorden();
    
    void inorden();

    void postorden();
    
    void eliminar(int id);
    
    
}
