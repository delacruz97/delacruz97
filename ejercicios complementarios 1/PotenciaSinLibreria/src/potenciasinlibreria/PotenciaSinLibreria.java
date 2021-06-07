/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenciasinlibreria;
import java.util.Scanner;

/**
 * Se desea una aplicación que solicite 2 números enteros
 * y realice la operación de potencia (sin uso de librerías).
 */
public class PotenciaSinLibreria {
    public static void main(String[] args) {
        int a;
        int b;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un numero: ");
            a = scanner.nextInt();
            System.out.print("Ingrese el exponente: ");
            b = scanner.nextInt();
        }

        int res = 1;
        for (int i = 1; i <= b ; i++) {
            res *= a;
        }

        System.out.println("El resultado es: " + res);
    }
}