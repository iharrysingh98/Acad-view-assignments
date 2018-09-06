class Substring
{
	public static void main(String args[])
	{
		String str = "Harry";
		int i,j,k=1,len = str.length();
		
		System.out.println("Substrings of the string = \"" + str + "\"=");
		for(i=0;i<len;i++)
		{
			for(j=i;j<len;j++)
			{
				System.out.println(k +" "+ str.substring(i, j+1));
				k++;
			}
		}
		System.out.println();
	}
}