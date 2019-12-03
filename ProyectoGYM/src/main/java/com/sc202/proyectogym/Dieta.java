package com.sc202.proyectogym;

import javax.swing.JOptionPane;

public class Dieta {

    public void Seleccion() {

        int objetivo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Objetivo a cumplir? "
                + "\n1=Subir Peso  \n2=Perder Peso\n3=Definición"));
        switch (objetivo) {
            case 1:
                JOptionPane.showMessageDialog(null, "Su dieta para subir de peso:"
                        + "\nDebe realizar 5 comidas al dia:"
                        + "\nDesayuno: 1tz y 1/2 de Pinto, 5 Huevos, Vaso de Leche y Fruta o Fruta Normal \nEjemplos: \n 1/2Banano\n 1 Manzana Gala \n 1 Naranja \n 1 Pera\n 1 Melocotón\n 1 Mandarina \n 8 Fresa\n 8 Uvas "
                        + "\n Merienda Mañana: \n 1/4Tz de Avena o Cereal Integrar \n 1 Fruta "
                        + "\n Almuerzo: \n 1 tz y 1/2 de Arroz,1 Tz de Fideos ,3 Papas grandes o 8 Papas pequeñas \n 140gr de (Pollo,Carne o Pescado) \n 1 Tz de Vegetales o 1 Tz de Ensalada\n 1/2Tz de Frijoles,Lentejas o Garbanzos "
                        + "\n Merienda tarde: \n 2 Rebanadas de Pan, 2 Huevos,1 Vaso de Leche y 1 Fruta \n O tambien:\n Un Sandwich de Jamón y Queso, 1vaso de Leche(250ml) y 1 Fruta "
                        + "\n Cena: \n 1 tz de Arroz \n 120 gr de: (Pollo,Carne o Pescado) \n 1tz de Vegetales o 1tz de ensalada \n 1/4tz de Frijoles,Lentejas o Garbanzos");

                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Su dieta para Perder Peso: "
                        + "\n Debe realizar 5 Comidas al dia:"
                        + "\n Desayuno: 1/2 tz de Pinto, \n2 Huevos Vaso de leche LIGHT,  \nuna Fruta \n Ejemplos: \n 1/2Banano\n 1 Manzana Gala \n 1 Naranja \n 1 Pera\n 1 Melocotón\n 1 Mandarina \n 8 Fresa\n 8 Uvas "
                        + "\nMerienda Mañana: \n1 Fruta y 1 Pan integral o 1 Galleta soda Integral"
                        + "\n Almuerzo: \n 1/2 Tz de Arroz,1/2 de Fideos o 4 papas pequeñas  \n 120gr de proteina(Pollo,Carnes o Pescado),\n1tz de Vegetales o 1 tz Y 1/2 de Ensalada \n1/3 tz de Frijoles,Lentejas o Garbanzos "
                        + "\n Merienda tarde: \n 1 Rebanada de pan Integral con 1 huevo o jamon y queso \n 1 Yogurt pequeño LIGHT  \n 1 Fruta Pequeña "
                        + "\nCena: \n 1/2 tz de Arroz, 1/2 tz de fideos, 4 papas pequeñas \n120gr de proteina (Pollo,Carne o Pescado) \n1tz y 1/2 de Vegetales o 1tz y 1/2 de Ensalada \n 1/4 tz de Frijoles, Lentejas o Garbanzos");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Su dieta para Definición: "
                        + "\n Debe realizar 5 comidas al dia: "
                        + "\n Desayuno: \n1/2 de Pinto, \n4-6 Huevos (solo 1 yema) \n Vaso de Leche Light \b vaso de Jugo de Naranja o una fruta \n Ejemplos:\n 1/2Banano\n 1 Manzana Gala \n 1 Naranja \n 1 Pera\n 1 Melocotón\n 1 Mandarina \n 8 Fresa\n 8 Uvas Etc "
                        + "\n Merienda mañana: \n Un Sandwich de Jamón y Queso que el pan sea Integral o bajo en GRASA  \n1 fruta"
                        + "\n Almuerzo: \n 1/2 tz de Arroz , fideos o 4 papas pequeñas \n 180gr de protenia (Pollo,Carne o Pescado(recomendado)) \n1 tz y 1/2 de Vegetales o 1tz y 1/2 de Ensalada \n 1/2 de Frijos, Lentejas o Garbanzos"
                        + "\n Merienda en la tarde: \n Un Sandwich de Jamon y Queso con Pan Integral o bajo en grasa  \n1 Fruta pequeña "
                        + "\n Cena: \n1/2 de Arroz, fideos o 4 papas \n160-180gr de Proteina(Pollo,Carne o Pescado(recomendado))\n1/4 tz de Frijoles,lentejas o garbanzos ");
                break;
        }//fin switch
    }//fin seleccion

}// fin dieta
