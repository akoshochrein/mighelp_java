package Conditionals;

public class IfExercises {
    
    public static void main(String[] args) {

        // search for the most famous Hungarian battle
        // save the date in a variable
        // check if the variable is greater than 1700
        // if it is print out
        //      "This was not that long ago"        
        // otherwise print out
        //      "That was really long ago"

        // this is camelcase, get used to it
        // also it is sometimes called Hungarian notation
                
        int mostFamousBattleYear = 1687;
        if(mostFamousBattleYear > 1700) {
            System.out.println("This was not that long ago");
        } else {
            System.out.println("That was really long ago");
        }
                
        // check if a number is divisible by 7        
        // if it is print out some happy string
        // if it's not print out the remainder

        int myNumber = 345678;
        int remainder = myNumber % 7;
        if(remainder == 0) {
            System.out.println("yay!");
        } else {
            System.out.println("Remainder is:" + remainder);
        }
                
        // I need to travel to Balaton around 120 kms        
        // I have 1 hour to do this
        // the speed limit is 120 kmps
        // if i am going too fast (140) print out a warning about policemen
        // if i am within 140 and 120 print out "i can get away with this"
        // otherwise print out that i am too slow
        // what if I only have 30 minutes, what if I only have 20?
        // What if i only have 17?
                
        double distanceToBalaton = 120; // km
        double minutesToGetThere = 59;
        double hoursToGetThere = minutesToGetThere / 60.0;
                
        double mySpeed = distanceToBalaton / hoursToGetThere;
                
        if(mySpeed > 140) {
            System.out.println("Slow down, police patrol!");
        } else if(mySpeed <= 140 && mySpeed > 120) {
            System.out.println("I can get away with this!");
        } else {
            System.out.println("I am too slow!");
        }

    }
}
