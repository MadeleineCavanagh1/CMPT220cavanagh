//Import java util scanner is needed like usual.
import java.util.Scanner;

//begin program
public class ComplexTestfile {
    
    public static void main(String args[]) {
        //Scanner 
        Scanner in = new Scanner(System.in);
        //doubling the temp1,and temp2 
        Complex num1, num2;
        double temp1, temp2;
        //print statement 
        System.out.print("Enter the first complex number: ");
        //next double scans the next token of the input as a Double
        temp1 = in.nextDouble();
        temp2 = in.nextDouble();
        //set num1 equal to temp 1 and 2
        num1 = new Complex(temp1, temp2);
        //Print statement 
        System.out.print("Enter the second complex number: ");
        //Same step is repeated as in line 20.
        temp1 = in.nextDouble();
        temp2 = in.nextDouble();
        num2 = new Complex(temp1, temp2);
        //System print the line of the function
        System.out.println();
        //System print the num1.to string and add that to the num 2 string and set that to the different arithmetic symbols.
        System.out.println(num1.toString() + " + " + num2.toString() + " = " + num1.add(num2).toString());
        System.out.println(num1.toString() + " - " + num2.toString() + " = " + num1.subtract(num2).toString());
        System.out.println(num1.toString() + " * " + num2.toString() + " = " + num1.multiply(num2).toString());
        System.out.println(num1.toString() + " / " + num2.toString() + " = " + num1.divide(num2).toString());
        System.out.println("|" + num1.toString() + "| = " + num1.abs());
    }
}
