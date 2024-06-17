public class secMin {
    public static void main(String[] args) {
        int arr[]={12,36,35,65,86,95,452,36};
    int sec=arr[0];
      
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]<sec)
            {
                sec=arr[i];
            }
        }
        System.out.println("First Min number:"+sec);
        int sec1=arr[0];
       
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]<sec1 && arr[i]>sec)
            {
                sec1=arr[i];
            }
        }
        System.out.println("Second Min Number:"+sec1);





    }

}
