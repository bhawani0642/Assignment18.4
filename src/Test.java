import java.util.*;
class Test
{
public static void main(String args[])
{
//LinkedList class
LinkedList al=new LinkedList();
//adding elements in the object of LinkedList class
al.add("Hello");
al.add(true);
al.add(45.7);
al.add('c');
  
/*List iterator interface to iterate over the elements in both forward and
reverse direction*/
ListIterator itr=al.listIterator();
System.out.println("Forward Direction");
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("Traversing the elements in reverse direction");
while(itr.hasPrevious())
{
System.out.println(itr.previous()); //printing the elements in reverse direction
}
//Instnace of array list class
ArrayList list=new ArrayList();  
//adding elements to the array list
list.add(100);
list.add("ArrayList");  
list.add(123.45);
//adding or joining array list elements at the end of the linked list
al.addAll(list);
System.out.println("After Joining:");
System.out.println(al);
}
}