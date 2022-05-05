import java.util.Scanner;
public class Problem1{
    public static void main(String[]args){
        //begin program: enter input statments
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter time1(hour minute second): ");
        Time time1= new Time(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(time1.toString());
        System.out.println("Elapsed seconds in time1: " + time1.getSeconds());
        System.out.print("Enter time2 (elapsed time): ");
        Time time2 = new Time(input.nextInt());
        System.out.println(time2.toString());
        System.out.println("Elapsed seconds in time2: " + time2.getSeconds());
        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
        Time time3 = time1;
        System.out.println("time3 is created as a clone of time1");
        System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));

    }
}

class Time implements Comparable{
    // JA: These are not needed
    private int hour;
    private int min;
    private int sec;
    private long time;
 

    Time(){
        time = System.currentTimeMillis();
    }
    Time(long time) {
        this.time = (time*1000);
    }

    //for time inputs
    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        time = ((this.sec * 1000) + (this.min*60*1000) + (this.hour*60*60*1000));
    }
    int getHour(){
        return (int)(time / (1000 * 60 * 60)) % 24; 
        //returns hour
    }
    int getMinute(){
        return (int)(time / (1000 * 60)) % 60;  //returns minutes
    }
    int getSecond(){
        return (int)(time / 1000) % 60;  //returns seconds
    }
    long getSeconds(){
        return time/1000;
    }

    @Override
    public String toString(){  //puts time in string
        return getHour() + " hours " + getMinute() + " minutes " + getSecond() + " seconds ";

    }

    public int compareTo(Object temp){     //compares time1 and time2
        Time other = (Time) temp;
        if(getSeconds() > other.getSeconds()){
            return ((int)other.getSeconds()-(int)getSeconds());
        }
        else if (other.getSeconds() > getSeconds()){
             return ((int)getSeconds()-(int)other.getSeconds());
        }
        else{
            return 0;
        }
    }
}
 