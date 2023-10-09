import java.util.Scanner;

public class J03011 {
     public static long UCLN(long a, long b){
        if(b == 0) return a;
        else return UCLN(b, a%b);
     }

    public static long Xuli(long a,String b){
        long result = 0;
        for(int i = 0; i < b.length(); i++){
            result = result * 10 + Character.getNumericValue(b.charAt(i));
            result %= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc .nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            sc.nextLine();
            String b = sc.nextLine();
            long c = Xuli(a, b);
            System.out.println(UCLN(a, c));
        }
        sc.close();
    }
}
