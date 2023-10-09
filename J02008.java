import java.util.*;
public class J02008 {
    public static long UCLN(long a, long b){
        if(b == 0) return a;
        else return UCLN(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long ans = 1L;
            for(int i = 2; i <= n; i++){
                ans = (ans*i) / UCLN(ans, i);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
