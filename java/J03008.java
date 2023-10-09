import java.util.Scanner;

public class J03008 {
    public static Boolean Nto(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static Boolean Check(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Nto(Character.getNumericValue(s.charAt(i)))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //sc.nextLine();
        while(t-- > 0){
            String s = sc.next();
            StringBuffer s1 = new StringBuffer(s);
            String s2 = s1.reverse().toString();
            if(s2.equals(s) && Check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
