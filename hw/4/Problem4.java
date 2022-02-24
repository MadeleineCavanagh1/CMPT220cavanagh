import java.util.Scanner;  
public class Problem4 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a positive Integer: ");
      int num = scan.nextInt();
      int inside_root = num;
      int outside_root = 1;
      int h = 2;
      while(h*h<=inside_root){
        if(inside_root%(h*h)==0){
          inside_root = inside_root/(h*h);
          outside_root = outside_root * h;
        }
        else
          h+=1;
      }
 
      if(outside_root!=1 && inside_root!=1)
        System.out.println("sqrt("+num+") is "+outside_root+"*sqrt("+inside_root+")");
      if(inside_root==1&&outside_root!=1)
        System.out.println("sqrt("+num+") is "+outside_root);
      if(inside_root!=1 && outside_root==1)
        System.out.println("sqrt("+num+") is " +"sqrt("+inside_root+")");
      if(inside_root==1 && outside_root==1)
        System.out.println("sqrt("+num+") is " +1);
    }
  }