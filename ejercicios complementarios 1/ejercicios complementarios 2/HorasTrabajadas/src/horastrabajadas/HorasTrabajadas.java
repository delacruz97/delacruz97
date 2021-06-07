/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horastrabajadas;import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1)
 * y valor-por-hora(array2) del resumen de carga de horas
 * semanal de un empleado. Se debe generar otra lista que
 * contenga los totales y luego imprimir el total final a cobrar.
 */
public class HorasTrabajadas {
    public static void main(String[] args) {
        String[] days;
        ArrayList<Integer> workHours;
        ArrayList<Integer> pricePerHour;
        try (Scanner scanner = new Scanner(System.in)) {
            days = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
            workHours = new ArrayList<>();
            pricePerHour = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.println(days[i]);
                System.out.print("Ingrese cantidad de horas trabajadas: ");
                workHours.add(scanner.nextInt());
                
                System.out.print("Ingrese el precio por hora trabajada: ");
                pricePerHour.add(scanner.nextInt());
            }
        }

        ArrayList<Integer> totalPrices = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            totalPrices.add(workHours.get(i) * pricePerHour.get(i));
        }

        int cant = 0;
        for (int i = 0; i < 5; i++) {
            cant += totalPrices.get(i);
            System.out.println(days[i] + ": " + totalPrices.get(i));
        }

        System.out.print("\nTotal final: $" + cant);
    }
}
