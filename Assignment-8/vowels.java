import java.util.Scanner;
 class Vowels
{
   public static void main(String args[])
   {
       String strOrig, strNew;
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       strOrig = sc.nextLine();
       strNew = strOrig.replaceAll("[aeiouAEIOU]", "");
              
       System.out.print(strNew);
   }
}