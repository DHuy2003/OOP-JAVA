import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Stay implements Comparable<Stay> {
    String id, name, roomid;
    LocalDate joinday, leftday;
    public LocalDate getDay(String s){
        String tmp[] = s.split("/");
        return LocalDate.of(Integer.parseInt(tmp[2]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[0]));
    }
    public Stay(String id, String name, String roomid, String joinday, String leftday){
        this.id = id;
        this.name = name;
        this.roomid = roomid;
        this.joinday = getDay(joinday);
        this.leftday = getDay(leftday);
    }
    public int compareTo(Stay a){
        if((Period.between(this.joinday,this.leftday).getDays()) < (Period.between(a.joinday,a.leftday).getDays())) return 1;
        else return -1;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + roomid + " " + Period.between(this.joinday,this.leftday).getDays();
    }
}

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("KHACH.in");
        Scanner read = new Scanner(file);
        List<Stay> list = new ArrayList<>();
        int t = Integer.parseInt(read.nextLine());
        int cnt = 0;
        while(t-- > 0){
            cnt++;
            String s = "KH";
            if(cnt < 10) s = s + "0" + Integer.toString(cnt);
            else s = s + Integer.toString(cnt);
            list.add(new Stay(s, read.nextLine(), read.nextLine(), read.nextLine(), read.nextLine()));
        }
        Collections.sort(list);
        list.forEach(e -> System.out.println(e));
        read.close();
    }
}
