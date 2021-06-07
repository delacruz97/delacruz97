//Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
//nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
//Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz”
//y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
//Observacion: Los 2 argumentos indican con que valor se arranca a calcular y
//el segundo con qué valor debe frenar (no se incluye en el cálculo)
//Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

package dosargumentos;
public class Fizz {
    public static void main(String[] args) {
        String[] array = fizzBuzz(1, 6);
        for (String s : array) {
            System.out.print(s + " - ");
        }
    }

    public static String[] fizzBuzz(int initial, int limit) {
        if (limit < initial)
            throw new RuntimeException("El primer numero debe ser menor al segundo.");

        String[] array = new String[limit - 1];
        array[0] = String.valueOf(initial);
        for (int i = 1; i < array.length; i++) {
            if (((initial + i) % 2 == 0) && ((initial + i) % 3 == 0)) {
                array[i] = "FizzBuzz";
            } else if ((initial + i) % 3 == 0) {
                array[i] = "Buzz";
            } else if ((initial + i) % 2 == 0) {
                array[i] = "Fizz";
            } else {
                array[i] = String.valueOf(initial + i);
            }

        }

        return array;
    }
}

