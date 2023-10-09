import java.util.*;

public class J03010 {
    public static Vector<String> v = new Vector<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> mp = new HashMap<String,Integer>();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            int i = 0;
            while(i < s.length()){
                if(s.charAt(i) == ' '){
                    String tmp = s.substring(0, i);
                    v.add(tmp);
                    s = s.substring(i);
                    s = s.trim();
                    i = 0;
                }
                i++;
            }
            v.add(s);
            String tmp = "";
            tmp += v.get(v.size()-1);
            for(int j = 0; j < v.size()-1; j++){
                tmp += v.get(j).charAt(0);
            }
            if(mp.containsKey(tmp)) mp.replace(tmp,mp.get(tmp) + 1);
            else mp.put(tmp, 1);
            if(mp.get(tmp) == 1) System.out.println(tmp + "@ptit.edu.vn");
            else System.out.println(tmp + mp.get(tmp) + "@ptit.edu.vn"); 
            //System.out.println(v);
            v.clear();
        }
        sc.close();
    }
}
