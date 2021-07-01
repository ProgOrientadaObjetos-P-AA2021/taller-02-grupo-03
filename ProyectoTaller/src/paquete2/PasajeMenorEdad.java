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
public class PasajeMenorEdad extends PasajeInterCantonal
        implements Serializable {

    private double porcentaje;

    public PasajeMenorEdad(String n, String c, String o, String d,
            double dis, double tar, double porc) {
        super(n, c, o, d, dis, tar);
        porcentaje = porc;
    }

    public void establecerPorcentaje(double n) {
        porcentaje = n;
    }

    @Override
    public void establecerValPasaje() {
        valPasaje = (distanciaKm * 0.15) + (tarifaBase * (porcentaje / 100));
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

}
