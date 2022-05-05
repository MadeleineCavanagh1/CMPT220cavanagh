import java.util.Scanner;
public class Problem3 {
        //Begin program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create input statement for rational number 1
        System.out.print("Enter the first rational number: ");
        String rational1 = sc.nextLine();
        //Create input statement for the second rational number
        System.out.print("Enter the second rational number: ");
        String rational2 = sc.nextLine();

        sc.close();

        Rational rat1 = Rational.parseRationalNumber(rational1);
        Rational rat2 = Rational.parseRationalNumber(rational2);
        //output is the printstatement of the first rational number + the second rational number and then that equal the sum of booth + rat1.add(rat2)
        System.out.println(rat1 + " + " + rat2 + " = " + rat1.add(rat2));
    }
}

class Rational extends Number implements Comparable<Rational> {
    // numerator and denominator 
    private long numerator = 0;
    private long denominator = 1;

   
     // rational needed with 0 and 1 as the standard value
 
    public Rational() {
            this(0, 1);
    }

    //rational with the gcd for the numerator and denominator
    public Rational(long numerator, long denominator) {
            long gcd = gcd(numerator, denominator);
            this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
            this.denominator = Math.abs(denominator) / gcd;
    }

    //finding the greatest common denominator 
    private static long gcd(long n, long d) {
            long n1 = Math.abs(n);
            long n2 = Math.abs(d);
            int gcd = 1;

            for (int k = 1; k <= n1 && k <= n2; k++) {
                    if (n1 % k == 0 && n2 % k == 0)
                            gcd = k;
            }

            return gcd;
    }

   //gives the numerator
    public long getNumerator() {
            return numerator;
    }

    //gives the denominator  

    public long getDenominator() {
            return denominator;
    }

    //connects the rational to the second rational
    public Rational add(Rational secondRational) {
            long n = numerator * secondRational.getDenominator() + denominator
                            * secondRational.getNumerator();
            long d = denominator * secondRational.getDenominator();
            return new Rational(n, d);
    }

    //subtracts both rationals
    public Rational subtract(Rational secondRational) {
            long n = numerator * secondRational.getDenominator() - denominator
                            * secondRational.getNumerator();
            long d = denominator * secondRational.getDenominator();
            return new Rational(n, d);
    }

    //multiply both rationals
    public Rational multiply(Rational secondRational) {
            long n = numerator * secondRational.getNumerator();
            long d = denominator * secondRational.getDenominator();
            return new Rational(n, d);
    }

    //divides both rationals
    public Rational divide(Rational secondRational) {
            long n = numerator * secondRational.getDenominator();
            long d = denominator * secondRational.numerator;
            return new Rational(n, d);
    }

    //overides string to return num and denom
    @Override
    public String toString() {
            if (denominator == 1)
                    return numerator + "";
            else
                    return numerator + "/" + denominator;
    }

    @Override
    // Override  equals method inside the object
    public boolean equals(Object other) {
            if ((this.subtract((Rational) (other))).getNumerator() == 0)
                    return true;
            else
                    return false;
    }

    //Each one of the overides are being implemented according to their public class example: doubleValue, floatValue etc.

    @Override
    //Overide: implement the abs intvalue inside the number
    public int intValue() {
            return (int) doubleValue();
    }

    @Override
    public float floatValue() {
            return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
            return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
            return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
            if (this.subtract(o).getNumerator() > 0)
                    return 1;
            else if (this.subtract(o).getNumerator() < 0)
                    return -1;
            else
                    return 0;
    }

    public static Rational parseRationalNumber(String s) {
            if (s.contains("/")) {
                    String words[] = s.split("/");
                    long numerator = Long.parseLong(words[0].trim());
                    long denominator = Long.parseLong(words[1].trim());
                    return new Rational(numerator, denominator);
            } else {
                    return new Rational(Long.parseLong(s.trim()), 1);
            }
    }
}


