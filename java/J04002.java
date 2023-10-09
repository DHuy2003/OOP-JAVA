import java.util.Scanner;

class Rectange{
    private int width;
    private int height;
    private String color;
    public Rectange(){
    };
    public Rectange(int width, int height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    };
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    };
    public int getHeight(){
        return height;
    };
    public void setHeight(int height){
        this.height = height;
    };
    public String getColor(){
        return color;
    };
    public void setColor(String color){
        this.color = color;
    };
    public static int findArea(int width,int height){
        return width*height;
    }
    public static int findPerimeter(int width,int height){
        return (width+height)*2;
    }
}

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        String color = sc.next();
        color = color.toLowerCase();
        char x = color.charAt(0);
        x = Character.toUpperCase(x);
        String tmp = x + color.substring(1);
        if(d <= 0 || r <= 0) System.out.println("INVALID");
        else{
            System.out.print(Rectange.findPerimeter(d,r) + " ");
            System.out.print(Rectange.findArea(d,r) + " ");
            System.out.println(tmp);
        }
        sc.close();
    }
}
