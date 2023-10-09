
import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = "";
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                s += Integer.toString(x);
            }
           // System.out.println(s);
            String s1 = "";
            for(int i = s.length()-1; i >= 0; i--){
                s1 += s.charAt(i);
            }
            //System.out.println(s1);
            if(s.equals(s1)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
