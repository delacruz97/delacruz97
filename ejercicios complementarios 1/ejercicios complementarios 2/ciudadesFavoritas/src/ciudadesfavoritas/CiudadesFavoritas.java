/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudadesfavoritas;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear un ArrayList y cargarlo con tus ciudades
 * favoritas de Argentina, luego imprimir por pantalla
 * el ranking
 */
public class CiudadesFavoritas {
    public static void main(String[] args) {
        ArrayList<String> favourite;
        try (Scanner scanner = new Scanner(System.in)) {
            favourite = new ArrayList<>();
            boolean again = true;
            do {
                System.out.print("¿Quiere agregar una ciudad? [s/n]: ");
                switch (scanner.nextLine().charAt(0)) {
                    case 's':
                        System.out.print("Ingrese el nombre de la ciudad: ");
                        favourite.add(scanner.nextLine());
                        break;
                    case 'n':
                        again = false;
                        break;
                    default:
                        System.out.println("La opción ingresada no es valida.");
                        break;
                }
            } while (again);
        }

        System.out.println("Sus ciudades favoritas son: ");
        for (int i = 0; i < favourite.size(); i++) {
            System.out.println("#" + (i+1) + " - " + favourite.get(i));
        }
    }
}