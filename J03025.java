import java.util.Scanner;

public class J03025 {
    public static String Check(String s){
        int n = s.length();
        int cnt = 0;
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)) cnt++;
        }
        if(cnt == 1 || (cnt == 0 && n % 2 == 1)) return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(Check(s));
        }
        sc.close();
    }
}
