import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Mhoc implements Comparable<Mhoc> {
    String courseid, course;
    int tc;
    public Mhoc(String courseid, String course, int tc){
        this.courseid = courseid;
        this.course = course;
        this.tc = tc;
    }
    public int compareTo(Mhoc A){
        if(this.course.compareTo(A.course) > 0) return 1;
        return -1;
    }
}

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner read = new Scanner(file);
        List<Mhoc> list = new ArrayList<>();  
        int n = Integer.parseInt(read.nextLine());
        while(n-- > 0){
            list.add(new Mhoc(read.nextLine(), read.nextLine(), Integer.parseInt(read.nextLine())));
        }
        Collections.sort(list);
        for (Mhoc mhoc : list) {
            System.out.println(mhoc.courseid + " " + mhoc.course + " " + mhoc.tc);
        }
        read.close();
    }
}
