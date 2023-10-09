import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean[] F = new boolean[26];
        for(int i = 0; i < s.length();i++){
            if(F[s.charAt(i)-'a'] == true) continue;
            else F[s.charAt(i)-'a'] = true;
        }
        int cnt = 0;
        for(int i = 0; i < 26; i++){
            if(F[i]) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
