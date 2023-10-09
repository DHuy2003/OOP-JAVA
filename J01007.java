import java.util.Scanner;

public class J01007 {
     public static String Fibo(long n){
        if(n == 0 || n == 1) return "YES";
        long f0 = 0L, f1 = 1L;
        for(int i = 2; i < 94; i++){
            long fn = f1 + f0;
            if(fn == n) return "YES";
            else{
                f0 = f1;
                f1 = fn;
            }  
        }
        return "NO";       
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            long n = input.nextLong();
            System.out.println(Fibo(n));
            t--;
        }
        input.close();
    }
}
