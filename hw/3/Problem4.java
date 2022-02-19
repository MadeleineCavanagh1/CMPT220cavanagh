//Madeleine Cavanagh
//Professor Arias
//Software Development 1
//Assignment 3
public class Problem4 {
    public static void main(String[] args) {
        double x = Math.random() * 10 -5;
        double y = Math.random() * 10 -5;
        double distance = Math.sqrt(x*x + y*y);

        while(distance > 5){
            x = Math.random() * 10 -5;
            y = Math.random() * 10 -5;
            distance = Math.sqrt(x*x + y*y);
        }
    System.out.println("the point is (" + x + "," + y + ") and its distanceto the center is " + distance); 
    }

}
