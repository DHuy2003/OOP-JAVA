import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
    private String id, name, rank, culture;
    private int area;
    private double point;
    private  final String HIDDEN_STRING = "TS";
    private static  int hiddenNumber = 0;
    public Student(String name, double point, String culture, int area){
        this.id = makeId();
        this.name = Xuli(name);
        this.point = point;
        this.culture = culture;
        this.area = area;
        this.rank = setRank();
    }
    public String makeId(){
        hiddenNumber++;
        return hiddenNumber < 10 ? HIDDEN_STRING + "0" + hiddenNumber : HIDDEN_STRING + hiddenNumber;
    }
    public String getId() {
        return id;
    }
    public double realPoint() {
       double add;
       if(this.culture.equals("Kinh") == true) add = 0;
       else add = 1.5;
       if(this.area == 1) return this.point + add + 1.5;
       else{
        if(this.area == 2) return this.point + add + 1;
        else return this.point + add;
       }
    }
    public String setRank(){
        if(this.realPoint() >= 20.5) return "Do";
        else return "Truot";
    }
    public String Xuli(String name){
        String s = "";
        name = name.toLowerCase();
        String tmp[] = name.trim().split("\\s+");
        for(int i = 0; i < tmp.length; i++){
            tmp[i] = tmp[i].trim();
            s += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1) + " ";
        }
        s = s.trim();
        return s;
    }
    @Override
    public String toString(){
        return String.format("%s %s %.1f %s", id, name, realPoint(), rank);
    }
}

public class J07057 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("THISINH.in");
        Scanner sc = new Scanner(f);
        List<Student> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            l.add(new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()),sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sort(l);
        for (Student m : l) {
            System.out.println(m);
        }
        sc.close();
    }
    private static void sort(List<Student> l) {
        Collections.sort(l, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.realPoint() != o2.realPoint()){
                    if(o1.realPoint() < o2.realPoint()) return 1;
                    else return -1;
                }
                else return o1.getId().compareTo(o2.getId());
            }
            
        });
    }
}
