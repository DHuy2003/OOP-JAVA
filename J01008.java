import java.util.Scanner;

public class J01008 {
     public static void Nto(long n){
        for(int i = 2; i <= Math.sqrt(n); i++){    
            if(n % i == 0){
                int cnt = 0;
                while(n % i == 0){
                    cnt++;
                    n /= i;
                }
                System.out.print(i + "(" + cnt + ") ");
            }
        }
        if(n != 1) System.out.print(n + "(" + 1 + ")"); 
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int x = 0;
        while(t>0){
            long n = input.nextLong();
            x++;
            System.out.print("Test " + x + ": ");
            Nto(n);
            System.out.println();
            t--;
        }
        input.close();
    }
}
