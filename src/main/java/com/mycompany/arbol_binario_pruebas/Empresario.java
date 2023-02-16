/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbol_binario_pruebas;

import java.util.Objects;


public class Empresario implements Comparable<Empresario> {

private int id;
private String nombre;
private String puesto;
private String despacho;

    public Empresario(int id, String nombre, String puesto, String despacho) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.despacho = despacho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return "Empresario{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", despacho=" + despacho + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.puesto);
        hash = 19 * hash + Objects.hashCode(this.despacho);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresario other = (Empresario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.puesto, other.puesto)) {
            return false;
        }
        return Objects.equals(this.despacho, other.despacho);
    }

    
    
    
    @Override
  public int compareTo(Empresario empl){
      if(id == empl.id){
          return 0;
      }
      else if(id < empl.id){
          return -1;
      }
      else {
          return 1;
      }
  }

 
}
