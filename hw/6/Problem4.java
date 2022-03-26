import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        //recieve input
        Scanner input = new Scanner(System.in);
        double[][] start = new double[2][2];
        System.out.print("Enter a, b, c, d: ");
        for(int r = 0; r < 2; r++){
            for(int c = 0; c < 2; c++){
                start[r][c] = input.nextDouble();
            }
        }
        input.close();
        //call method
        double[][] answer = inverse(start);
        //print answer
        if(answer == null){
            System.out.println("No inverse matrix");
        }
        else{
            for(int r = 0; r < 2; r++){
                for(int c = 0; c < 2; c++){
                    System.out.print(answer[r][c] + " ");
                }
                System.out.println();
            }  
        }
    }
    //new method
    public static double[][] inverse(double[][] A){
        //create variables
        double[][] matrix = new double[2][2];
        double a = A[0][0];
        double b = A[0][1];
        double c = A[1][0];
        double d = A[1][1];
        if(a*d - b*c == 0){
            return null;
        }
        //calculate A^-1 by multiplying by inverse coeff
        double inverse = 1 / (a*d - b*c);
        matrix[0][0] = inverse * d;
        matrix[0][1] = inverse * -b;
        matrix[1][0] = inverse * -c;
        matrix[1][1] = inverse * a;
        return matrix;
    }
}