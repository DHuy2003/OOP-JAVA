import java.util.Scanner;

public class J01018 {

    public static Boolean Solve(String s){
        if(s.length() < 3) return false;
        for(int i = 0; i < s.length()-1; i++){
            if( Math.abs(s.charAt(i+1) - s.charAt(i)) != 2) return false;
        }
        return true;
    }

    public static Boolean Solve1(String s){
        long sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        if(sum % 10 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(Solve(s) && Solve1(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
