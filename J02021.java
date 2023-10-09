import java.util.Scanner;
public class J02021 {
    private static int n,k,ok;
    private static int[] a = new int[100];
    public static void Ktao(){
        for(int i = 1; i <= k; i++){
            a[i] = i;
        }
    }
    public static void Sinh(){
        int i = k;
        while(i >= 1 && a[i] == n-k+i) --i;
        if(i == 0) ok = 0;
        else{
            a[i]++;
            for(int j = i+1; j <= k; j++){
                a[j] = a[j-1]+1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Ktao();
        ok = 1;
        int cnt = 0;
        while(ok == 1){
            cnt++;
            for(int i = 1; i <= k; i++){
                System.out.print(a[i]);
            }
            System.out.print(" ");
            Sinh();
        }
        System.out.println();
        System.out.println("Tong cong co " + cnt +" to hop");
        sc.close();
    }
}

