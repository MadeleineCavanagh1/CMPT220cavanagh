import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three values based on the discrimant: ");
    //user input
    int a= input.nextInt();
    int b= input.nextInt(); 
    int c= input.nextInt(); 
    input.close();
        //end input
        QuadraticEquation userEquation = new QuadraticEquation(a, b, c);
        if (userEquation.getDiscriminant() > 0) {
            System.out.printf("Root 1: %.2f, Root 2: %.2f", userEquation.getRoot1(), userEquation.getRoot2());
            // prints out roots
        } else if (userEquation.getDiscriminant() == 0) {
            System.out.printf("Root: %.2f", userEquation.getRoot1());
            //prints out root 1
        } else {
            System.out.println("This equation has no roots.");
        }

    }
}
class QuadraticEquation{ 
    private double a;
    private double b; 
    private double c;

    QuadraticEquation(double a, double b, double c){ 
        this.a= a;
        this.b=b;
        this.c=c;
    }
    
    double getA(){ 
        return a;
    }
    double getB(){ 
        return b;
    }
    double getC(){ 
        return c;
    }

    double getDiscriminant(){ 
        return (Math.pow(b,2) - 4 * a * c);
    }

    double getRoot1(){ 
        if(this.getDiscriminant()>=0){ 
            return (-b + Math.sqrt(getDiscriminant())/ (2*a));
        } else{ 
            return 0.0;
        }
    
    }
    double getRoot2(){ 
        if(this.getDiscriminant()>=0 ){ 
            return (-b - Math.sqrt(getDiscriminant()) / (2 * a));    
        }else{ 
            return 0.0;
        }
       
    }
}


