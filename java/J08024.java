import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Long> v = new Vector<Long>();
        long ans[] = new long[101];
        Queue<String> q = new LinkedList<String>();
        q.add("9");
        v.add(9L);
        while(true){
            String top = q.peek();
            q.remove();
            if(top.length() == 10) break;
            v.add(Long.parseLong(top + "0"));
            v.add(Long.parseLong(top + "9"));
            q.add(top + "0");
            q.add(top + "9");
        }
        for(int i = 1; i <= 100 ; i++){
            for(Long x : v){
                if(x % i == 0){
                    ans[i] = x;
                    break;
                }
            }
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(ans[n]);
        }
        sc.close();
    }
}
