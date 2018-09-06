import java.util.Scanner;

class Count
{
	public static void main(String[] x)
	{
		String line;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		line = sc.nextLine();
		
		System.out.println("\nThe entered line : " + line);
		if(line.length() == 0)
			count = 0;
		else
		{
			for(int i=0;i<line.length()-1;i++)
			{
				if(line.charAt(i) == ' ' && line.charAt(i+1) != ' ')
				{
					count++;
				}
			}
		}
		System.out.println("\nThe number of words are  : " + count);
		
		sc.close();
	}
}