import java.util.Scanner;
// JA: Comments?
public class Project1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers, S1 and T: ");
        int S1 = input.nextInt();
        int T = input.nextInt();

        while ((S1 > 1000 ||T > 1000) || (S1 < -1000 || T < -1000)){
            System.out.print("Invalid, Please enter an integer between 1000 and -1000.");
            S1 = input.nextInt();
            T = input.nextInt();
        }
     int S2 = (2*T) - S1;
    System.out.println(S2);
    }
}