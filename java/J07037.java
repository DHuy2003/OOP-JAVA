import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class DN implements Comparable<DN> {
    String id,name;
    int num;
    public DN(String id, String name, int num){
        this.id = id;
        this.name = name;
        this.num = num;
    }
    public int compareTo(DN a){
        if(this.id.compareTo(a.id) > 0) return 1;
        else return -1;
    }
}


public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DN.in");
        Scanner read = new Scanner(file);
        List<DN> list = new ArrayList<>();  
        int n = Integer.parseInt(read.nextLine());
        while(n-- > 0){
           list.add(new DN(read.nextLine(), read.nextLine(), Integer.parseInt(read.nextLine())));
        }
        Collections.sort(list);
        for (DN dn : list) {
            System.out.println(dn.id + " " + dn.name + " " + dn.num);
        }
        read.close();
    }
}
