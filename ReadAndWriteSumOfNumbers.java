package StreamsExercises;

import java.io.*;
import java.util.Scanner;

/**
 * 3. Crea un programa que lea un archivo con números (un número por línea) y que muestre la suma de todos ellods.
 */

public class ReadAndWriteSumOfNumbers {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("myfiles/streamsexercises/mynumbers.txt");
        Scanner scanner = new Scanner(in);
        int sum = 0;
        while(scanner.hasNextInt()) {
            int line = scanner.nextInt();
            sum += line;
        }
        System.out.println("Total is: " + sum);
        in.close();
        scanner.close(); //hay que ponerlo? Se cierra al cerrar el inputStream? Creo que no.
        BufferedWriter writer = new BufferedWriter(new FileWriter("myfiles/streamsexercises/mynumbers.txt", true));
        String total = "Total is: " + sum + "\n";
        writer.write(total);
        writer.close();
    }
}
