import java.util.Scanner;

public class J02035 {
    public static int Solve(int[] a, int n){
        for(int i = 0; i < n-1; i++){
            if(a[i] > a[i+1]) return i+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            System.out.println(Solve(a,n));
        }   
        sc.close();
    }
}
