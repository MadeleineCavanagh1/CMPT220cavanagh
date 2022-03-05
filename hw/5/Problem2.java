import java.util.Scanner;
public class Problem2{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    System.out.println("The bianry value is " + decimalToBinary(num)); //method that translate decimal to binary
    input.close();
    }
    public static String decimalToBinary(int value){//converts string value to int
        String binNum = "";
        while (value > 0){
            binNum = value % 2 + binNum;
            value /=2;

        }
        return binNum;//returns final value
    }
}