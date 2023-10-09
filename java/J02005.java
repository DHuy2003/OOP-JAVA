
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        boolean[] F = new boolean[1001];
        Vector<Integer> v = new Vector<>();
        for(int i = 0 ; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0 ; i < m; i++) b[i] = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                if(F[a[i]] == false && a[i] == b[j]){
                    v.add(a[i]);
                    F[a[i]] = true;
                } 
            }
        }
        Collections.sort(v);
        for(int i = 0; i < v.size(); i++){
            System.out.print(v.get(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
