import java.util.Scanner;

class NhanVien{
    private String id ="00001";
    private String name;
    private String gt;
    private String born;
    private String address;
    private String vat;
    private String date;
    public NhanVien(String name, String gt, String born, String address, String vat, String date){
        this.name = name;
        this.gt = gt;
        this.born = born;
        this.address = address;
        this.vat = vat;
        this.date = date;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s %s", id, name, gt, born, address, vat, date);
    }
}

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        sc.close();
    }
}
