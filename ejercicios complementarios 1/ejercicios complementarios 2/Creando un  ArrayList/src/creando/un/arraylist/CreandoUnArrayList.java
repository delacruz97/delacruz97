/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creando.un.arraylist;
import java.util.ArrayList;

/**
 * Crear un ArrayList, agregar 5 números enteros.
 * Luego, agregar un número entero al principio de
 * la lista y otro al final. Por último, iterar e
 * imprimir los elementos de la lista y el tamaño de
 * la misma (antes y después de agregar a en la primera
 * y última posición).
 */
public class CreandoUnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Lista inicial");
        System.out.println("Tamaño: " + numbers.size());
        for (int i : numbers) {
            System.out.println(i);
        }

        numbers.add(0, 33);
        numbers.add(993);
        System.out.println("Lista final");
        System.out.println("Tamaño: " + numbers.size());
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
