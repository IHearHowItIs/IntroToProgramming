package main.java.controlflow;

public class Playground2 {
    
    public static void main(String[] args){

        //instantiates object(instantiate for new instance)
        IntroToControlFlow controlFlowClass = new IntroToControlFlow();

        IntroToControlFlow flowControlClass = new IntroToControlFlow();

        //access variables on an instance of the class
        System.out.println(controlFlowClass.instanceVar);
        System.out.println(controlFlowClass.staticVar);

        System.out.println(flowControlClass.instanceVar);
        System.out.println(flowControlClass.staticVar);

        //access variables on the class itself (statically)
        //because of class(static) scope
        System.out.println(IntroToControlFlow.staticVar);
        // Cannot do this because instanceVar is NOT static(class scope)
        //System.out.println(IntroToControlFlow.instanceVar);

        System.out.println("------------------");

        //change the value of the instanceVar in my controlFlowClass
        controlFlowClass.instanceVar = "This is the controlFlowClass Instance";
        flowControlClass.instanceVar = "This is the flowControlClass Instance";
        IntroToControlFlow.staticVar = "Today is a great day";

        System.out.println(controlFlowClass.instanceVar);
        System.out.println(flowControlClass.instanceVar);
        //System.out.println(IntroToControlFlow.staticVar);

        controlFlowClass.staticVar = "A lovelyyy dayyyy";
        System.out.println(IntroToControlFlow.staticVar);

        flowControlClass.staticVar = "Summerrrr Time";

        System.out.println(IntroToControlFlow.staticVar);

        IntroToControlFlow.staticVar = "What's Going On?";

        System.out.println(controlFlowClass.staticVar);

        controlFlowClass.instanceVar = "Happy BIRTHDAY";

        System.out.println(flowControlClass.instanceVar);
        System.out.println(controlFlowClass.instanceVar);
    }

}
