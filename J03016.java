import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int sum = 0;
            int ans = 0;
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0) sum += Character.getNumericValue(s.charAt(i));
                else ans += Character.getNumericValue(s.charAt(i));
            }
            if(Math.abs(sum -ans) % 11 == 0) System.out.println("1");
            else System.out.println("0");
        }
        sc.close();
    }
}
