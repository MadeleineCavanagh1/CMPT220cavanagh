//Madeleine Cavanagh
//Professor Arias
//Software Development 1
//Assignment 3

import java.util.Scanner; 
public class Problem2{ 
    public static void main(String[]args){ 
        Scanner input= new Scanner(System.in); 
        System.out.print("Please enter a numerator and a denominator: ");
        int numerator= input.nextInt();
        int denominator= input.nextInt();  
        if( numerator / denominator < 1) 
            System.out.println(numerator + " / " + denominator + " is a proper fraction");
        else if( numerator % denominator == 0) 
            System.out.println(numerator + " / " + denominator + " is an improper fraction that can be reduced to "+ numerator/denominator); 
        else 
            System.out.println(numerator + " / " + denominator + " is an improper fraction and can be reduced to " + numerator/denominator + " + " + (numerator % denominator)+ " / "+ denominator);
    }
}
