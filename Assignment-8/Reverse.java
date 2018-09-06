class Reverse
{
	
	public static void main(String args[])
	{
		
		String str = "Acad View";
		String rev = "";
		char ch;
		int i,len = str.length();
		for(i=0; i<len; i++)
		{
			ch = str.charAt(len-i-1);
			rev = rev.concat(""+ch);
		}
		
		System.out.println("String : \"" + str + "\"");
		System.out.println("Reverse = \"" + rev + "\"");
		System.out.println();
	}
}