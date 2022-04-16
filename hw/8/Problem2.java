import java.util.Scanner;
public class Problem2 {

//new method to find the largest value
public static int largest(int arr[], int size){
int largestVal = arr[0];
for(int i=0; i<size; i++){
if(largestVal<arr[i])
largestVal = arr[i];
}
 
return largestVal;
}
 
//new method to find the closest value
public static int closestValue(int arr[], int size, int n){
    int diff = Math.abs(n - arr[0]);
    int closest = arr[0];
    for(int i=0; i<size; i++){
if(diff>Math.abs(n - arr[i]))
{
diff = Math.abs(n - arr[i]);
closest = arr[i];
}
}
 
return closest;
}

   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   //get user input
       System.out.print("Please enter the number of object: ");
       int numOfObject = sc.nextInt();
     
       int weight[] = new int[numOfObject];
     
       //get the weight of each object
       System.out.print("Please enter the weights of the objects: ");
       for(int i=0; i<numOfObject; i++)
       {
       weight[i] = sc.nextInt();
       }
     
       int k = 1;
     
       //while loop
       while(true){
       boolean flag = false;
       int max = largest(weight, numOfObject);
       int second = closestValue(weight, numOfObject, 10-max);
       System.out.println("Container "+k+" contains objects with weight "+max+" "+second);
     
       for(int i=0; i<numOfObject; i++){
       if(weight[i]==max || weight[i]==second)
       weight[i] = 0;
       }
       for(int i=0; i<numOfObject; i++)
       {
       if(weight[i]!=0)
       flag = true;
       }
       if(!flag)
       break;

k++;
       }
   }
}

