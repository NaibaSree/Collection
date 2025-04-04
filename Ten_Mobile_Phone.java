package Collection;
import java.util.*;
public class Ten_Mobile_Phone {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<mobile> list=new ArrayList<>();
		mobile m1=new mobile("Samsung","Samsung Galaxy S20 FE",28299,8);
		mobile m2=new mobile("OnePlus","OnePlus 7T",19888,8);
		mobile m3=new mobile("Google Pixel","Google Pixel 4A",31999,6);
		mobile m4=new mobile("Motorola","Motorola Edge Plus",49999,12);
		mobile m5=new mobile("iQOO","iQOO 3 256GB",34990,12);
		mobile m6=new mobile("Xiaomi","Xiaomi Mi 10T Pro",39999,8);
		mobile m7=new mobile("OnePlus","OnePlus 8",41999,8);
		mobile m8=new mobile("Samsung","Samsung Galaxy A56",39999,8);
		mobile m9=new mobile("POCO","POCO C31 64GB",8499,4);
		mobile m10=new mobile("Oukitel","Oukitel WP9",19999,6);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		list.add(m9);
		list.add(m10);
		ten_Mobile_Phone_func ten=new ten_Mobile_Phone_func();
		ten.find_mobile_by_brand(list);
		ten.display_mobile_details(list);
		ten.display_mobile_details1(list);
		
	}

}
