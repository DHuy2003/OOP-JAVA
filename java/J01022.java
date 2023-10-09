import java.util.Scanner;

public class J01022 {
    public static long[] F = new long[100];
    public static String Solve(int n, long k){
        if(n == 0) return "0";
        if(n == 1) return "1";
        if(k <= F[n-2]) return Solve(n-2, k);
        else return Solve(n-1, k - F[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        F[0] = F[1] = 1L;
        for(int i = 2; i <= 93; i++) F[i] = F[i-2] + F[i-1];
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Solve(n,k));
        }
        sc.close();
    }
}