
package letradada;


import java.util.Scanner;

/**
 * Dado un String de entrada (frase, texto, etc)
 * calcular la cantidad de veces que aparece una
 * letra dada.
 */
public class LetraDada {
    public static void main(String[] args) {
        String text;
        char letter;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el texto: ");
            text = scanner.nextLine();
            System.out.print("Ingrese la letra para contar: ");
            letter = scanner.nextLine().charAt(0);
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (letter == text.charAt(i)) {
                count++;
            }
        }

        System.out.println("Cantidad de veces contadas: " + count);
    }
}