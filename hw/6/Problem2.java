import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        //create two arrays
        double[] xs = new double[6];
        double[] ys = new double[6];
        //show minimum number
        double minx = 0;
        double miny = 0;
        //recieve input
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            System.out.print("x" + (i+1) + ": ");
            xs[i] = input.nextInt();
            System.out.print("y" + (i+1) + ": ");
            ys[i] = input.nextInt();
            //update numbers
            if(xs[i]<minx)
                minx = xs[i];
            if(ys[i]<miny)
                miny = ys[i];
        }
        input.close();
        //fix array to be all positive (for calculations)
        for(int i = 0; i < 6; i++){
            xs[i] -= minx;
            ys[i] -= miny;
        }
        for(int i = 0; i < 6; i++){
            System.out.println(xs[i] + ", " + ys[i]);
        }
        //calculate with the formula |(x1y2-y1x2+...+xny1-ynx1)/2|
        //first point and last point
        double area = (xs[5] * ys[0]) - (ys[5] * xs[0]);
        for(int i = 1; i < 6; i++){
            //current point and point and previous point
            area += (xs[i-1] * ys[i]) - (ys[i-1] * xs[i]);
        }
        // divide by two 
        area = Math.abs(area/2);
        //print 
        System.out.println("Area: " + area);
    }

}
