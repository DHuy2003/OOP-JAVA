import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J02102 {
    public static int n;
    public static int[][] a;
    public static Vector<Integer> v = new Vector<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
                v.add(a[i][j]);
            }
        }
        Collections.sort(v);
        int cnt = 0;
        int h1 = 0, h2 = n-1, c1 = 0, c2 =n-1;
        while(h1 <= h2 && c1 <= c2){
            for(int i =c1; i <= c2; i++){
                a[h1][i] = v.get(cnt++);
            }
            h1++;
            for(int i = h1; i <= h2; i++){
                a[i][c2] = v.get(cnt++);
            }
            c2--;
            if(h1 <= h2){
                for(int i = c2; i >= c1; i--){
                    a[h2][i] = v.get(cnt++);
                }
                h2--;
            }
            if(c1 <= c2){
                for(int i = h2; i >= h1; i--){
                    a[i][c1] = v.get(cnt++);
                }
                c1++;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
