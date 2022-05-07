public class Complex {
    //integer division 
    double x, y;

    //Set x equal to a, and y is set to the double b.

    Complex(double a, double b) {
        x = a;
        y = b;
    }
    //Double a only, x=a , y has a value of 0.
    Complex(double a) {
        x = a;
        y = 0;
    }
    //complex function is x=0 and y is set to 0
    Complex() {
        x = 0;
        y = 0;
    }
    //returns x value
    double getRealPart() {
        return x;
    }
    //returns imaginary variable value of part y 
    double getImaginaryPart() {
        return y;
    }
    //Adding the complex functions for x and Q.x and y to Q.y and then adding those results
    Complex add(Complex Q) {
        Complex addResult = new Complex(x + Q.x, y + Q.y);
        return addResult;
    }
    //the same complex class is needed but for subtract, multiply, and divide. 
    Complex subtract(Complex Q) {
        Complex subResult = new Complex(x - Q.x, y - Q.y);
        return subResult;
    }

    Complex multiply(Complex Q) {
        Complex mulResult = new Complex(x * Q.x - y * Q.y, y * Q.x + x * Q.y);
        return mulResult;
    }

    Complex divide(Complex Q) {
        Complex divResult = new Complex((x * Q.x + y * Q.y) / (Q.x * Q.x + Q.y * Q.y),
                (y * Q.x - x * Q.y) / (Q.x * Q.x + Q.y * Q.y));
        return divResult;
    }
    //double of the absolute value returns the sqare root of the variable x and y's.
    double abs() {
        return Math.sqrt(x * x + y * y);
    }
    //Create a public string  
    public String toString() {
        if (y == 0)
            return "" + x;
        else
            return "(" + x + " + " + y + "i)";
    }
}
