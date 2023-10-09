import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J02024 {
    public static Vector<String> v = new Vector<String>();
    //public static Vector<Integer> tmp = new Vector<Integer>();
    public static boolean ok;
    public static int n;
    public static int[] a,b;
    static void Ktao(){
        b = new int[n];
        for(int i = 0; i < n; i++) b[i] = 0;
    }
    static void Sinh(){
        int i = n-1;
        while(i >= 0 && b[i] == 1){
            b[i] = 0;
            i--;
        }
        if(i == -1) ok = false;
        else b[i] = 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int[] c = new int[n];
            int j = n-1;
            for(int i = 0; i < n; i++){
                c[j] = a[i];
                j = j-1;
            }
            Ktao();
            ok = true;
            while(ok){
                int sum = 0;
                for(int i = 0; i < n; i++){
                    if(b[i] == 1) sum += c[i] * b[i];
                }
                if(sum % 2 != 0){
                    String tmp = "";
                    for(int i = 0; i < n; i++){
                        if(b[i] == 1){
                            tmp += Integer.toString(c[i]*b[i]);
                        }
                    }
                    v.add(tmp);
                }
                Sinh();
            }
            Collections.sort(v);
            for(int i = 0; i < v.size(); i++){
                for(int k = 0; k < v.get(i).length(); k++){
                    System.out.print(v.get(i).charAt(k) + " ");
                }
                System.out.println();
            }
            v.clear();
        }
        sc.close();
    }
}
