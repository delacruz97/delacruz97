package demayusculaminuscula;
import java.util.Scanner;

/**
 * Realizar un Programa que dado un String de entrada
 * en minúsculas lo convierta por completo a mayúsculas.
 * Sin uso de métodos o librerías que realicen toUppercase().
 */
public class DeMayusculaMinuscula {
    public static void main(String[] args) {
        String text;
        try (Scanner scanner = new Scanner(System.in)) {
            text = scanner.nextLine();
        }
        char letter;

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);
            if (letter >= 97 && letter <= 122) {
                letter -= 32;
            }

            System.out.print(letter);
        }
    }
}