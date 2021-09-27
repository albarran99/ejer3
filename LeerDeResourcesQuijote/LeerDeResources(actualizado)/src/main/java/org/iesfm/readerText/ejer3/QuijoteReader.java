package org.iesfm.readerText.ejer3;


import java.io.File;
import java.io.FileNotFoundException;

public class QuijoteReader {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/src/resources/el_quijote.txt");

        BufferReaderQuijote.readQuijote();

        FileToStringReaderQuijote.readFile(file);


    }

}
