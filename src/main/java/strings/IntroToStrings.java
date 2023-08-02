package main.java.strings;

//NOTE: classes are created using PascalCasing: every first letter of a word is capitalized
public class IntroToStrings {
    
    //this is a string
    //the access level of this string is default
    //meaning it will be accessible in this class as well as to other classes
    //in this package
    //Why? The absence of a modifier keyword means it default

    //NOTE: variables and methods are written in camelCasing:lowercase first word, uppercase next words
    public String helloString = "Hello Everyone!";

    //This is our first look at a constructor
    //a constructor is a special method
    //note the return type of this method and the name or identifier of this
    //method are basically morphed into one

    //no args constructor - takes in no arguments/parameters
    public IntroToStrings(){
        helloString = "I'm in the default constructor";
    }

    public IntroToStrings(String helloString){
        this.helloString = helloString;
    }

    private String privateString = "Haha you can't see me";

    //public means it will be accessible anywhere
    //static meaning: I can call it on the class itself
    public static int attendance = 61;

    public int stringCount(String input){
        return input.length();
    }
    
    //This is our first look at a 'getter' method
    //A getter method (or accessor method) allows us to acess
    //a value that would be otherwise unaccessable bc it is defined as private
    public String getPrivateString(){
        privateString = privateString.replace('a', 'i');
        return privateString;
    }

}
