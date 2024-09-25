public class SwapingString {
    public static void main(String[] args) {
        String a="Hello",b="World";
        System.out.println("Before Swapping String:"+" a:"+a + " and "+" b:"+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("String after Swapping : "+" a: "+ a +" and "+" b "+b);
    }
}
