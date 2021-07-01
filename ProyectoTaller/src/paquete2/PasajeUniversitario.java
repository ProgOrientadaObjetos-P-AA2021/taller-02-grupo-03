/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeUniversitario extends PasajeInterCantonal implements Serializable{

    private String nombreUni;

    public PasajeUniversitario(String n, String c, String o, String d, 
            double dis, double tar, String nom) {
        super(n, c, o, d, dis, tar);
        nombreUni = nom;
    }

    public void establecerNombreUni(String n) {
        nombreUni = n;
    }

    @Override
    public void establecerValPasaje() {
        valPasaje = tarifaBase / 2;

    }

    public String obtenerNombreUni() {
        return nombreUni;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\nNombre de la Universidad: %s\n"
                + "Valor del pasaje: %.2f\n",super.toString(), 
                nombreUni,valPasaje);
        
        return cadena;
    }

}
