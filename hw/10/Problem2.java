//begin program
class Animal implements Comparable<Animal>, Cloneable {
    private double weight;// weight variable to store the weight
    // Need a method to find the weight
    public double getWeight() {
        return weight;
    }
    // setting the weight
    public void setWeight(double weight) {
        this.weight = weight;
    }
    // override the compare to in order to the comparable class
    @Override
    public int compareTo(Animal animal) {
        double animalWeight = animal.getWeight();
        return (int) (this.getWeight() - animalWeight);
        // sorting weights in ascending order
    }

    //we need to overide the clone method i
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}
//two classes to test: chicken and tiger
class Chicken extends Animal {
}
class Tiger extends Animal {
}

public class AnimalTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal [] list= new Animal[5];
        //establishes a chicken object
        list[0]= new Chicken();
        //weight is set to 4.5
        list[0].setWeight(4.5);
        //tiger object
        list[1]= new Tiger();
        //set tiger weight too 46.6
        list[1].setWeight(46.6);
        list[2]= new Chicken();
        list[2].setWeight(1.5);
        //clone of first element
        list[3]= (Animal) (list[0].clone());
        //set weight to 7.5
        list[3].setWeight(7.5);
        //clone of second element for list[4]
        list[4]= (Animal) (list[1].clone());
       
        java.util.Arrays.sort(list);
        for(int i=0;i<list.length;i++){
            System.out.println("weight: "+list[i].getWeight());
        }
    }
 
 }