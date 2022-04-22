import java.util.Scanner;
import java.util.Stack;


public class Problem2 {
    //public static Int bin2Dec 
    public static int bin2Dec(String binaryString) throws NumberFormatException{
        //the int product is 1 while the result is set to 0.
        int result = 0;
        int prod = 1;
        //Put data into a linear manner 
        Stack<Integer> stack = new Stack<>();
        //binary string length.
        for(int i = binaryString.length()-1;i>=0;i--){
            if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1'){
                throw new NumberFormatException();
            }
            //add new items to the array
            if(binaryString.charAt(i) == '1'){
                stack.push(prod);
            }
            prod *= 2;
        }

        while (!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bin;
        //Print input statement 
        System.out.print("Enter a binary number: ");
        bin = scanner.nextLine();
        try {
            System.out.println(bin2Dec(bin));
        }
        //if program does not apply
        catch (Exception e){
            System.out.println("Not a binary number: "+bin);
        }
    }
}