/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alexb
 */
public class Instrumento {
    
  private int numero_serie;
  private Tipo_de_Instrumentos ptr;
  private String descripcion;
  private int minimo;
  private int maximo;
  private int margen_de_tolerancia;
  private  Boolean  calibraciones_validar ;
  
  

  public Instrumento(int numero_serie, Tipo_de_Instrumentos ptr, String descripcion, int minimo, int maximo, int margen_de_tolerancia) {
        this.numero_serie = numero_serie;
        this.ptr = ptr;
        this.descripcion = descripcion;
        this.minimo = minimo;
        this.maximo = maximo;
        this.margen_de_tolerancia = margen_de_tolerancia;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public Tipo_de_Instrumentos getPtr() {
        return ptr;
    }

    public void setPtr(Tipo_de_Instrumentos ptr) {
        this.ptr = ptr;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMargen_de_tolerancia() {
        return margen_de_tolerancia;
    }

    public void setMargen_de_tolerancia(int margen_de_tolerancia) {
        this.margen_de_tolerancia = margen_de_tolerancia;
    }
  
 
    
    
}
