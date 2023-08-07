package main.java.playground;

import main.java.HelloWorld;
import main.java.controlflow.IntroToControlFlow;
import main.java.strings.IntroToStrings;
//NOTE: The Object is the parent class for ALL objects created in Java
public class App {
    
    public static void main(String[] args) {

        IntroToStrings stringsClass = new IntroToStrings();
        IntroToStrings stringsClass2 = new IntroToStrings("Day 3 was Great");

        String welcome = stringsClass.helloString;
        String hello = "Hello Everyone!";
        String hello2 = new String("hello everyone!");

        System.out.println(stringsClass.stringCount(welcome));
        //NOTE: = denotes assignment vs == denotes comparison
        //this compares memory addresses for strings
        //if compared to implicit String definition and compared to string with
        //new kewyword, even if same we get false return
        //for that reason, we use .equals()
        System.out.println(welcome==hello2);
        //equalsIgnoreCase() - this methods compares strings regardless of casing
        
        int favNumber = HelloWorld.favoriteNumber();
        System.out.println(HelloWorld.favoriteNumber());
        System.out.println(favNumber);

        System.out.println(stringsClass.helloString);
        System.out.println(stringsClass2.helloString);
        System.out.println(stringsClass.attendance);
        System.out.println(stringsClass2.attendance);

        stringsClass2.attendance += 7;

         //changing a static variable changes it for all instances of that class
        //that's why stringsClass attendance number is changed too
         System.out.println(stringsClass.attendance);

         //Practicing with our control flow statements and iteratives

         IntroToControlFlow practiceInstance = new IntroToControlFlow();

         System.out.println(practiceInstance.ifStatement("Wednesday"));
         System.out.println(practiceInstance.ifStatement("wednesday"));

         System.out.println(practiceInstance.ifElseStatement("Apple"));
         System.out.println(practiceInstance.ifElseStatement("Pineapple"));

         System.out.println(practiceInstance.forLoopIterative());
    }

}
