import java.util.*;

public class J01010 {
    public static String Solve(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' &&  s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9') return "INVALID";
            //if(s.charAt(i) == '8' || s.charAt(i) == '9') s.replace(s.charAt(i), '0');
        }
        String s1 = s.replace('8', '0');
        String s2 = s1.replace('9', '0');
        long ans = 0L;
        for(int i = 0; i < s2.length(); i++){
            ans = ans * 10 + Character.getNumericValue(s2.charAt(i));
        }
        if(ans == 0) return "INVALID";
        else{
            String result = Long.toString(ans);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s = sc.nextLine();
            System.out.println(Solve(s));
            t--;
        }
        sc.close();
    }
}
