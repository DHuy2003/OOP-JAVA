import java.io.*;
import java.util.*;
class Tsinh implements Comparable<Tsinh>{
    String id,name,add;
    double point;
    public Tsinh(String id, String name, String add, double point){
        this.id = id;
        this.name = name;
        this.add = add;
        this.point = point;
    }
    public int compareTo(Tsinh a){
        if(this.point != a.point){
            if(this.point < a.point) return 1;
            else return -1;
        } 
        else{
            return this.id.compareTo(a.id);
        }
    }
}

public class J07052 {
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
        File file = new File("THISINH.in");
        Scanner read = new Scanner(file);
        List<Tsinh> list = new ArrayList<>();
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
            double math = Double.parseDouble(read.nextLine());
            double physic = Double.parseDouble(read.nextLine());
            double bio = Double.parseDouble(read.nextLine());
            double point = math*2  + physic + bio;
            String add ;
            if(id.substring(0, 3).equals("KV1")){
                add = "0.5";
                point += 0.5;
            }else{
                if(id.substring(0, 3).equals("KV2")){
                    add = "1";
                    point += 1.0;
                } 
                else{
                    add = "2.5";
                    point += 2.5;
                } 
            }
            //if(point - (int)point == 0) point = (int)point;
            list.add(new Tsinh(id, tmp, add, point));
        }
        Collections.sort(list);
        int t = Integer.parseInt(read.nextLine());
        double standard_point = list.get(t-1).point;
        System.out.printf("%.1f\n",standard_point );
        for (Tsinh tsinh : list) {
            if(tsinh.point >= standard_point){
                if(tsinh.point - (int)tsinh.point == 0) System.out.println(tsinh.id + " " + tsinh.name + " " + tsinh.add + " " + (int)tsinh.point + " TRUNG TUYEN");
                else System.out.println(tsinh.id + " " + tsinh.name + " " + tsinh.add + " " + tsinh.point + " TRUNG TUYEN");
            } 
            else{
               if(tsinh.point - (int)tsinh.point == 0) System.out.println(tsinh.id + " " + tsinh.name + " " + tsinh.add + " " + (int)tsinh.point + " TRUOT");
               else System.out.println(tsinh.id + " " + tsinh.name + " " + tsinh.add + " " + tsinh.point + " TRUOT");
            } 
        }
        read.close();
    }
}
