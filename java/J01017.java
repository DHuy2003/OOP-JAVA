import java.util.Scanner;

public class J01017 {

    public static Boolean Ktra(String s){
        if(s.charAt(0) == 0) return false;
        for(int i = 0; i < s.length()-1; i++){
            if( Math.abs(s.charAt(i+1) - s.charAt(i)) != 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        while(x > 0){
            String s = sc.nextLine();
            if(Ktra(s)) System.out.println("YES");
            else System.out.println("NO");
            x--;
        }
        sc.close();
    }
}
