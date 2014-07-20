package Conditionals;

public class ConditionalsIf {
    
    public static void main(String[] args) {
                
        boolean oneIsLessThanTwo = 1 < 2;        
        boolean oneIsGreaterThanTwo = 1 > 2;
        boolean onePlusOneIsTwo = 1 + 1 == 2;
        boolean twoStringAreEqual = "Akos".equals("Akos");
                
        System.out.println("I am sure this will show");        
        if( onePlusOneIsTwo ) {            
            // this will run if the condition is true
            System.out.println("The condition was true");
        } else {
            System.out.println("The condition was false");
        }
        System.out.println("I am sure this will show as well");

        if( oneIsGreaterThanTwo ) {        
            // some magic code here which will not evaluate
        } else if ( onePlusOneIsTwo ) {
            System.out.println("Fantastic 1 + 1 is 2");
        } else {          
            // something went wrong
        }
            
    }
}
