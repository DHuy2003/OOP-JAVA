import java.util.Scanner;

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ns = sc.next();
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float tong = a + b + c;
        System.out.print(ten + " " + ns + " ");
        System.out.printf("%.1f",tong);
        System.out.println();
        sc.close();
    }
}
