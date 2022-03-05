import java.util.*;

public class Problem1{ 
    public static void main(String[] agrs){ 
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int theNum= input.nextInt();
        multiplyDigits(theNum);
        

    }
    public static int multiplyDigits (int theNum){
        System.out.println(theNum);
         int x=1;
         int n= 1;
         //initalizes both x and n to 1 so that they may be changed later
        while (theNum>0){ 
            n= theNum % 10; //this extracts the last number from the whole number
            theNum=theNum/10; //removes the extracted number
            x = n* x;//multiplies all the digits in the number
        }
        System.out.println("The multiplication of all the digits in the number is: "+x);
        return theNum;
    }
}

