import java.util.Scanner;
  public class Problem1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Radius of the circle: ");
    double radius1 = input.nextDouble();
    double diameter = 2 * radius1;
    double area = 3.14 * Math.pow(radius1, 2);
    

    System.out.println("The diameter is:" + diameter);
    System.out.println("The area is:" + area);

  }
}