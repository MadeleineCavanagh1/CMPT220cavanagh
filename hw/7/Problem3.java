import java.util.Scanner;
public class Problem3 {
    public static void main(String args[]){
        //inputed the scanner class myobj witha try statement
        try (Scanner myObj = new Scanner(System.in)) {
            double x1,y1,x2,y2,x3,y3;
            //user imput 
            System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
            x1 = myObj.nextDouble();
            y1 = myObj.nextDouble();
            x2 = myObj.nextDouble();
            y2 = myObj.nextDouble();
            x3 = myObj.nextDouble();
            y3 = myObj.nextDouble();
            
            double x = (x1 + x2 + x3) / 3;
            double y = (y1 + y2 + y3) / 3;
            //center points

            System.out.println("The center point is at:  "
                    + "(" + x + ", " + y + ")");
        }
    }
}