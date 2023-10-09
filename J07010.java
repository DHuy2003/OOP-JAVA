import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Svien{
    String id,name,born,group;
    double gpa;
    public String xuli(String born){
        String s = born;
        if(s.charAt(1) == '/'){
            s = "0" + s;
        }
        if(s.charAt(4) == '/'){
            s = s.substring(0, 3) + "0" + s.substring(3);
        }
        return s;
    }
    public Svien(String id, String name, String group, String born, double gpa){
        this.id = id;
        this.group = group;
        this.name = name;
        this.born = xuli(born);
        this.gpa = gpa;
    }
}

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SV.in");
        Scanner read = new Scanner(file);
        List<Svien> list = new ArrayList<>();
        int t = Integer.parseInt(read.nextLine());
        int cnt = 0;
        while(t-- > 0){
            String s = "B20DCCN";
            cnt++;
            String tmp = Integer.toString(cnt);
            while(tmp.length() < 3) tmp = "0" + tmp;
            s = s + tmp;
            list.add(new Svien(s,read.nextLine(),read.nextLine(),read.nextLine(),Double.parseDouble(read.nextLine())));
        }
        for (Svien svien : list) {
            System.out.print(svien.id + " " + svien.name + " " + svien.group + " " + svien.born+ " ");
            System.out.printf("%.2f",svien.gpa);
            System.out.println();
        }
        read.close();
    }
}