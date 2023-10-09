import java.util.Scanner;

public class J01025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int down_x = Math.min(x1,a1);
        int down_y = Math.min(y1,b1);
        int up_x = Math.max(x2,a2);
        int up_y = Math.max(y2,b2);

        int ngang = Math.abs(up_x - down_x);
        int doc = Math.abs(up_y - down_y);
        int ans = Math.max(ngang, doc);
        System.out.println(ans * ans);
        sc.close();
    }
}
