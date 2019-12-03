package com.sc202.proyectogym;

import java.util.Scanner;

public class DatosPersonales {

    int edad;
    String nombre;
    String Apellidos;
    String Cedula;
    String Naci;
    String lugar;

    public void Datos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su nombre");
        nombre = leer.next();
        System.out.println("Apellidos");
        Apellidos = leer.next();
        System.out.println("¿Cedula?");
        Cedula = leer.next();
        System.out.println("Fecha de Nacimiento");
        Naci = leer.next();
        System.out.println("Lugar de residencia");
        lugar = leer.next();

    }//fin datos
}//fin clase
