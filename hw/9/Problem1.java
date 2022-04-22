import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int k = 0; k < array.length; k++) {
            array[k] = (int) (Math.random() * 100);
        }
        //scanner inputvalue
        Scanner inputvalue = new Scanner(System.in);
        //input value 
        System.out.print("Enter an index here: ");
        try {
            int index = inputvalue.nextInt();
            //output statement of array index
            System.out.println("array[" + index + "] = " + array[index]);
            //print statement if program does not apply
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("INDEX " + ex.getLocalizedMessage() + " is out of bounds");
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input");
        } catch (Exception exc) {
            System.out.println("you entered an input that is not valid");
        }
    }
}

