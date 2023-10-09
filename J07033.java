import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SVien implements Comparable<SVien>{
    String id, name, clas, email;
    public SVien(String id, String name, String clas, String email){
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }
    public int compareTo(SVien a){
        if(this.id.compareTo(a.id) > 0) return 1;
        else if(this.id.compareTo(a.id) < 0) return -1;
        return 0;
    }
}

public class J07033 {
    public static String Xuli(String s){
        char c = s.charAt(0);
        c = Character.toUpperCase(c);
        String tmp = "";
        for(int i = 1; i < s.length(); i++){
            tmp += s.charAt(i);
        }
        tmp = c + tmp;
        return tmp;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SINHVIEN.in");
        Scanner read = new Scanner(file);
        List<SVien> list = new ArrayList<>();
        int n = Integer.parseInt(read.nextLine());
        while(n-- > 0){
            String id = read.nextLine();
            String name = read.nextLine();
            name = name.trim();
            name = name.toLowerCase();
            String tmp = "";
            int i = 0;
            while(i < name.length()){
                if(name.charAt(i) == ' '){
                    String s = name.substring(0, i);
                    tmp = tmp + Xuli(s) + " ";
                    name = name.substring(i);
                    name = name.trim();
                    i = 0;
                }
                i++;
            }
            tmp = tmp + Xuli(name);
            String clas = read.nextLine();
            String email = read.nextLine();
            list.add(new SVien(id, tmp, clas, email));
        }
        Collections.sort(list);
        for (SVien sv : list) {
            System.out.println(sv.id + " " + sv.name + " " + sv.clas + " " + sv.email);
        }
        read.close();
    }
}
