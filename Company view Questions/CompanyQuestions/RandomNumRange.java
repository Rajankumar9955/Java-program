import java.util.concurrent.ThreadLocalRandom;

public class RandomNumRange {
    public static int getRandomNumber(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min,max+1);
    }
    public static void main(String[] args) {
        int min=1;
        int max=100;
        System.out.println("Random Value BetWeen "+min+" and "+ max+" : "+getRandomNumber(min, max));
    }
}
