import java.util.Scanner;
import java.util.Vector;

public class J03005 {
    public static Vector<String> v = new Vector<>();
    public static void Xuli(String s){
        char c = s.charAt(0);
        c = Character.toUpperCase(c);
        String tmp = "";
        for(int i = 1; i < s.length(); i++){
            tmp += s.charAt(i);
        }
        tmp = c + tmp;
        v.add(tmp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            int i = 0;
            while(i < s.length()){
                if(s.charAt(i) == ' '){
                    String tmp = s.substring(0, i);
                    Xuli(tmp);
                    s = s.substring(i);
                    s = s.trim();
                    i = 0;
                }
                i++;
            }
            Xuli(s);
            for(int j = 1; j < v.size(); j++){
                System.out.print(v.get(j));
                if(j==v.size()-1) System.out.print(", ");
                else System.out.print(" ");
            }
            String x = v.get(0);
            x =x.toUpperCase();
            System.out.println(x);
            //System.out.println(v);
            v.clear();
        }
        sc.close();
    }
}
