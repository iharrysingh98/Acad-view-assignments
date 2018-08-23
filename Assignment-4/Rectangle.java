import java.util.Scanner;
class Rectangle
 {
  int length;
  int breadth;


  public int CalculateArea()
  {
      int l,b;
      l=this.length;
      b=this.breadth;
      return l*b;
  }


  public static void main(String[] args)

  {
      Rectangle a=new Rectangle();
      Scanner sc=new Scanner(System.in);


      System.out.println("Enter the value of length");
       a.length=sc.nextInt();
       System.out.println("Enter the value of  breadth");
       a.breadth=sc.nextInt();

     System.out.println("The Area is "+a.CalculateArea());
  }
}
