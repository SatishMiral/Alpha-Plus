import java.util.*;
public class DuplicateParanthesis {
    public static boolean duplicateParanthesis(String str){
        Stack<Character> s = new Stack<>();
        // int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // int count = 0;

            if(ch == ')'){
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }
                else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(a+b)";
        System.out.println(duplicateParanthesis(str));
    }
}
