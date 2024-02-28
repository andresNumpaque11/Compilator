package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Persistent {
    
     private static int numLines = 0;

    public static String readTxt(String path) {
        String text = "";
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                text += linea + "\n";
                numLines++;
            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            System.out.println("Error leyendo el archivo");
        }
        return text;
    }

    public static void writeTxt(String path, String message) {
        try {
            FileWriter fichero = new FileWriter(path);
            PrintWriter pw = new PrintWriter(fichero);

            pw.println(message);

            fichero.close();
        } catch (IOException ex) {
            System.out.println("no pudo escribirse el archivo correctamente");
        }

    }

    public static int getNumLines() {
        return numLines;
    }
    
}
