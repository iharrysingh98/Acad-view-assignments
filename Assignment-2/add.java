import java.util.Scanner;
class UserInput
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter the First Number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the Second Number");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum = " +c);
	}
}