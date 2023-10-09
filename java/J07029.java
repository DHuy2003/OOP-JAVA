import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class J07029 {
    public static boolean Prime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream read = new ObjectInputStream(file);
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        @SuppressWarnings("unchecked")
        ArrayList<Integer> list = (ArrayList<Integer>) read.readObject();
        for (Integer n : list) {
            if(Prime(n)){
                if(map.containsKey(n)) map.replace(n, map.get(n)+1);
                else map.put(n, 1);
            }
        }
        int cnt = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
            cnt++;
            if(cnt == 10) break;
        }
        read.close();
    }
}