package  model;
import structures.MyStack;

public class Compilator {
        private MyStack<Character> stack;

    public Compilator() {
        stack = new MyStack<>();
    }
    public  boolean isBalanced(String code) {
        for (char c : code.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }else{
                    char top = stack.pop();
                    if ((c == '}'&& top != '{')||(c == ']'&& top != '[')||(c == ')'&& top != '(') ) {
                      return false;  
                    }
                }                
            }
        }

        return stack.isEmpty();
    }
    
    public int countLines(){
        return Persistent.getNumLines();
    }

    
}
