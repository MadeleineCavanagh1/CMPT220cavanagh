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
        double discriminant= 0;
        discriminant= (Math.pow(b,2)) - 4* a*c;
        double x =0;
        x = Math.pow(discriminant, 0.5);
        double denom= 0;
        denom= 2 * a;
        double root1= 0;
        root1= (-b - x/ denom);
        double root2= 0;
        root2= (-b + x/ denom);

        if (discriminant > 0)
            System.out.println("This equation has two real roots: " + root1 + "and" + root2);
        else if (discriminant == 0)
            System.out.print("This equation has two real roots: " + root1);
        else
            System.out.print("This equation has no real roots");


    }
    
}
