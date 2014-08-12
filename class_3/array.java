packagearrays;
importjava.lang.Math;

publicclass ArrayExamples {
    
    public static void main(String[] args) {
        
        
        // baaaaaaaad
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;
        int numberFive = 5;
        
        
        // okkaaaaay
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 42;
        numbers[3] = 4;
        numbers[4] = 5;
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[numbers.length-i-1]);
        }
        
        // how do I reverse????
        System.out.println("Reverse version2:");
        for(int i = numbers.length -1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
        
        // fill the array with the second power of i
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i * i;
        }
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        System.out.println("Eleventh power of the current interation:");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) Math.pow(i, 11);
        }
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
    }
}
