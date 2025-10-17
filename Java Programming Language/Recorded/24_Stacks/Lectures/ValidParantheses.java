import java.util.*;


public class ValidParantheses {
    public static void main(String[] args) {
        String str = "({}[{}]())";
        boolean ans = isValid(str);
        System.out.println(ans);
    }


    static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if( ch == '('  || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
                //closing
                if(stack.isEmpty()){
                    return false;
                }
                if( (stack.peek() == '(' && ch == ')') // ()
                    || (stack.peek() == '{' && ch == '}') // {}
                    || (stack.peek() == '[' && ch == ']')) {  // []
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        if(!stack.empty()){
            return false;
        } 

        return true;
        
    }
}
