//use this both problem 2 and 3
public class Point{ 
    private double x,y; 

    public Point(double x, double y) {
    
            this.x = x; 
            this.y = y; 
    } 
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
    public String toString() {
        return "("+x+", "+y+")";
    }
    
}