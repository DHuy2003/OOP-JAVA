import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[1001][20];
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = 1; j<= 3; j++){
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
            //System.out.println(sum);
            if(sum > 1) cnt++;
        }
        System.out.println(cnt);
        
        sc.close();
    }
}
