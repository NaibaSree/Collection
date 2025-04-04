package Collection;
import java.util.*;
public class HashMap2 {
	public static void main(String[] args) {
	    HashMap<Integer,Student1> map=new HashMap<Integer,Student1>();
	    Student1 s1=new Student1("Naiba",101,21);
	    Student1 s2=new Student1("Deepa",102,20);
	    Student1 s3=new Student1("Mukesh",103,18);
	    //map.put(s1.id,s1);
	    //map.put(s2.id,s2);
	    //map.put(s3.id,s3);
	    System.out.println("Iterating over hashmap");
	    for(Map.Entry<Integer,Student1> e:map.entrySet()){
	    	Student1 s=e.getValue();
	        System.out.println("ID : "+e.getKey() + " Name : "+s.name+" Age : "+s.age);
	    }
	}
}

