package Loops;

public class ForLoopExamples {

    public static void main(String[] args) {
        
        for(int i = 0; i < 3; i++) {
            System.out.println("The current iteraion number is: " + i);
        }
        
        // try to print out every number that is divisible by 31
        // up to 100000
        int numberToCheck = 31;       
        for( int i = 0; i < 100000; ++i) {
            if(i % numberToCheck == 0) {
                System.out.println(i);
            }
        }

    }    
}
