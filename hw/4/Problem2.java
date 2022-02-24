import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
    final double Pi = 3.141592;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    int sides = input.nextInt();
    System.out.print("Enter the radius of the bounding circle: ");
    double radius = input.nextDouble();
    System.out.println("The coordinates of the points on the polygon are: ");
    for (int i = 0; i < sides; i++) {
        double x = radius * Math.cos(2.0 * Pi / sides * i);
        double y = radius * Math.sin(2.0 * Pi / sides * i);
        System.out.print("(");
        System.out.printf("%.2f", x);
        System.out.print(" ");
        System.out.printf("%.2f", y);
        System.out.print(")");
        System.out.println();
    }
 
    }
    
}
