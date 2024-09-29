// Java program to delete the first element of ArrayList 
import java.util.List; 
import java.util.ArrayList; 
  
public class removefirst { 
    public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2); 
  
        // First element's index is always 0 
        int index = 0; 
  
        // Delete first element by passing index 
        al.remove(index); 
  
        System.out.println("Modified ArrayList : " + al); 
    } 
} 

