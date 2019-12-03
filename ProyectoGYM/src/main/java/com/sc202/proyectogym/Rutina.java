package com.sc202.proyectogym;

import javax.swing.JOptionPane;

public class Rutina {

    private String[] vector;
    private String[] vector2;
    private String[] vector3;

    public void Escoja() {
        // String dias[] = new String[6];
        int objetivo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su objetivo a cumplir \n1=Hypertrofia \n2=Perdida de peso \n3=Definición "));
        vector = new String[6];
        vector2 = new String[6];
        vector3 = new String[6];
        vector[0] = "Su Rutina de Hypertrofria es la Siguiente:"
                + "\n                            ----Lunes-----"
                + "\n                                Piernas:"
                + "\n  -Sentadillas con barras      4 Series de 10Reps"
                + "\n  -Desplantes Mancuernas   4 Series de 12Reps"
                + "\n  -Extensión de Rodilla         4 Series de 10Reps"
                + "\n  -Flexión de Rodillas            4 Series de 12Reps"
                + "\n  -Gastronemios con barra   4 Series de 15Reps"
                + "\n  -Peso muerto con barra     4 Series de 10Reps"
                + "\n                             Hombros:"
                + "\n  -Press Militar Barra            4 Series de 8Reps"
                + "\n  -Elevación Mancuernas     4 Series de 8Reps"
                + "\n  -Posterior Mancuernas      4 Series de 8Reps"
                + "\n  -Mariposa con Marcuenas 4 Series de 8Reps";
        vector[1] = "\n                                  ----Martes----"
                + "\n                                        Pecho:"
                + "\n  -Press Plano con Marcuenas        4 Series de 10Reps"
                + "\n  -Press Inclinado con Marcuenas  4 Series de 10Reps"
                + "\n  -Push Ups                                        4 Series de 10Reps"
                + "\n  -Aperturas Plano Con Marcuenas 4 Series de 10Reps"
                + "\n  -PullOver                                        4 Series de 10Reps"
                + "\n                            Trapecios:"
                + "\n  -Jalon al cuello Barra     4 Series de 12Reps"
                + "\n  -Escogimiento Polea      4 Series de 12Reps";
        vector[2] = "\n                           ----Miercoles----"
                + "\n                                  Espalda:"
                + "\n  -Calentar con dominadas      4 Series de 8Reps"
                + "\n  -Jalon abierto Polea              4 Series de 10Reps"
                + "\n  -Remo con Barra                   4 Series de 10Reps"
                + "\n  -Remo en Polea                     4 Series de 10Reps"
                + "\n  -Remo Marcuneas Individual 4 Series de 10Reps"
                + "\n                                  AnteBrazo:"
                + "\n  -Flexión de Muñeca Marcuenas 4 Series de 12Reps"
                + "\n  -Flexión de Muñeca barra          4 Series de 12Reps";
        vector[3] = "\n                            ----Jueves----"
                + "\n                                 Biceps:"
                + "\n  -Flexión Codo en Barra     4 Series de 8Reps"
                + "\n  -Martillo Marcuenas           4 Series de 8Reps"
                + "\n  -Flexion de codo                 4 Series"
                + "\n  -Flexion codo Barra Scoth 4 Series de 8Reps"
                + "\n                               Triceps:"
                + "\n  -Extensión de Codo Polea 4 Series de 8Reps"
                + "\n  -Copa Individual                 4 Series de 8Reps"
                + "\n  -Patada de Mula                  4 Series de 8Reps"
                + "\n  -Press Frances en Barra    4 Series de 8Reps";
        vector[4] = "\n                              ----Viernes----"
                + "\n                                    Cardio:"
                + "\n          -Battle Run    4 Series de 40Reps"
                + "\n          -Suizas           4 Series de 100Reps"
                + "\n          -Burpeers       4 Series de 15Reps"
                + "\n          -Suicidios       4 Series de 10Reps"
                + "\n          -Jumping Jax 4 Series de 25Reps"
                + "\n                             Abdomen:"
                + "\n  -Crunch reverso                               4 Series de 15Reps"
                + "\n  -Crunch con bicicleta                      4 Series de 15Reps"
                + "\n  -Básico con las piernas en el aire  4 Series de 15Reps"
                + "\n  -Crunch de lado                              4 Series de 15Reps"
                + "\n  -Russians con Peso                        4 Series de 15Reps";
        vector[5] = "\n                  ----Sabado----"
                + "\n -Repetir Alguna Rutina de la Semana-      "
                + "\n -O Hacer una clase de Funcionales-      ";
        vector2[0] = "Su rutina para Perder Peso es la siguiente:"
                + "\n              ----Lunes----"
                + "\n                 Piernas"
                + "\n -Extesion Rodilla Piramida      4 Series (10,10,10)"
                + "\n -Desplante Caminando Marcuernas 4 Series de 15Reps"
                + "\n -Flexión Rodilla Piramide       4 Series (10,10,10)"
                + "\n -Desplante Bulgaro              4 Series de 15Reps"
                + "\n -Prensa Invidual                4 Series de 15Reps"
                + "\n                Hombros:"
                + "\n -Laterales Mancuernas  4 Series de 10Reps"
                + "\n -Press Militar Barra   4 Series de 10Reps"
                + "\n -Mariposa              4 Series de 10Reps"
                + "\n -Posterior Marcuernas  4 Series de 10Reps"
                + "\n                Cardio:"
                + "\n -25 Minutos en: (Spinnig, Caminadora o Sliptica)";
        vector2[1] = "\n              ----Martes----"
                + "\n                  Pecho:"
                + "\n -Press Plano Mancuernas     4 Series de 15Reps"
                + "\n -Press Inclinado Mancuernas 4 Series de 15Reps"
                + "\n -Push Ups                   4 Series de 15Reps"
                + "\n -Aperturas Inclinado        4 Series de 15Reps"
                + "\n -Press Declinado Barra      4 Series de 15Reps"
                + "\n                 Trapecios:"
                + "\n -Jalon al cuello Barra  4 Series de 15Reps"
                + "\n -Encogimientos Polea    4 Series de 15Reps"
                + "\n                   Cardio"
                + "\n -25 Minutos en: (Spinnig, Caminadora o Sliptica)";
        vector2[2] = "\n               ----Miercoles----"
                + "\n                    Espalda:"
                + "\n -Jalon abierto Polea        4 Series de 15Reps"
                + "\n -Remo Mancuernas Individual 4 Series de 15Reps"
                + "\n -Pull Over                  4 Series de 15Reps"
                + "\n -Remo 90 con Barra          4 Series de 15Reps"
                + "\n -Dominadas al Fallo         4 Series (Minimo 10)"
                + "\n                  Antebrazos:"
                + "\n -Flexión de Muñecas Mancuernas 4 Series de 15Reps"
                + "\n -Flexión de Muñecas Barra      4 Series de 15Reps"
                + "\n                    Cardio:"
                + "\n -25 Minutos en: (Spinnig, Caminadora o Sliptica)";
        vector2[3] = "\n                ----Jueves----"
                + "\n                    Biceps:"
                + "\n -21 Marcuenas                       4 Series "
                + "\n -Piramide de barra en Scoth         4 Series de 12Reps"
                + "\n -Flexión Codo Mancuernas Isometrico 4 Series de 10Reps"
                + "\n -Flexión Codo Martillo Marcuernas   4 Series de 12Reps"
                + "\n                    Triceps:"
                + "\n -Patada Mula Invidual          4 Series de 12Reps"
                + "\n -Extensión de codo Polea Barra 4 Series de 12Reps"
                + "\n -Press Frances Isometrico      4 Series de 10Reps"
                + "\n -Copa Individual Marcuenas     4 Series de 12Reps"
                + "\n                     Cardio:"
                + "\n -25 Minutos en: (Spinnig, Caminadora o Sliptica)";
        vector2[4] = "\n               ----Viernes----"
                + "\n -REALIZAR LA CLASE FUNCIONAL EN CUALQUIER HORARIO-";
        vector2[5] = "\n -Puede tomarselo libre o Repetir la rutina de los días anteriores-"
                + "\n          ----PROHIBIDO COMIDA TRAMPA----";
        vector3[0] = "   Su Rutina para definición es la siguiente:"
                + " \n             ----Lunes----"
                + " \n                Piernas:"
                + " \n -Sentadilla Barra 4 Series de 12Reps"
                + " \n -Desplante Caminando Marcuernas 4 Series de 12Reps"
                + " \n -Extension de Rodilla 4 Series de 12Reps"
                + " \n -Flexión de Rodilla 4 Series de 12Reps"
                + " \n -Peso muerto Barra 4 Series de 12Reps"
                + " \n                Hombros:"
                + " \n -Press Militar Barra 4 Series de 10Reps"
                + " \n -Mariposa marcuernas 4 Series de 10Reps"
                + " \n -Elevación Lateral Mancuernas 4 Series de 10Reps"
                + " \n -Posterios Mancuerna 4 Series de 10Reps"
                + " \n                 Cardio:"
                + " \n  -15 minutos en(Spinning,Eliptica o Caminadora)";
        vector3[1] = "                          ----Martes----"
                + "\n                             Pecho: "
                + "\n -Press Plano Barra 4 Series de 12Reps"
                + "\n -Press Inclinado Barra 4 Series de 12Reps"
                + "\n -Press Declinado Barra 4 Series de 12Reps"
                + "\n -Push Ups 4 Series de 12Reps"
                + "\n -Aperturas Lateral Plano 4 Series de 12Reps"
                + "\n                             Trapecios:"
                + "\n -Escogimientos Polea 4 Series de 15Reps"
                + "\n -Remo al cuello Barra 4 Series de 15Reps"
                + "\n -15 minutos en(Spinning,Eliptica o Caminadora)";
        vector3[2] = "                          ----Miercoles----"
                + "\n                              Espalda:"
                + "\n -Dominadas con peso 4 Series de 8Reps"
                + "\n -Jalón Abierto Polea 4 Series de 12Reps"
                + "\n -Jalon Cerrado Polea 4 Series de 12Reps"
                + "\n -Remo 90 con Barra 4 Series de 12Reps"
                + "\n -Remo Mancuernas Individual 4 Series de 12Reps"
                + "\n                               Antebrazo:"
                + "\n Curl de Antebrazo con Barra 4 Series de 15Reps"
                + "\n Flexión de Muñecas Marcuernas 4 Series de 15Reps"
                + "\n                                Cardio:"
                + "\n -15Minutos en(Spinning,Eliptica o Caminadora)";
        vector3[3] = "                           ----Jueves----"
                + "\n                              Biceps:"
                + "\n -Flexión de codo Barra 4 Series de 10Reps"
                + "\n -Flexión de codo Martillo 4 Series de 10Reps"
                + "\n -21 con Barra 4 Series "
                + "\n -Piramide Polea Barra 4 Series (10,10,10)"
                + "\n                              Triceps:"
                + "\n -Extensión de Codo Polea Mecate 4 Series de 10Reps"
                + "\n -Press Frances Marcuernas Isometrico 4 Series de (10,10,10)"
                + "\n -Copa Marcuenas 4 Series de 10Reps"
                + "\n -Extensión Codo Modificada 4 Series de 10Reps"
                + "\n                                Cardio:"
                + "\n -15 Minutos en(Spinning,Eliptica o Caminadora)";;
        vector3[4] = "                             ----Viernes----"
                + "\n -REALIZAR UNA CLASE DE FUNCIONALES-";
        vector3[5] = "\n -REPETIR UNA RUTINA DE LA SEMANA-"
                + "\n --TOTALMENTE PROHIBIDO LAS COMIDAS TRAMPAS--";

        if (objetivo == 1) {
            for (int i = 0; i < 6; i++) {
                JOptionPane.showMessageDialog(null, vector[i]);
            }//fin for

        }//fin if
        else if (objetivo == 2) {
            for (int i = 0; i < 6; i++) {
                JOptionPane.showMessageDialog(null, vector2[i]);
            }//fin for

        }//fin else if
        else if (objetivo == 3) {
            for (int i = 0; i < 6; i++) {
                JOptionPane.showMessageDialog(null, vector3[i]);
            }//fin for

        }//fin else
    }//fin escoja

}//fin clase rutina
