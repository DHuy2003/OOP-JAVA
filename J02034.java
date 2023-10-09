import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] F = new boolean[1000];
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            F[a[i]] = true;
        }
        int ok = 0;
        for(int i = 1; i <= a[n-1]; i++){
            if(F[i] == false){
                ok++;
                System.out.println(i);
            }
        }
        if(ok == 0) System.out.println("Excellent!");
        sc.close();
    }
}
