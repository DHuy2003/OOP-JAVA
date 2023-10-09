import java.util.Scanner;

class Point{
    private double a,b;
    public Point(){

    };
    public Point(double x, double y){
        this.a = x;
        this.b = y;
    };
    public Point(Point p){
        this.a =p.a ;
        this.b =p.b;
    };
    public double getX(){
        return a;
    }
    public double getY(){
        return b;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.a-secondPoint.a, 2)+ Math.pow(this.b-secondPoint.b, 2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.a-p2.a, 2)+ Math.pow(p1.b-p2.b, 2));
    }
    public String toString(){
        return "Distance is";
    };
}

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.format("%.4f",Point.distance( p1, p2));
            System.out.println();
        }
        sc.close();
    }
}
