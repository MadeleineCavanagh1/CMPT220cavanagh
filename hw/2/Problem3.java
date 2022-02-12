import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the frisction force in Newtons:");
        double newtons= in.nextDouble();
        System.out.print("Enter object mass in kg:");
        double mass = in.nextDouble();
        System.out.print("Enter the objects acceleration in m/s^2:");
        double acceleration = in.nextDouble();
        double coefficient = (newtons-(mass*acceleration))/(mass*9.8);
        System.out.println(coefficient);
    }
}
