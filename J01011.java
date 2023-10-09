import java.util.Scanner;

public class J01011 {
    public static long UCLN(long a, long b){
        if(b == 0) return a;
        else return UCLN(b, a%b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            t--;
            long a = input.nextLong();
            long b = input.nextLong();
            long c = UCLN(a, b);
            System.out.println( a*b/c + " " + c );
        }
        input.close();
    }
}