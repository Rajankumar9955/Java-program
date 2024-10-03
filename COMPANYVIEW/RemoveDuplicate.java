import java.util.HashSet;

public class RemoveDuplicate{
    public static void main(String[] args){
        int arr[] = {1,2,2,3,3,4,4,5};
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr)
        {
            set.add(num);
        }
        System.out.println(set);
    }
}