import java.util.Scanner;

public class J01009 {
    public static long Gthua(int n){
        if(n == 0 || n == 1) return 1;
        else return n * Gthua(n-1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0L;
        for(int i = 1; i <= n; i++){
            sum += Gthua(i);
        }
        System.out.println(sum);
        input.close();
    }
}
