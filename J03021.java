import java.util.Scanner;

public class J03021 {
    public static String[] a = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    public static int Ktra(char x){
        for(int i = 0; i < a.length; i++){
            String s = a[i];
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == x) return i;
            }
        }
        return 0;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = s.toUpperCase();
            String tmp = "";
            for(int i = 0; i < s.length(); i++){
                tmp += Ktra(s.charAt(i));
            }
            StringBuffer s1 = new StringBuffer(tmp);
            String s2 = s1.reverse().toString();
            if(s2.equals(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
