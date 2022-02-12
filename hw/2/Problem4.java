import java.util.Scanner;

import java.util.Scanner;
    public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int minutes= in.nextInt();
        int years = minutes/525600;
        int remainder = minutes % 525600;
        int days = remainder/1440;
        System.out.println(minutes + " minutes is approximately "+ years + " years and " + days + " days.");
    } 
}
