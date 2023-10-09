import java.io.*;
import java.util.*;

class Mhoc implements Comparable<Mhoc> {
    String id, name, exam;
    public Mhoc(String id, String name, String exam){
        this.id = id;
        this.name = name;
        this.exam = exam;
    }
    public int compareTo(Mhoc a){
        return this.id.compareTo(a.id);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + exam;
    }
}

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        List<Mhoc> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            l.add(new Mhoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l);
        for (Mhoc mhoc : l) {
            System.out.println(mhoc);
        }
        sc.close();
    }
}
