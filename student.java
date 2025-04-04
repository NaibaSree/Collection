package Collection;

public class student {
	int id;
	String name;
	student(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
	}

}
