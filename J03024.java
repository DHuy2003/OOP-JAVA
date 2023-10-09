import java.util.Scanner;

public class J03024 {
    public static String Check(String s){
        int chan = 0, le = 0;
        if(s.charAt(0) == '0')  return "INVALID";
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) return "INVALID";
            else{
                if(Character.getNumericValue(s.charAt(i)) % 2 == 0) chan++;
                else le++;
            }
        }
        int len = s.length();
        if(chan > le && len % 2 == 0) return "YES";
        if(chan < le && len % 2 == 1) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(Check(s));
        }
        sc.close();
    }
}
