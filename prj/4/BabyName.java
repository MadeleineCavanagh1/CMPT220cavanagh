public class BabyName{ 
    // JA: These fields should be private
    int rank; 
    int year; 
    String name; 
    String gender;

    public BabyName(int rank, int year, String name, String gender){

        this.rank= rank; 
        this.year= year; 
        this.name= name; 
        this.gender= gender;

    }
    public String toString(){ 
        return this.name + "is ranked #"+ this.rank + "in the year "+ this.year;//returns the name, ranking and year 

    }
}