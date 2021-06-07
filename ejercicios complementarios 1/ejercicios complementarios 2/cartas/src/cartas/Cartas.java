/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartas;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Crear una lista que contenga como elementos
 * la numeración de cartas de una baraja francesa
 * (solo los valores, no figuras). Se deberá cargar
 * el ArrayList (en orden), imprimir, imprimir en
 * orden inverso (reverse), desordenar (mezclar) el
 * arrayList y volver a imprimir.
 */
public class Cartas {
    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            cartas.add("Carta " + (i + 1));
        }

        System.out.println("Orden normal");
        cartas.forEach(cartas -> {
            System.out.println(cartas);
        });

        Collections.reverse(cartas);
        System.out.println("Orden inverso");
        cartas.forEach(cartas -> {
            System.out.println(cartas);
        });

        Collections.shuffle(cartas);
        System.out.println("Orden aleatorio");
        cartas.forEach(System.out::println);
    }
}
