import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> v = new Vector<String>();  
        Queue<String> q = new LinkedList<String>();
        q.add("6");
        q.add("8");
        v.add("6");
        v.add("8");
        while(true){
            String top = q.peek();
            q.remove();
            if(top.length() == 15) break;
            v.add(top + "6");
            v.add(top + "8");
            q.add(top + "6");
            q.add(top + "8");
        }
        int t = sc.nextInt();
        while(t-- > 0){
            Vector<String> ans = new Vector<String>();
            int n = sc.nextInt();
            for(String x : v){
                if(x.length() == n+1) break;
                else ans.add(x);
            }
            System.out.println(ans.size());
            Collections.reverse(ans);
            for(String s : ans){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
