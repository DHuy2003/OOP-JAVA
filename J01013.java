import java.util.Scanner;

public class J01013 {
    public static boolean[] Prime = new boolean[2000001];
    public static void Sang(){
        for(int i = 0; i < 2000000; i++) Prime[i] = true;
        Prime[0] = Prime[1] = false;
        for(int i = 2; i*i < 2000000; i++){
            if(Prime[i] == true){
                for(int j = i*i; j < 2000000; j += i){
                    Prime[j] = false;
                }
            }
        }
    }
    public static long Nto(int n){
        long tong = 0L;
        for(int i = 2; i <= Math.sqrt(n); i++){    
                while(n % i == 0){
                    tong += i;
                    n /= i;
            }
        }
        if(n != 1) tong += n; 
        return tong;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        Sang();
        long ans = 0L;
        while(t>0){
            int n = input.nextInt();
            if(Prime[n] == true) ans += n;
            else ans += Nto(n);
            t--;
        }
        System.out.println(ans);
        input.close();
    }
}