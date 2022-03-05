import java.util.*;
public class Problem4{ 
    public static void main(String[] args){ 
        Scanner input= new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        long seconds= input.nextLong();
        format(seconds);
        System.out.print("The hours, minutes, and seconds for "+ seconds + " seconds is " +format(seconds));
    }
    public static String format(long seconds){ 
        long totalSeconds= seconds;
        long hours=0;
        long minutes=0; 
        String formatted= "";
        if (seconds >= 3600){ 
            hours= seconds/3600;     //3600 seconds in an hour
            hours= hours % 24;      //24 hours to represent a clock
            seconds= seconds % 3600; 
        }
        if (seconds >60){ 
            minutes= seconds/60;
            seconds = seconds % 60; //there are 60 seconds in one minute
        }
        if ((hours<10) && (minutes<10) && (seconds<10)){ //when all hours, minutes and seconds have values under 10
            formatted= "0"+hours+ ": 0"+ minutes+ ": 0"+seconds;
        }
        else if ((hours<10) && (minutes<10) && (seconds>=10)){ //when only seconds has a value greater than or equal to 10
            formatted= "0"+hours+ ": 0"+ minutes+ ": "+seconds;
        }
        else if ((hours<10) && (minutes>=10) && (seconds>=10)){ //for when seconds and minutes have values greater than or equal to ten
            formatted= "0"+hours+ ": "+ minutes+ ": "+seconds;
        }
        else if ((hours>=10) && (minutes>=10) && (seconds<10)){ //for when only seconds has a value less than 10
            formatted= hours+ ": "+ minutes+ ": 0"+seconds;
        }
        else if ((hours<10) && (minutes>=10) && (seconds<10)){ //for when minutes only has a value greater than or equal to ten
            formatted= "0"+hours+ ": "+ minutes+ ": 0"+seconds;
        }
        else if ((hours>=10) && (minutes<10) && (seconds>=10)){ ///for when seconds and hours have values that are greater oor equal to ten
            formatted= hours+ ": 0"+ minutes+ ": "+seconds;
        }
        else if ((hours>=10) && (minutes<10) && (seconds<10)){ //for when only hours has a value greater than or equal to ten
            formatted= hours+ ": 0"+ minutes+ ": 0"+seconds;
        }else{ //for when all hours minutes and seconds have values greater than or equal to ten
            formatted= hours+ ":"+ minutes+ ":"+seconds;
        }
        return formatted;//returns formatted

    }

}