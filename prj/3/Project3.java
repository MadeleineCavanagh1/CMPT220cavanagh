import java.util.Scanner;
public class Project3{
    public static void print(char[][] maze) {
        for (int i = 0; i < maze.length; i++)
            System.out.println(new String(maze[i])); //prints maze
    }

    // functionruns 
    public static char[][] exitFind(char[][] maze) {

        int direction = 0;
        int r = 0;
        int c = 0;

        outer: for (int i = 0; i < maze.length; i++)  
        //creates starting point for maze
            for (int j = 0; j < maze[0].length; j++)
                if (maze[i][j] == '*') {
                    r = i;
                    c = j;
                    break outer; }
        //sets up movement for maze
        if (r == 0)
            direction = 1;
        if (r == maze.length - 1)
            direction = 2;
        if (c == 0)
            direction = 3;
        if (c == maze[0].length - 1)
            direction = 4;
        //Starts while loop
        while (maze[r][c] != 'x') {
            if (maze[r][c] == '.' || maze[r][c] == '*') {
                if (direction == 1)
                    r++;
                else if (direction == 2)
                    r--;
                else if (direction == 3)
                    c++;
                else if (direction == 4)
                    c--;
            }
            else if (maze[r][c] == '/') { 
                //execute this code if a '*' hits a '/'
                if (direction == 1) {
                    c--;
                    direction = 4;}
                else if (direction == 2) {
                    c++;
                    direction = 3;}
                else if (direction == 3) {
                    r--;
                    direction = 2;}
                else if (direction == 4) {
                    r++;
                    direction = 1; }
            }
            else if (maze[r][c] == '\\') {   
                // execute this code if a '*' hits a '\'
                if (direction == 1) {
                    c++;
                    direction = 3;}
                else if (direction == 2) {
                    c--;
                    direction = 4;}
                else if (direction == 3) {
                    r++;
                    direction = 1;}
                else if (direction == 4) {
                    r--;
                    direction = 2; }
            }

        }
        maze[r][c] = '&'; //ends function if & is found
        return maze;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int house = 0;
        //set starting for which house
        while (true) {
            //begin while loop
            house++;
            //increase house by 1
            System.out.print("Enter width:");
            int collums = scan.nextInt();  
            System.out.print("Enter length:");
            int rows = scan.nextInt();
            //input for length and width of maze
           
            if (collums == 0 && rows == 0) //end program if length and width = 0 x 0
                break;
            char[][] maze = new char[rows][collums];
            for (int r = 0; r < rows; r++) {  
                //creates rows and collum 
                String row = scan.next();
                for (int c = 0; c < collums; c++)
                    maze[r][c] = row.charAt(c);
                }
            System.out.println("HOUSE " + house); //prints house 
            print(exitFind(maze));
        }
        scan.close();//ends program

    }

}