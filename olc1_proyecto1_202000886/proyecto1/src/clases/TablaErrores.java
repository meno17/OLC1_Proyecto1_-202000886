/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author josé
 */
public class TablaErrores {
    private int numero;
    private String tipo;
    private String descripcion;
    private int linea;
    private int columna;
    
    //Constructor de la clase TablaErrores{}
    public TablaErrores(int numero,String tipo, String descripcion, int linea, int columna){
        this.numero = numero;
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
    }
    
    //metodos get y set

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
   
    
}
