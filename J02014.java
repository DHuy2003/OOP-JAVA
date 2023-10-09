import java.util.*;
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n+1];
            long sum = 0L;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                sum += a[i];
            } 
            long sum_left = 0L;
            boolean ok = false;
            for(int i = 0; i < n; i++){
                sum -= a[i];
                if(sum == sum_left){
                    System.out.println(i+1);
                    ok = true;
                    break;
                }
                sum_left += a[i];
            }
            if(ok == false) System.out.println(-1);
        }
        sc.close();
    }
}
