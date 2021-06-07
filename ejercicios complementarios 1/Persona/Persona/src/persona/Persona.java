/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import java.util.Scanner;

/**
 * Crear una aplicación que solicite de entrada los datos de una persona en este orden:
 * Nombre y Apellido
 * Edad
 * Dirección
 * Ciudad
 *
 * Luego imprimirá el siguiente mensaje:
 * {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */
public class Persona {
    public static void main(String[] args) {
        String fullname;
        int age;
        String address;
        String city;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre completo: ");
            fullname = scanner.nextLine();
            System.out.print("Ingrese su edad: ");
            age = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese su dirección: ");
            address = scanner.nextLine();
            System.out.print("Ingrese su ciudad: ");
            city = scanner.nextLine();
        }

        Data data = new Data(fullname, age, address, city);
        System.out.println(data);
    }
}

class Data {
    String full_name;
    int age;
    String address;
    String city;

    public Data(String full_name, int age, String address, String city) {
        this.full_name = full_name;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" + this.city + "} - {" + address + "} - {"+ age +"} - {" + full_name + "}";
    }
}