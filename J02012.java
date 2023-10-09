import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = a[i], pos = i-1;
            while(pos >= 0 && a[pos] > x){
                a[pos+1] = a[pos];
                --pos;
            }
            a[pos+1] = x;
            System.out.print("Buoc " + i +": ");
            for(int k = 0; k <= i; k++) System.out.print(a[k] + " ");
            System.out.println();
        }
        sc.close();
    } 
}
