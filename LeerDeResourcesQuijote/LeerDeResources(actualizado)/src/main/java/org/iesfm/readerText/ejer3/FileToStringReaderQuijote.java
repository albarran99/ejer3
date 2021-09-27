package org.iesfm.readerText.ejer3;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class FileToStringReaderQuijote {

    private static final Logger log = LoggerFactory.getLogger(
            FileToStringReaderQuijote.class);

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
            log.error("Hubo un erro al leer el archivo");
        }
        return builder.toString();
    }
}
