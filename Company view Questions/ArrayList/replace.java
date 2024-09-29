
// Java program to demonstrate set() Method of ArrayList
// Where Index is Within Bound 

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class replace {

  // Main driver method
  public static void main(String[] args) {

    // Try block to check for exceptions
    try {

      // Creating an object of Arraylist class
      ArrayList<String> list = new ArrayList<>();


      // Adding elements to the List
      // using add() method

      // Custom input elements
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");

      // Print all the elements added in the above object
      System.out.println(list);

      // 2 is the index of the element "C".
      //"C" will be replaced by "E"
      list.set(2, "E");

      // Printing the newly updated List
      System.out.println(list);

    }

    // Catch block to handle the exceptions
    catch (Exception e) {

      // Display the exception on the console
      System.out.println(e);
    }
  }
}
