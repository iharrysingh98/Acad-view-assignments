import java.util.*;
 class q2
 {

	public static void main(String[] args) 
     {
     ArrayList<String> s=new ArrayList<String>();
     s.add("Hardeep Singh");
     s.add("Dheeraj Sharma");
     s.add("Kshitiz Minhas");
     Collections.sort(s);
     System.out.println(s);

     ArrayList<Integer> i=new ArrayList<Integer>();

     i.add(1);
     i.add(20);
     i.add(3);
     Collections.sort(i);
     System.out.println(i);
	}

}