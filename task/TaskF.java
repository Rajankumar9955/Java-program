import java.util.Scanner;
class TaskF{
public static void main(String args[]){
int month,year;
System.out.println("Enter the number for months:");
Scanner rk=new Scanner(System.in);
month=rk.nextInt();
System.out.println("Enter the year");
year=rk.nextInt();
if(month==1)
{
System.out.println("january "+ year +" has 31 days");
}
else if(month==2)
{
if(year%4==0)
{
 System.out.println("February "+ year+ " has 28 days");
}
else
{
System.out.println("Febuary "+ year +" has 29 days");
}
}
else if(month==3)
{
System.out.println("march " + year +" has 31 days");
}
else if(month==4)
{
System.out.println("April " + year +" has 30 days");
}
else if(month==5)
{
System.out.println("may "+ year +" has 31 days");
}
else if(month==6)
{
System.out.println("jun "+ year +" has 30 days");
}
else if(month==7)
{
System.out.println("july "+ year +" has 29 days");
}
else if(month==8)
{
System.out.println("August "+ year +" has 31 days");
}
else if(month==9)
{
System.out.println("September "+ year +" has 30 days");
}
else if(month==10)
{
System.out.println("October "+ year +" has 31 days");
}
else if(month==11)
{
System.out.println("November "+ year +" has 30 days");
}
else if(month==12)
{
System.out.println("December "+ year +" has 31 days");
}
else
{
System.out.println("This is invalid choice");
}
}
}