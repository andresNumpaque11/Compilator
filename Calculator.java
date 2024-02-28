package model;

import java.util.Stack;

/**
 *
 * @author Andres Numpaque
 */
public class Calculator {

    public Calculator() {
    }
    
    public double EvaluateExpression(String expresion){
        double result = 0;
        Stack<Double> operand = new Stack<>);
        Stack<Character> operator = new Stack<>();
        
        for (int i = 0; i < expresion.length(); i++) {
            char symbol = expresion.charAt(i);
            if (Character.isDigit(symbol)) {
                StringBuilder numBuilder = new StringBuilder();
                while (i<expresion.length() && (Character.isDigit(expresion.charAt(i)) ||expresion.charAt(i) == '.') ) {                    
                    numBuilder.append(expresion.charAt(i));
                    i++;
                }
                i--;
                operand.push(Double.)
            }
            
        }
        return result;
    }
    
}