package StreamsExercises;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 2. Crea un programa que escriba en un archivo los números del 1 al 10, uno en cada línea.
 */
public class WriteNumbers {
    public static void main (String[] args) throws IOException {
        //Imp: Al ejecutar esta línea, se CREA un nuevo documento numbers.txt en la ruta especificada
        Writer writer = new FileWriter("myfiles/streamsexercises/mynumbers.txt");

        for(int i = 1; i <= 10; i++) {
            writer.write( i + "\n");
        }
        writer.close();
    }


}
