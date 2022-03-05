import java.util.*;
public class Problem3{ 
    public static void main(String[]args){ 
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence= input.nextLine();
        title(sentence);
        System.out.println(title(sentence)); //not prints out capitalized sentence

    }
    public static String title (String sentence){
        char[] charArray = sentence.toCharArray();//creates an array of the characters in the string
        boolean space = true;
        for (int i = 0; i < charArray.length; i++) {

            if(Character.isLetter(charArray[i])) {//checks for letters
  
                // registers spaces before letters
                if(space) {
        
                  // change the letter into uppercase
                  charArray[i] = Character.toUpperCase(charArray[i]);
                  space = false;
                }
              }
        
              else {
                // if the character is a space and not a letter
                space = true;
              }
            }
        sentence = String.valueOf(charArray);//creates a string of the char array
        return sentence; //returns the new sentence
    }
}