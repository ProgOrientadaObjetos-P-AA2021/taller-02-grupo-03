/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();

        PasajeNormal pasajenormal = new PasajeNormal("Daniel Torres",
                "1105678791", "Loja", "Quito", 678.9, 10, 6);
        PasajeMenorEdad pi = new PasajeMenorEdad("Xavier", "1150582755",
                "Loja", "Cuenca", 213.3, 12.2, 5);
        PasajeTerceraEdad pasajetercera = new PasajeTerceraEdad("Arianna",
                "1102321559", "Loja", "Guayaquil", 402.9, 5);

        PasajeMenorEdad pasInt = new PasajeMenorEdad("Xavier", "1150582755",
                "Loja", "Cuenca", 213.3, 12.2, 5);
        PasajeNormal pasNor = new PasajeNormal("George", "123284733", "Quito",
                "Loja", 313.4, 21.45, 10);

        pasajes.add(pasInt);
        pasajes.add(pasNor);
        pasajes.add(pasajenormal);
        pasajes.add(pasajetercera);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < pasajes.size(); i++) {

            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
