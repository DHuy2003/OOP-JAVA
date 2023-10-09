import java.util.Scanner;
public class J01002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            long x = input.nextLong();
            long y = (x+1) * x / 2;
            System.out.println(y);
            t--;
        }
        input.close();
    }
}
