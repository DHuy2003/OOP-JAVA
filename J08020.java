import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        int n = sc.nextInt();
        while (n-- > 0) {
            String tmp = sc.next();
            for(int i =0; i < tmp.length(); i++){
                char x = tmp.charAt(i);
                if(x == '(' || x == '{' || x == '[') s.push(x);
                else{
                    if(!s.empty() && x == ')' && s.peek() == '(') s.pop();
                    else{
                        if(!s.empty() && x == ']' && s.peek() == '[') s.pop();
                        else  if(!s.empty() && x == '}' && s.peek() == '{') s.pop();
                    }
                }
            }
            if(!s.empty()) System.out.println("NO");
            else System.out.println("YES");
            s.clear();
        }
        sc.close();
    }
}
