
public class RemoveZero {
  public  static void pushzerotoEnd(int arr[],int n)
  {
    int count=0;
    for(int i=0; i<n; i++)
    {
        if(arr[i]!=0)
        {
            arr[count++]=arr[i];
        }
    }
    while(count<n)
    {
        arr[count++]=0;
    }
  }
  public static void main(String[] args) {
    int arr[]=new int[]{0,2,4,0,3,0,2,50,3,50,0,3,0,5,6,8};
    int n=arr.length;
    pushzerotoEnd(arr, n);
    System.out.println("Array after Pushing to the back");
    for(int i=0; i<n; i++)
    {
        System.out.print(arr[i]+ " ");
    }
  }
}
