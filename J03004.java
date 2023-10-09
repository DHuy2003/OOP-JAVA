import java.util.Scanner;

public class J03004 {
    public static void out(String s){
        char c = s.charAt(0);
		c = Character.toUpperCase(c);
		String tmp = "";
		for(int i=1; i<s.length(); i++) {
			tmp += s.charAt(i);
		}
		s = c + tmp;
		System.out.print(s + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            int i = 0;
            while(i < s.length()){
                if(s.charAt(i) == ' '){
                    String tmp = s.substring(0, i);
                    out(tmp);
                    s = s.substring(i);
                    s = s.trim();
                    i = 0;
                }
                i++;
            }
            out(s);
            System.out.println();
        }
        sc.close();
    }
}
