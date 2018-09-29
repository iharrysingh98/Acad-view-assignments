import java.util.*;
import java.io.*;

class Student
{
	int age;
	String name;
	public Student(int age, String name)
   {
   this.age=age;
   this.name=name;
   }
   public String toString()
   {
   return this.age + " " + this.name;
   }
}
class Sortbyage implements Comparator<Student>
{
public int compare(Student a,Student b)
{
Student s1=(Student)a;
Student s2=(Student)b;

if(s1.age==s2.age)
return 0;
else if(s1.age>s2.age)
return 1;
else
return -1;
 }
}
class Sortbyname implements Comparator<Student>
{
	public int compare(Student a, Student b)
	{
      return a.name.compareTo(b.name);
	}
}
// Driver class
class Demo
{
	public static void main(String[] args)
	{
      ArrayList<Student> ar =new ArrayList<Student>();
      ar.add(new Student(18,"Kshitij\t"));
      ar.add(new Student(19,"Dheeraj\t"));
      ar.add(new Student(20,"Harry\t"));
      
      System.out.println("Unsorted");
      for(int i=0;i<ar.size();i++)
      System.out.println(ar.get(i));

      Collections.sort(ar,new Sortbyage());

      System.out.println("\nSorted by age");
      for(int i=0;i<ar.size();i++)
      System.out.println(ar.get(i));

      Collections.sort(ar,new Sortbyname());

      System.out.println("\nSorted by name");
      for(int i=0;i<ar.size();i++)
      System.out.println(ar.get(i));

	}
} 