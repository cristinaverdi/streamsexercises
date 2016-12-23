package StreamsExercises;

import java.util.Scanner;

/**
 * Ejercicios para practicar el I/O (input/output):

 1. Haz un programa que pida números sucesivamente y deje de pedirlos cuando el usuario escriba 0.
 A continuación, muestra la suma de todos los números introducidos.

 2. Crea un programa que escriba en un archivo los números del 1 al 10, uno en cada línea.

 3. Crea un programa que lea un archivo con números (un número por línea) y que muestre la suma de todos ellos.

 4. Haz un programa que le pida números al usuario y los vaya escribiendo en un archivo (separados por comas).
 Cuando el usuario introduzca un 0, se dejarán de pedir números y se escribirá en el mismo archivo el total de
 la suma de los números introducidos
 */
public class PrintSumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        int sum = number;
        while(number != 0) {
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();
            sum += number;
        }
        scanner.close();
        System.out.println(sum);
    }
}
