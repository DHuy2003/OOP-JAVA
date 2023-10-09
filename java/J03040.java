import java.util.Scanner;

public class J03040 {
    public static boolean Check1(String s){
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) >= s.charAt(i+1)) return false;
        }
        return true;
    }
    public static boolean Check2(String s){
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)) return false;
        }
        return true;
    }
    public static boolean Check3(String s){
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) return true;
        return false;
    }
    public static boolean Check4(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = s.substring(5);
            String tmp = "";
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))) tmp += s.charAt(i);
            }
            if(Check1(tmp) || Check2(tmp) || Check3(tmp) || Check4(tmp))System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
