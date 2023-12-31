import java.util.Arrays;
import java.util.Scanner;

public class J02027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i]= sc.nextInt();
            }
            Arrays.sort(a);
            int cnt = 0;
            for(int i = 0; i < n; i++){
                cnt += Arrays.binarySearch(a,i,n , k+a[i]) - i - 1;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
