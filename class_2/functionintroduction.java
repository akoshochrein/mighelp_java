package functions;

public class FunctionIntroduction {
        
    public static void main(String[] args) {
        print("Hello");
        print(1234);
        print(3.1415927);
        
        // test add
        print(add(100,1));
                
        // testing awake
        print(amIAwake(6, true));
        print(amIAwake(6, false));
        print(amIAwake(10, false));
        print(amIAwake(14, true));
    }
        
        
    public static void print(Object o) {
        System.out.println(o);
    }
        
        
    public static int add(int number1, int number2) {        
        int sum = number1 + number2;
        return sum;
    }
        
    public static boolean amIAwake(int currentHour, boolean didIParty) {    
        boolean awake = false;

        if(didIParty) {        
            awake = false;
        } else if(currentHour > 8) {
            awake = true;
        }
        
        return awake;
    }
}
