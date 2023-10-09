import java.util.Scanner;
public class J01006 {
    public static long Fibo(long n){
        if(n == 0 || n == 1) return n;
        else{
            long f0 = 0, f1 = 1;
            long fn = 1L;
            for(int i = 2; i < n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;   
            }
            return fn;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            long k = input.nextLong();
            System.out.println(Fibo(k));
            t--;
        }
        input.close();
    }
}