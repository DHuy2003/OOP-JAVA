import java.util.Scanner;

public class J02022 {
    private static int n,ok;
    private static int[] a = new int[100];
    public static void Ktao(){
        for(int i = 1; i <= n; i++){
            a[i] = i;
        }
    }
    public static void Sinh(){
        int i = n-1;
        while(i >= 1 && a[i] > a[i+1]) --i;
        if(i == 0) ok = 0;
        else{
            int j = n;
            while(a[j] < a[i]) j--;
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            int l = i+1, r = n;
            while(l < r){
                int x = a[l];
                a[l] = a[r];
                a[r] = x;
                l++;
                r--;
            }
        }
    }
    public static boolean Check(){
        for(int i = 2; i <= n; i++){
            if(Math.abs(a[i]-a[i-1]) == 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            Ktao();
            ok = 1;
            while(ok == 1){
                if(Check() == true){
                    for(int i = 1; i <= n; i++){
                        System.out.print(a[i]);
                    }
                    System.out.println();   
                }
                 Sinh();
            }
        }
        sc.close();
    }
}
