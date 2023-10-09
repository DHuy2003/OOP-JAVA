import java.util.ArrayList;
import java.util.Scanner;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> a = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            a.add(s.charAt(i));
        }
        while(true){
            boolean ok = true;
            for(int i = 0; i < a.size()-1; i++){
                if(a.get(i) == a.get(i+1)){
                    a.remove(i);
                    a.remove(i);
                    ok = false;
                    break;
                }
            }
            if(ok) break;
        }
        if(a.size() == 0) System.out.println("Empty String");
        else{
            for(int i = 0; i < a.size(); i++){
                System.out.print(a.get(i));
            }
            System.out.println();
        }
        sc.close();
    }
}
