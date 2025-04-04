package Collection;
import java.util.*;
public class sample_linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add("Mango");
		list.add("Grapes");
		list.add("Apple");
		System.out.println(list);
		list.add("pineapple");
		list.add("kiwi");
		System.out.println(list);
		System.out.println("First : "+list.getFirst());
		System.out.println("Last : "+list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
	}

}
