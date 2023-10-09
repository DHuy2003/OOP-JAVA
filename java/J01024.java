import java.util.Scanner;

public class J01024 {
    public static String Solve(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(Solve(s));
        }
        sc.close();
    }
}
