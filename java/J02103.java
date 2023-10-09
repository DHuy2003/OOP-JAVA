import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        int dem = 1;
        while(t > 0){    
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[][] a = new long[n][m];
            long[][] b = new long[m][n];
            long[][] c = new long[n+1][n+1];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextLong();
                     b[j][i] = a[i][j];
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < m; k++) c[i][j] += a[i][k] * b[k][j];
                }
            }
            System.out.println("Test " + dem +":");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
            dem++;
            t--;
        }
        sc.close();
    }
}
