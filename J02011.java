import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n-1; i++){
            int min_pos = i;
            for(int j = i+1; j < n; j++){
                if(a[min_pos] > a[j]){
                    min_pos = j;
                }
            }
            int tmp = a[min_pos];
            a[min_pos] = a[i];
            a[i] = tmp;
            System.out.print("Buoc " + (i+1) +": ");
            for(int k = 0; k < n; k++) System.out.print(a[k] + " ");
            System.out.println();
        }
        sc.close();
    } 
}
