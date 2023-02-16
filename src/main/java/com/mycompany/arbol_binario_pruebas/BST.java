
package com.mycompany.arbol_binario_pruebas;


public class BST implements ArbolMetodos<Empresario> {

    private Empresario valor;
    
    private BST izdo, dcho;
    
    
    
    @Override
    public void insertar(Empresario empl) {
        if (valor  == null){
            this.valor = empl;
        }
        else{
            if(empl.compareTo(valor) < 0){
                
                if(izdo == null) izdo = new BST();
                
                izdo.insertar(empl);                
            } 
            
            else if (empl.compareTo (valor)> 0){ 
                if (dcho == null) dcho = new BST();
                dcho.insertar(empl);
                
            }else {
                
                throw new IllegalArgumentException("Elemento duplicado");
                
            }
            
        }
    }

    @Override
    public boolean existe(int id) {
        if (valor !=null){
            if( id == valor.getId()){
                return true;
            }else if(id < valor.getId() && izdo != null){
                return izdo.existe(id);
                
            } else if (id > valor.getId() && dcho != null){
                return dcho.existe(id);
                
            } else{
                return false;
            }
        }else{
            return false;
            
        }
   }
    

    @Override
    public Empresario obtener(int id) {
        
        if (valor !=null){
            if( id == valor.getId()){
                return valor;
            }else if(id < valor.getId() && izdo != null){
                return izdo.obtener(id);
            } else if (id < valor.getId() && dcho != null){
                return dcho.obtener(id);
            } else{
                return null;
            }
        }else{
            return null;
        } 
    }

    @Override
    public boolean esHoja() {
       return valor !=null && izdo == null && dcho == null;
      
    }

    @Override
    public boolean esVacio() {
            return valor == null;
    }

    private void preordenImpl(String prefijo){
        if(valor != null){
            System.out.println(prefijo + valor);
            if(izdo != null) izdo.preordenImpl(prefijo + "  ");
            if(dcho != null) dcho.preordenImpl(prefijo + "  ");
        }
        
        
    }
    
    
    @Override
    public void preorden() {
       preordenImpl("");
        
    }
    
    private void inordenImpl(String prefijo){
         if(valor != null){
             System.out.println(prefijo + valor);
            if(izdo != null) izdo.inordenImpl(prefijo + "  ");
            System.out.println(valor);    
            if(dcho != null) dcho.inordenImpl(prefijo + "  ");
        }
    }
    
    

    @Override
    public void inorden() {
       inordenImpl("");
    }

    @Override
    public void postorden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Empresario Raiz() {
        return valor;
    }
        
    public void Hojas(BST root) {  
    if (root == null)
        return;
    
    if (root.izdo == null && root.dcho== null)
    {
        System.out.print(root.valor + "\n ");
        return;
    }
    if (root.izdo != null)
        Hojas(root.izdo);

    if (root.dcho!= null)
        Hojas(root.dcho);
}

  
    
    
}