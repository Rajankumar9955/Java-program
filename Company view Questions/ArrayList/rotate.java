// Java Program to Rotate Elements of the List 
import java.io.*; 
import java.util.*; 
class rotate { 
    
    public static void main(String[] args) 
    { 
        // creating ArrayList 
        List<Integer> my_list = new ArrayList<>(); 
        my_list.add(10); 
        my_list.add(20); 
        my_list.add(30); 
        my_list.add(40); 
        my_list.add(50); 
        my_list.add(60); 
        my_list.add(70); 
  
        // Printing list before rotation 
        System.out.println( 
            "List Before Rotation : "
            + Arrays.toString(my_list.toArray())); 
  
        // Loop according to the number of rotations 
        for (int i = 0; i < 4; i++) { 
            
            // storing the last element in the list 
            int temp = my_list.get(6); 
            
            // traverse the list and move elements to right 
            for (int j = 6; j > 0; j--) { 
                my_list.set(j, my_list.get(j - 1)); 
            } 
            my_list.set(0, temp); 
        } 
  
        // Printing list after rotation 
        System.out.println( 
            "List After Rotation :  "
            + Arrays.toString(my_list.toArray())); 
    } 
}