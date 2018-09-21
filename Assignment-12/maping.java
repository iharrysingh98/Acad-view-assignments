import java.util.*;
class Maping{
    public static void main(String []args)
  {
    int a;
    HashMap hm=new HashMap();
    hm.put("Hardeep",1);
    hm.put("Dheeraj",2);
    hm.put("Kshitij",3);
    hm.put("Sarthak",4);
    hm.put("Nitish",5);
    Set set=hm.entrySet();
    Iterator it=set.iterator();
    System.out.println("Elements and keys:");
    while(it.hasNext())
    {
      Map.Entry mr=(Map.Entry)it.next();
     System.out.print(mr.getKey()+" : ");
     System.out.println(mr.getValue());

    }

  }
}