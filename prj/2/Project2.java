import java.util.Scanner;
public class Project2 {
    public static void main(String[] args) {
        //input 10 integers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 positive integers < 1000:");
        int[] numbers = new int[10];
        //create array of inputted integers % 42
        for(int i = 0; i < 10; i++){
            int num = input.nextInt();
            numbers[i] = num % 42;
        }
        input.close();
        java.util.Arrays.sort(numbers);
        //count numbers that are not duplicates

        int count = 1;
        for(int i = 1; i < 10; i++){
            if(numbers[i] != numbers[i-1])
                count++;
        }
        System.out.println("There are " + count + " distinct numbers after all numbers modulo 42.");

    }

}