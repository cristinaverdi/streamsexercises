package StreamsExercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * 4. Haz un programa que le pida números al usuario y los vaya escribiendo en un archivo (separados por comas).
 Cuando el usuario introduzca un 0, se dejarán de pedir números y se escribirá en el mismo archivo el total de
 la suma de los números introducidos
 */
public class WriteNumbersAndTotal {
    public static void main(String[] args) throws IOException {

        //Pide números leyendo del teclado
        //Escribe números en un archivo nuevo.
        //Escribe el total de la suma de estos números al final.

        Scanner keyboardScanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("myfiles/streamsexercises/total.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        System.out.println("**Type 0 to stop entering numbers**");
        System.out.print("Please enter a number: ");

        int number = keyboardScanner.nextInt();
        String numbers = (number + ", ");

        int sum = number;

        while (number != 0) {
            System.out.print("Please enter a number: ");
            number = keyboardScanner.nextInt();
            if (number == 0) {
                keyboardScanner.close();
                numbers = numbers.substring(0, numbers.lastIndexOf(','));
                numbers = numbers + "\n";
            } else {
                numbers = numbers + (number + ", ");
                sum += number;
            }
        }
        bufferedWriter.write(numbers);
        keyboardScanner.close();
        System.out.println("Reading process closed");

        bufferedWriter.write("Total is: " + sum);
        bufferedWriter.close();
    }
}
