import java.util.Scanner;

public class DayFromDate {
    public static String dayFromDate(int date,int month,int year){
        String s = "";
        if(month<3){
            year-=1;
        }
        int[] arr = {0,3,2,5,0,3,5,1,4,6,2,4};
        int result = (year+year/4-year/100+year/400+arr[month-1]+date)%7;
        switch (result){
            case 1:
                s = "Monday";
                break;
            case 2:
                s = "Tuesday";
                break;
            case 3:
                s = "Wednesday";
                break;
            case 4:
                s = "Thursday";
                break;
            case 5:
                s = "Friday";
                break;
            case 6:
                s = "Saturday";
                break;
            case 0:
                s = "Sunday";
                break;
            default:
        }
        return s;
    }
    public static void main(String[] args) {
        int date,month,year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        date = sc.nextInt();
        System.out.println("Enter the month: ");
        month = sc.nextInt();
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        String result = DayFromDate.dayFromDate(date,month,year);
        System.out.println(result);
    
}

}

    