import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void out(BigInteger x,BigInteger y){
        BigInteger res = y.subtract(x);
        String ans = res.toString();
        long t = ans.length();
        while( t < y.toString().length()){
            System.out.print("0");
            t++;
        } 
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //sc.nextLine();
        while(t-- > 0){
            String a = sc.next();
            BigInteger x = new BigInteger(a, 10);
            String b = sc.next();
            BigInteger y = new BigInteger(b, 10);
            if(a.length() < b.length()) out(x,y);
            else out(y,x);
        }
        sc.close();
    }
}
