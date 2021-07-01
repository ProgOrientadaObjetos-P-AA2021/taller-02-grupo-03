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
public abstract class PasajeInterCantonal implements Serializable {

    protected String nombre;
    protected String cedula;
    protected String origen;
    protected String destino;
    protected double distanciaKm;
    protected double tarifaBase;
    protected double valPasaje;

    public PasajeInterCantonal(String n, String c, String o, String d,
            double dis, double tar) {
        nombre = n;
        cedula = c;
        origen = o;
        destino = d;
        distanciaKm = dis;
        tarifaBase = tar;   
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerOrigen(String n) {
        origen = n;
    }

    public void establecerDestino(String n) {
        destino = n;
    }

    public void establecerDistanciKm(double n) {
        distanciaKm = n;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    public abstract void establecerValPasaje();

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerOrigen() {
        return origen;
    }

    public double obtenerDistanciaKm() {
        return distanciaKm;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public double obtenerValPasaje() {
        return valPasaje;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nNombre: %s\nCedula: %s\nOrigen: %s\n"
                + "Destino: %s\nDistancia en Km: %.2f\nTarifa Base: %.2f", 
                nombre, cedula, origen, destino, distanciaKm, tarifaBase);
        return cadena;
    }

}
