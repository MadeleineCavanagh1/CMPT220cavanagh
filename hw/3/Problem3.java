//Madeleine Cavanagh
//Professor Arias
//Software Development 1
//Assignment 3
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the coordinates for two points: ");
        double x1= in.nextDouble();
        double y1= in.nextDouble();
        double x2= in.nextDouble();
        double y2= in.nextDouble();
        
        double p = y2 - y1 / x2 - x1;
        double b = y1 - p * x1;

        if(p > 1.0) {
        System.out.println( "The line equation for two points (" + x1 + "," + y1 +") and ( " + x2 + "," + y2 +"," + "is y =" + p + "x + " + b);
        }else if (p == 1.0) {
        System.out.println( "y = x");
        }else {
            System.out.println( "y = x");
        }
    
  }
}

