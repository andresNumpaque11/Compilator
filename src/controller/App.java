
package controller;

import model.Compilator;
import model.Persistent;

/**
 *
 * @author Andres
 */
public class App {
    
    private Compilator compilator;

    public App() {
        compilator = new Compilator();
        System.out.println("el codigo esta balanceado??"+compilator.isBalanced(Persistent.readTxt("Calculator.java")));
        System.out.println("el numerode lineas del codigo es: "+compilator.countLines());
    }
    
    public static void main(String[] args) {
        new App();
    }
    
    
    
    
}
