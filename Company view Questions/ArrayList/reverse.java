


// Java program to illustrate reverse() method 
// of Collections class over ArrayList 
  
// Importing utility classes 
import java.util.*; 
import java.util.ArrayList;
  
// Main class 
public class reverse { 
  
    // main driver method 
    public static void main(String[] args) 
    { 
        // Let us create a list of strings 
        List<String> mylist = new ArrayList<String>(); 
  
        // Adding elements to the List 
        // Custom input elements 
        mylist.add("practice"); 
        mylist.add("code"); 
        mylist.add("quiz"); 
        mylist.add("geeksforgeeks"); 
  
        // Print all elements originally 
        System.out.println("Original List : " + mylist); 
  
        // Using reverse() method to 
        // reverse the element order of mylist 
        Collections.reverse(mylist); 
  
        // Print all elements of list in reverse order 
        // using reverse() method 
        System.out.println("Modified List: " + mylist); 
    } 
}
