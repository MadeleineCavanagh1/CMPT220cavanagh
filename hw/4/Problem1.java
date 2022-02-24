import java.util.Scanner;
  public class Problem1 {
  public static void main(String[] args) {
    final double Pi = 3.141592;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    double n = input.nextDouble();
    System.out.print("Enter the length side: ");
    double s = input.nextDouble();
    double step1 = n * Math.pow(s, 2);
    double step2 = 4 * Math.tan(Pi/n);
    double step3 = step1/step2;
    System.out.print("The area of the polygon is " + step3);
    }
    
}
    
