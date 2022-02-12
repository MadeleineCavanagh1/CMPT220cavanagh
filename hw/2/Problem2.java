import java.util.Scanner;
  public class Problem2 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the ball travel time in seconds: ");
  double traveltime = in.nextDouble();
  double height= 0;
  height=0*traveltime+9.8*((traveltime*traveltime)/2);
  System.out.println("The height of the building is " + height + "meters");
  }
}
