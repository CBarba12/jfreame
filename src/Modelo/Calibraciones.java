/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



/**
 *
 * @author alexb
 */
public class Calibraciones {
    private int numero_calibracion_autogenrado;
    private Instrumento ptrInstrumento;
    private int fecha;
    private int cant_Medidas;

    public Calibraciones(int numero_calibracion_autogenrado, Instrumento ptrInstrumento, int fecha, int cant_Medidas) {
        this.numero_calibracion_autogenrado = numero_calibracion_autogenrado;
        this.ptrInstrumento = ptrInstrumento;
        this.fecha = fecha;
        this.cant_Medidas = cant_Medidas;
    }

    public int getNumero_calibracion_autogenrado() {
        return numero_calibracion_autogenrado;
    }

    public void setNumero_calibracion_autogenrado(int numero_calibracion_autogenrado) {
        this.numero_calibracion_autogenrado = numero_calibracion_autogenrado;
    }

    public Instrumento getPtrInstrumento() {
        return ptrInstrumento;
    }

    public void setPtrInstrumento(Instrumento ptrInstrumento) {
        this.ptrInstrumento = ptrInstrumento;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getCant_Medidas() {
        return cant_Medidas;
    }

    public void setCant_Medidas(int cant_Medidas) {
        this.cant_Medidas = cant_Medidas;
    }
    
    
    
    
    
}
