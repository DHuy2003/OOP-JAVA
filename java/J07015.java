import java.util.ArrayList;
import java.util.TreeMap;
import java.io.*;
public class J07015 {
    public static boolean Prime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("SONGUYEN.in");
        ObjectInputStream read = new ObjectInputStream(file);
        TreeMap<Integer,Integer> map = new TreeMap<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer> list = (ArrayList<Integer>) read.readObject();
	    for (Integer n : list) {
            if(Prime(n)){
                if(map.containsKey(n)) map.replace(n, map.get(n)+1);
                else map.put(n, 1);
            }
        }
        read.close(); 
        map.forEach((K,V) ->{
            System.out.println(K + " " + V);
        });
          
    }
}

