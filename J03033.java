import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger BC = a.multiply(b);
            BigInteger UCLN = a.gcd(b);
            System.out.println(BC.divide(UCLN));
        }
        sc.close();
    }
}
