//Madeleine Cavanagh
//Professor Arias
//Software Development 1
//Assignment 3

import java.util.Scanner;
    public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a, b, c:");
        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();
//        double discriminant= 0;
        double discriminant= (Math.pow(b,2)) - 4* a*c;
//        double x =0;
        double x = Math.pow(discriminant, 0.5);
//        double denom= 0;
        double denom= 2 * a;
//        double root1= 0;
        double root1= (-b - x)/ denom; // JA
//        double root2= 0;
        double root2= (-b + x)/ denom; // JA

        if (discriminant > 0)
            System.out.println("This equation has two real roots: " + root1 + "and" + root2);
        else if (discriminant == 0)
            System.out.print("This equation has two real roots: " + root1);
        else
            System.out.print("This equation has no real roots");


    }
    
}
