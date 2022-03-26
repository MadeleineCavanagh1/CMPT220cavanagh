import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        //receive input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();
        //call method
        int[] ex = count(str);
        for(int k = 0; k < ex.length; k++){
            //print occurrences
            if(ex[k] > 0){
                System.out.println("Digit " + k + " occurs " + ex[k] +
                " time" + (ex[k]>1?"s":""));
            }
        }
    }
    public static int[] count(String s){
        int[] counts = new int[10];
        //count digits when they appear in the s string
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                //increment count for the digit found in string s
                int num = Character.getNumericValue(s.charAt(i));
                counts[num]++;
            }
        }
        return counts;
    }

}