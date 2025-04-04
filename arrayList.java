package Collection;
import java.util.*;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> s=new ArrayList<>();
		student s1=new student(101,"Naiba");
		student s2=new student(102,"Sowmiya");
		student s3=new student(103,"Jain");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s1.display();
		s2.display();
		s3.display();
		for(student s11:s) {
			if(s11.id==101) {
				System.out.println("Student name - "+s11.name);
			}
		}
	}

}
