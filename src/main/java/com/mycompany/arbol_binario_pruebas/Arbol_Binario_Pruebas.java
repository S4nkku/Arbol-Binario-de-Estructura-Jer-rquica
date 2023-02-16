
package com.mycompany.arbol_binario_pruebas;

import java.util.Arrays;


public class Arbol_Binario_Pruebas {


    
    public static void main(String[] args) {
        Empresario empleado1 = new Empresario(38, "David", "Manager Marketing", "I 101");
        Empresario empleado2 = new Empresario(7, "Lucia", "Supervisor 1", "E 102");
        Empresario empleado3 = new Empresario(45, "Miguel", "Presidente", "A 103");
        Empresario empleado4 = new Empresario(65, "Felipe ", "VicePresidente Operaciones", "C 101");
        Empresario empleado5 = new Empresario(23, "Adria", "VicePresidente Marketing", "C 101");
        Empresario empleado6 = new Empresario(2, "Andres", "Manager Ventas", "G 110");
        Empresario empleado7 = new Empresario(5, "Camilo", "Supervisor 2", "H 100");
        Empresario empleado8 = new Empresario(52, "Diana", "Gerente Operaciones", "D 106");
        Empresario empleado9 = new Empresario(48, "Juan", "Control de Produccion", "B 105");
        Empresario empleado10 = new Empresario(96, "Sebastian", "Gerente de Sistemas", "S 101");
        Empresario empleado11 = new Empresario(95, "Samuel", "CiberSeguridad", "S 101");
        
      BST bst = new BST();
        Arrays.asList(empleado3, empleado5, empleado6, empleado2, empleado1, empleado7, empleado4, empleado8, empleado9, empleado10, empleado11).forEach(bst::insertar);

        
        
        bst.preorden();
        System.out.println("\n la raiz es "+ bst.Raiz());  
        
        System.out.println("\nLas Hojas son " );
        bst.Hojas(bst);
        
    }
    
     private static void buscar(BST bst, int id){
         
         if (bst.existe(id)){
             
             System.out.println(bst.obtener(id));
         }
         
         else{
             System.out.println("Sin datos del empleado: " + "\n ID Buscado: " + id);
         }
         
     }
    
}
