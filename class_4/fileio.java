package hu.akos.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOperations {
    
    public static void main(String[] args) throws IOException {
        
        // some basic code to understand how reading and writing to a file works
        /*
        FileReader fileReader = new FileReader("C:/Users/student/Desktop/test.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line = null;
        while ((line = reader.readLine()) != null) {
         System.out.println(line);
        }
        reader.close(); // close the file after opening it please!
        
        PrintWriter writer = new PrintWriter("C:/Users/student/Desktop/test_2.txt", "UTF-8");
        writer.println("This is the first line");
        writer.println("This is the second line");
        writer.close();
        */
        
        // read in the list of your friends into an ArrayList
        // find your friends which names start with the letter 'A'
        // maybe there's a function which checks if a string begins with a letter?
        // write these names into a file named my_favourite_friends.txt
        // don't be afraid to use google if you don't know something
        
        // read the file that contains my friends
        ArrayList<String> myFriends = new ArrayList<String>();
        FileReader fileReaderNames = new FileReader("C:/Users/student/Desktop/test.txt");
        BufferedReader readerNames = new BufferedReader(fileReaderNames);

        String name = null;
        while ((name = readerNames.readLine()) != null) {
            myFriends.add(name);
        }
        readerNames.close();
        
        System.out.println(myFriends);
        
        // filter for my best friends
        ArrayList<String> myBestFriends = new ArrayList<String>();
        for(int i = 0; i < myFriends.size(); i++) {
            String currentFriend = myFriends.get(i);
            if(currentFriend.startsWith("A")) {
                myBestFriends.add(currentFriend);
            }
        }
        System.out.println(myBestFriends);
        
        // input the filtered array to the file
        PrintWriter bestFriendFile = new PrintWriter("C:/Users/student/Desktop/my_best_friends.txt", "UTF-8");
        for(int i = 0; i < myBestFriends.size(); i++) {
            bestFriendFile.println(myBestFriends.get(i));
        }
        bestFriendFile.close();
    }
}

