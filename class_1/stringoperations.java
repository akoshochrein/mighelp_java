package akos;

public class StringOperations {
    
    public static void main(String[] args) {

        String myName = "Akos Zsolt Hochrein";
        
        myName = myName.concat(" is awesome");
        System.out.println(myName);
        
        String replacedWithCool = myName.replace("awesome", "cool");
        System.out.println(replacedWithCool);
        
        System.out.println("Apples" + " " + "Bananas" + " " + replacedWithCool);
        
        String surname = myName.substring(0, 4);
        String forname = "";
        
        System.out.println("Surname:" + surname);
        
    }
}

