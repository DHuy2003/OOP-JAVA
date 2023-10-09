import java.util.Scanner;

class Student{
    private String ma = "B20DCCN001";
    private String ten;
    private String lop;
    private String ns;
    private double a;
    public Student(String ten, String lop, String ns, double a){
        this.ten = ten;
        this.lop = lop;
        this.ns = Xuli(ns);
        this.a = a;
    }
    private String Xuli(String ns){
        if(ns.charAt(1) == '/') ns = 0 + ns;
        if(ns.charAt(4) == '/') ns = ns.substring(0, 3) + 0 + ns.substring(3);
        return ns;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", ma, ten, lop, ns, a);
    }
}

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new Student(sc.nextLine(),sc.next(),sc.next(),sc.nextDouble()));
       /*
        System.out.print("B20DCCN001 "+ ten + " "+ lop + " " + ns + " ");
        System.out.printf("%.2f",a);
        System.out.println(ns);
        */
        sc.close();
    }
}
