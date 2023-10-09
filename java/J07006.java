import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.io.FileInputStream;
import java.io.IOException;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream read = new ObjectInputStream(file);
        TreeMap<Integer,Integer> map = new TreeMap<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer> list = (ArrayList<Integer>) read.readObject();
        for (Integer n : list) {
            if(map.containsKey(n)) map.replace(n, map.get(n)+1);
            else map.put(n, 1);
        }
        map.forEach((K,V) ->{System.out.println(K + " " + V);});
        read.close();
    }
}
