package arrays;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListExamples {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        names.add("Akos");
        names.add("Bence");
        
        for(int i = 0; i < names.size(); ++i) {
            // names[i] does not work
            System.out.println(names.get(i));
        }
        System.out.println(names);
        
        names.remove("Akos");
        System.out.println(names);

        names.remove(0); // removes the CURRENT zeroth element of the list
        System.out.println(names);
        
        for(int i = 0; i < 23; ++i) {
            numbers.add((int)(1000 * Math.random()));
        }
        System.out.println(numbers);
        
        // Use a loop to remove all elements of the list 'numbers'
        int length = numbers.size();
        for(int i = 0; i < length; ++i) {
            System.out.println(numbers.remove(0));
        }
        System.out.println(numbers);
        
    }
}
