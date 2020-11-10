package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete Bob = new Athlete("Bob",10);
    	Athlete Joe = new Athlete("Joe",8);
    	System.out.println(Bob.name);
    	System.out.println(Bob.nextBibNumber);
    	System.out.println(Bob.raceLocation);
    	Joe.nextBibNumber++;
    	System.out.println(Joe.name);
    	System.out.println(Joe.nextBibNumber);
    	System.out.println(Bob.nextBibNumber);
    	System.out.println(Joe.raceLocation);
    }
}