
import java.util.Scanner;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        boolean[] F = new boolean[1001];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
            F[a[i]] = true;
        } 
        for(int i = 0 ; i < m; i++){
            b[i] = sc.nextInt();
            F[b[i]] = true;
        } 
        for(int i = 0 ; i < F.length; i++){
            if(F[i] == true) System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
