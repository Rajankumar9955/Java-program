public class MissingNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{0,1,2,3,5};
        int n=arr.length;
        int total=n*(n+1)/2;
        int sum=0;
       for(int i=0; i<n; i++)
       {
        sum+=arr[i];
       }
        System.out.println(total-sum);

    }
    
}
