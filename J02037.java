import java.util.Scanner;

public class J02037 {
    public static boolean Check1(String[] a){
        int cnt = 0;
        for(int i = 0; i < a.length; i++){
            if(Integer.parseInt(a[i]) % 2 == 0) cnt++;
        }
        if(cnt*2 > a.length) return true;
        return false;
    }
    public static boolean Check2(String[] a){
        int cnt = 0;
        for(int i = 0; i < a.length; i++){
            if(Integer.parseInt(a[i]) % 2 != 0) cnt++;
        }
        if(cnt*2 > a.length) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            if((a.length % 2 == 0 && Check1(a)) || (a.length % 2 != 0 && Check2(a))) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
