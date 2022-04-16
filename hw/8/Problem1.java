import java.util.Scanner;
public class Problem1{ 

    public static ArrayList<String> split(String s, String delimiters){
        ArrayList<String> answer = new ArrayList<String>(); 
        int dNum= delimiters.length();
        int sNum= s.length();

        String theBreak= ""; 
        for (int i=0; i< sNum; i++){ 
            boolean found= false;
            //if the delimiters are found it is true
            for (int j=0; j<dNum; j++){ 

                if (s.charAt(i)== delimiters.charAt(j)){ 
                    found= true; 
                    break;
                }
            }
            if(found== true){ 
                answer.add(theBreak);
                theBreak= ""; 
            }else{ 
                theBreak= theBreak + s.charAt(i);  
            }
        }
        if(!theBreak.equals("")){ 
            answer.add(theBreak);
        }
        System.out.println(answer);
        return answer;
        
    }
    public static void main(String[]args){ 
        Scanner input= new Scanner(System.in); 
        System.out.print("Please enter your string: "); 
        String s= input.nextLine(); 
        System.out.print("Please enter your delimiters: ");
        String delimiters= input.nextLine(); 
        split(s, delimiters);
        
        input.close();

    }

}