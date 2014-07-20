package Loops;

public class WhileLoopExamples {
    
    public static void main(String[] args) {

        int counter = 0;
            
        while(counter < 5) {
            System.out.println("Akos");
            counter++; // counter = counter + 1;
        }
            
        String myName = "Akos";            
        while(counter < 10 && myName.equals("Akos")) {
            System.out.println("You have authority!");
            counter++;
        }
            
    }
    
}
