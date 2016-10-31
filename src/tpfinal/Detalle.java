/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal;

/**
 *
 * @author Lucas
 */
public class Detalle {
    private int frecuencia;
    private Archivo archivo;
    private Palabra palabra;

    public Detalle(int frecuencia, Archivo archivo, Palabra palabra) {
        this.frecuencia = frecuencia;
        this.archivo = archivo;
        this.palabra = palabra;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }
    
    
}
