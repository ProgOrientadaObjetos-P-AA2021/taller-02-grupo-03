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
public class PasajeTerceraEdad extends PasajeInterCantonal {

    public PasajeTerceraEdad(String n, String c, String o, String d, 
            double dis, double tar, double val, double porc) {
        super(n, c, o, d, dis, tar, val);
    }

    @Override
    public void establecerValPasaje() {
        valPasaje = ((distanciaKm * 0.5) + (tarifaBase/2));
    }
    
    @Override
    public String toString() {
        return String.format("\n%.2f\n", obtenerValPasaje());
    }
}
