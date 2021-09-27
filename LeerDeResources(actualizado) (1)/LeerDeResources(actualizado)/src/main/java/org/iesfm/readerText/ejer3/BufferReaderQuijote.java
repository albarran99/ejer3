package org.iesfm.readerText.ejer3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderQuijote {

    private static final Logger log = LoggerFactory.getLogger(BufferReaderQuijote.class);

    public static void readQuijote() throws FileNotFoundException {
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(FileToStringReaderQuijote.class.getResource(
                                     "/el_quijote.txt").getFile())
                     )) {
            String line = reader.readLine();

            while(line != null) {
                log.info(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
