package main.java.controlflow;

public class IntroToControlFlow {
    //static variable
    public static String staticVar = "This is the static variable";


    //instance variable
    public String instanceVar = "This is the instance variable";

    //Control Flow - Control flow statements regulate the flow
    //Control the order in which individual statements,
    //instructions, or function calls are executed

    //to practice we will use an array
    //Array - structures that are used to store multiple values in a single variable
    //isntead of declaring seperate variables for each value
    //aka a series of like elements
    //syntax <datatype>[] <nameOfArray> = new <datatype>[numberOfElements]
    //[1,2,3,4,5] count indexes starting at 0 so for this it's 0,1,2,3,4

    public int[] intArray = new int[5];

    //adding into our array
    //intArray[0] = 1;
    //intArray[1] = 2;
    //intArray[2] = 3;
    //intArray[3] = 4;
    //intArray[4] = 5;

    //an example of defining the values in an array
    public String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    //Types of control flow statements
    //if, if-else, if-else-if, switch, while loop, do-while loop, for loop

    //interatives ---> repeat continously (recursive)
    //while loops, do-while loops, for loops, forEach()
    //conditionals ---> logic gates (only run once if condition is passed)
    //if, if else, switch etc

    //Practice
    public boolean ifStatement(String day){
        
        //syntax : if(condition){
            // logic or implementation goes here

        if(day.equals("Wednesday")){
            return true;
        }
        
        return false;
    }

    public int ifElseStatement(String input){
        if(input.length()>5){
            return input.length();
        } else {
            return 0;
        }
    }

    public String forLoopIterative(){
        for(int i = 0; i < daysOfTheWeek.length; i++){
            System.out.println(daysOfTheWeek[i]);
        }

        return "For loop finished";
    }

}
