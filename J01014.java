import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J01014 {
    public static void Nto(long n){
        Vector <Long> v = new Vector<>();
        for(long i = 2; i <= Math.sqrt(n); i++){    
            if(n % i == 0){
                v.add(i);
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        if(n != 1) v.add(n);
        Long x =  Collections.max(v);
        System.out.println(x);
        v.clear();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            long n = input.nextLong();
            Nto(n);
            t--;
        }
        input.close();
    }
}
