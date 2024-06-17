public class largest {
    public static void main(String[] args) {
        int arr[]={20,35,62,65,85,69,23};
        int max=arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Largest element of array:"+max);
    }
}
