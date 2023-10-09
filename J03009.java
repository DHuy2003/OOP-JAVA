import java.util.HashSet;
import java.util.Scanner;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String [] a = s1.split(" ");
            String[] b = s2.split(" ");
            HashSet<String> s = new HashSet<String>();
            for(int i = 0; i < a.length; i++) s.add(a[i]);
            for(int i = 0; i < b.length; i++){
                if(s.contains(b[i])) s.remove(b[i]);
            }
            for(String it : s) System.out.print(it + " ");
            System.out.println();
            s.clear();
        }
        sc.close();
    }
}
