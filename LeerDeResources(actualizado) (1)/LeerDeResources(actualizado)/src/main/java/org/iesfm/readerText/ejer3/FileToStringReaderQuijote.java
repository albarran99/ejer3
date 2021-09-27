package org.iesfm.readerText.ejer3;


import java.io.*;

public class FileToStringReaderQuijote {

    public static String readFile(File file) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(file)
                     )) {

            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Hubo un erro al leer el archivo");
        }
        return builder.toString();
    }
}
