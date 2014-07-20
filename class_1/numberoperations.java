package akos;

public class NumberOperations {
    
    public static void main(String[] args) {
        
        double diameterOfTheSun = 1392684; // km
        double radiusOfTheMoon = 1737; // km
        
        double diameterOfTheMoon = radiusOfTheMoon * 2;
        
        double sunIsThisTimesBiggerThanTheMoon = diameterOfTheSun / diameterOfTheMoon;
        
        System.out.println(sunIsThisTimesBiggerThanTheMoon);
        
        int myAge = 68;
        int myBrothersAge = 14;
        
        int iAmThisTimesOlderThanMyBrother = myAge / myBrothersAge;
        int butTheRemainderIs = myAge % myBrothersAge;
        
        System.out.println("I am this much older: " + iAmThisTimesOlderThanMyBrother);
        System.out.println(butTheRemainderIs);
        
    }
}
