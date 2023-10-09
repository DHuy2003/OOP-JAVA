import java.util.Scanner;

public class J03032 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] se = s.split(" ");
            for(int i = 0; i < se.length; i++){
                StringBuffer s1 = new StringBuffer(se[i]);
                String s2 = s1.reverse().toString();
                System.out.print(s2 + " ");
            }   
            System.out.println();
        }
        sc.close();
    }
}
