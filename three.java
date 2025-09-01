// 3rd assingment
// area of triangle, square and circle
import java.util.Scanner;

public class three {
    public void area(float base, float height ){
        float area = 0.5f * base * height;
        System.out.println("The area of the triangle is "+ area);
    }
    public void area(int side){
        float area = side * side;
        System.out.println("The area of the square is "+ area);
    }
    public void area(double radius){
        double area = (double)(Math.PI*radius * radius);
        System.out.println("The area of the circle is "+ area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        three obj = new three(); 

        System.out.println("Enter the radius of circle:");
        float r = sc.nextFloat();
        obj.area(r);
        
        System.out.println("Enter the base and height of triangle:");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        obj.area(b, h);
        
        
        System.out.println("Enter the side of square:");
        int s = sc.nextInt();
        obj.area(s);

        sc.close();
    }
}