import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004 { 
        public static void main(String[] args) throws FileNotFoundException {
            File fileRead = new File("DATA.in");
            Scanner reader = new Scanner(fileRead);
            TreeMap <Integer,Integer> mp = new TreeMap<Integer,Integer>();
            while(reader.hasNextInt()){
                int x = reader.nextInt();
                if(mp.containsKey(x)) mp.replace(x,mp.get(x)+1);
                else mp.put(x, 1);
            }
            for(Map.Entry<Integer,Integer> it : mp.entrySet()){
                System.out.println(it.getKey() + " " + it.getValue());
            }
            reader.close();
        }
}

