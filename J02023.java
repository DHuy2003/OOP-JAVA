import java.util.Scanner;

public class J02023 {
    public static void Solve(int n, int s){
        int tong = s;
        if(n*9 < s){
            System.out.println("-1 -1");
            return;
        } 
        if(n > 1 && s == 0){
            System.out.println("-1 -1");
            return;
        }
        if(n == 1){
            if(s <= 9){
                System.out.println(s + " " + s);
                return;
            } 
            else{
                System.out.println("-1 -1");
                return;
            } 
        }
        int lon[] = new int[n];
        int be[] = new int[n];
        for(int i = 0; i < n; i++){
            if(s != 0){
                if(s >= 9){
                    lon[i] = 9;
                    s -= 9;
                }
                else{
                    lon[i] = s;
                    s = 0;
                }
            } else break;
        }
        tong--;
        for(int i = n-1; i > 0; i--){
            if(tong != 0){
                if(tong >= 9){
                    be[i] = 9;
                    tong -= 9;
                }
                else{
                    be[i] = tong;
                    tong = 0;
                }
            } else break;
        }
        be[0] = tong + 1;
        for(int x : be) System.out.print(x);
        System.out.print(" ");
        for(int x : lon) System.out.print(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        Solve(n,s);
        sc.close();
    }
}