import java.util.Scanner;
public class J01004 {
    public static boolean IsPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int x = input.nextInt();
            if(IsPrime(x)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        input.close();
    }
}
