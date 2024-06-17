public class lowest {
    public static void main(String[] args) {
        int arr[]={12,35,36,53,56,85,67,85};
        int min=arr[0];
        for(int i=0;i<arr.length; ++i)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Smallest element of tha array:"+min);
    }
}
