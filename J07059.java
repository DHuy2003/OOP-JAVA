import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class cathi implements Comparable<cathi>{
    String ma,date,time,phong;
    int hour,munite,day,month,year;
    public cathi(String ma,String date,String time,String phong){
        this.ma=ma;
        this.date=date;
        this.time=time;
        this.phong=phong;
    }
    void xuly1(){
        day=Integer.parseInt(date.substring(0, 2));
        month=Integer.parseInt(date.substring(3, 5));
        year=Integer.parseInt(date.substring(6));
    }
    void xuly2(){
        hour=Integer.parseInt(time.substring(0, 2));
        munite=Integer.parseInt(time.substring(3));
    }
    public int compareTo(cathi a){
        if(LocalDate.of(this.year, this.month, this.day).isAfter(LocalDate.of(a.year, a.month, a.day))) return 1;
        else if(LocalDate.of(this.year, this.month, this.day).isBefore(LocalDate.of(a.year, a.month, a.day))) return -1;
        else{
            return LocalTime.of(this.hour,this.munite,0).compareTo(LocalTime.of(a.hour,a.munite,0));
        }
    }
}
public class J07059 {
 
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("CATHI.in"));
        int n=Integer.parseInt(sc.nextLine());
        DecimalFormat dm=new DecimalFormat("000");
        List<cathi> l=new LinkedList<>();
        for(int i=1;i<=n;i++){
            String ma="C"+dm.format(i);
            String date=sc.nextLine();
            String time=sc.nextLine();
            String phong=sc.nextLine();
            cathi e=new cathi(ma,date,time,phong);
            e.xuly1();
            e.xuly2();
            l.add(e);
        }
        Collections.sort(l);
        for(cathi x:l){
            System.out.println(x.ma+" "+x.date+" "+x.time+" "+x.phong);
        }
        sc.close();
    }
}