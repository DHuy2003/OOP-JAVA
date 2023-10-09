import java.util.Scanner;

public class J01021 {
    public static long MOD = 1000000007L;
    public static long Solve(long a, long b){
        long res = 1L;
        while(b > 0){
            if(b % 2 == 1){
                res *= a;
                res %= MOD;
            }
            a *= a;
            a %= MOD;
            b /= 2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            long a = input.nextLong();
            long b = input.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(Solve(a,b));
        }
        input.close();
    }
}
