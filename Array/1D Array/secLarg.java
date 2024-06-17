public class secLarg {
    public static void main(String[] args) {
        int arr[]={10,23,52,65,68,95,68,45,35,69};
        int max=arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("First MAX ELEMENT :"+max);
        int max1=arr[0];
        for(int i=0; i<arr.length; ++i)

        {
              if(arr[i]>max1 && arr[i]<max)
              {
                max1=arr[i];
              }
        }
        System.out.println("Second MAX ELEMENT:"+max1);






    }
}
