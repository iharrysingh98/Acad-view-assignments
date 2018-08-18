import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		int year;
		System.out.println("Enter the Year");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%400==0 || year % 4==0 && year% 100!=0 )
			System.out.println(year + " is leap year");
		else
		{
			System.out.println( "Not a leap year");
		}
	}
}