//Postfix
/*

 */

import java.util.*;

public class Postfix{

public static int evaluatePostfix(String expression) {

Stack<Integer> stack = new Stack<>();
String[] token = expression.split(" ");
for(String t: token)
{
    if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
        int val1 = stack.pop();
        int val2 = stack.pop();

        switch(t){
        case "+": stack.push(val1 + val2);
                  break;
        case "-": stack.push(val2 - val1);
                  break;
        case "*": stack.push(val1 * val2);
                  break;
        case "/": stack.push(val2 / val1);
                  break;
        
            
    }
    

    }
    else{
        stack.push(Integer.parseInt(t));
    }
    
    

}

// Write your logic here

return stack.pop();
}

public static void main(String[] args) {

String expression = "5 2 + 3 *";

System.out.println(evaluatePostfix(expression));
}
}
