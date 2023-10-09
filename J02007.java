import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            LinkedHashMap <Integer,Integer> mp = new LinkedHashMap<>();
            while (n > 0) {
                n--;
                int x = sc.nextInt();
                if (mp.containsKey(x)) {
                    mp.replace(x, mp.get(x) + 1);
                } else {
                    mp.put(x, 1);
                }
            }
            System.out.println("Test " + i + ":");
            for (Map.Entry<Integer,Integer> it : mp.entrySet()){
                System.out.println(it.getKey() + " xuat hien " + it.getValue() + " lan ");
            }
        }
        sc.close();
    }
}
