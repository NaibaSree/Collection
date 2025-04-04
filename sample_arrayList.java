package Collection;
import java.util.*;
public class sample_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("Mango");
		list.add("Grapes");
		list.add("Apple");
		list.add("Guava");
		list.add("Plum");
		
		list.remove(2);
		for(String i:list) {
			System.out.println(i);
		}

	}

}
