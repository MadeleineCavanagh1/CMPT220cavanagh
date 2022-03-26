public class Problem1 {
    public static void main(String[] args) {
        //create array
        int[] counts = new int[10];
        //loop numbers between numbers 0 and 100
        for(int i = 0; i < 100; i++){
            //gerenate random number between 0-9
            int num = (int) (Math.random() * 10);
            //increment specific element in counts
            counts[num]++;
        }
        //print counts
        for(int i = 0; i < 10; i++){
            System.out.println(i + ": " + counts[i]);

        }

    }

}

 