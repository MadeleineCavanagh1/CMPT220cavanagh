import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// JA: UML?
public class Project4 {
    public static void main(String[] args) throws Exception {
		Scanner project = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);

		System.out.print("Please enter the year:\n");
		//Input from user
		int year = project.nextInt();

		System.out.print("Please enter the gender:\n");
		//input from user
		String gender = stringInput.nextLine();

		System.out.print("Please enter the name:\n");
		//input from user
		String name = stringInput.nextLine();

		String fileName = "babynameranking" + year + ".txt";
		// searching for file linked to the year 

		ArrayList<BabyName> list = loadNames(fileName);
		BabyName temp = findName(name, gender, list);
		// creates an instance produced from method
		
		if (temp.rank == -1 && temp.year == -1 && temp.name.equals("x") && temp.gender.equals("x"))
			System.out.println("Name \'" + name + "\' not found"); 
			//program is not used
		else
			System.out.println(temp.toString());
		project.close();
		stringInput.close();
		//closes both the inputs
	}

	private static ArrayList<BabyName> loadNames(String fileName) throws Exception {
		// this loads the names in to the
																			
		File names = new File("" + fileName);

		int year = Integer.parseInt(fileName.substring(15, 19));
		//turns year from file and into int
		Scanner project = new Scanner(names);

		ArrayList<BabyName> list = new ArrayList<>();
		//create a new ArrayList
		while (project.hasNextLine()) {
			//add each name from the files into the ArrayList
			int rank = Integer.parseInt(project.next());
			// this will indicate that the first part of the line is the rank
			
			String gender = "M";//ranking will be M for male
								
			String name = project.next();
			// the next line for the name
			list.add(new BabyName(rank, year, gender, name));
			gender = "F";
			//F for female
			
			project.next();
			// skip the number of babies with this name since it is not
							
			name = project.next();
			// female name which eliminates the male name
			list.add(new BabyName(rank, year, gender, name));
			project.next();
		} // this loops for every line that is in the file
		project.close();
		return list;// this will return the list
	}

	// JA: This changes the requirements of the problem
	private static BabyName findName(String name, String gender, ArrayList<BabyName> names) {
	///searches for baby name inside of the array
		boolean found = false;
		int ind = -1;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).gender.equals(gender) && names.get(i).name.equals(name)) {
				found = true;
				ind = i;
				//display the index
			}
		}
		if (found)
		// if it is found in the ArrayList it will display the right babyname
			return names.get(ind);
		else
			return new BabyName(-1, -1, "x", "x");
			// this will use to print "Name not found" if the babyname cannot be
	}
}