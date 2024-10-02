// public class MissingNumber {
//     public static void main(String[] args) {
//        int[] arr={1,3,4,5,6};
//        int n=arr.length;
//        int sum=n*(n+1)/2;
//        int s=0;
//        for(int i=0; i<arr.length-1; ++i)
//        {
//              s+=arr[i];
//        }
//        System.out.println(sum-s);
//     }
// }


public class MissingNumber{
    public static void main(String[] args)
    {
        int[] arr={1,3,4,5,6};
        int n=arr.length;
        int sum=n*(n+1)/2;
        int s=0;
        for(int i=0; i<arr.length-1; ++i)
        {
            s+=arr[i];
        }
        System.out.println(sum-s);
    }
}