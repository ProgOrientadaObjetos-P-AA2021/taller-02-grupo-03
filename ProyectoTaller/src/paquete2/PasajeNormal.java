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
public class PasajeNormal extends PasajeInterCantonal
        implements Serializable {

    private double porcentajeAdicional;

    public PasajeNormal(String n, String c, String o, String d, 
            double dis, double tar, double porc) {
        super(n, c, o, d, dis, tar);
        porcentajeAdicional = porc;
    }

    public void establecerPorcentajeAdicional(double n) {
        porcentajeAdicional = n;
    }

    @Override
    public void establecerValPasaje() {
        valPasaje = ((distanciaKm * 0.15) + (tarifaBase
                + (tarifaBase * (porcentajeAdicional / 100))));
    }
    
    public double obtenerPorcentajeAdiconal() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nPorcentaje Adicional: %s\n"
                + "Valor del pasaje: %s",super.toString(), 
                porcentajeAdicional, valPasaje);
        return cadena;
    }

}
