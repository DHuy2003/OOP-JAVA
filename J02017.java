import java.util.ArrayList;
import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        while(true){
            boolean ok = true;
            for(int i = 0; i < a.size()-1; i++){
                if((a.get(i)+a.get(i+1))%2 == 0){
                    a.remove(i);
                    a.remove(i);
                    ok = false;
                    break;
                }
            }
            if(ok) break;
        }
        System.out.println(a.size());
        sc.close();
    }
}
