//Realizar un programa que solicite por consola 2 números 
//enteros. Para luego imprimir el resultado de la suma,
//resta, multiplicación, división y módulo 
//(resto de la división) de ambos números.
package sumarestamuldiv;
import java.util.Scanner;

public class SumaRestaMulDiv {
    public static void main(String[] args) {
        int a;
        int b;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un numero: ");
            a = scanner.nextInt();
            System.out.print("Ingrese otro numero: ");
            b = scanner.nextInt();
        }

        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Multiplicación: " + (a*b));
        System.out.println("División: " + (a/b));
        System.out.println("Resto: " + (a%b));
    }
}