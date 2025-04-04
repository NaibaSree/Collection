package Collection;

import java.util.ArrayList;

public class ten_Mobile_Phone_func {
	
	public static void find_mobile_by_brand(ArrayList<mobile> list) {
		int flag=0;
		System.out.println("Mobile phone belongs to Samsung are :");
		for(mobile i:list) {
			if(i.brand=="Samsung") {
				System.out.println("Model: "+i.model+"\nPrice: "+i.price+"\nRAM: "+i.RAM);
				flag=1;
			}
			else if(list.size()-1==list.indexOf(i) && flag==0) {
				System.out.println("No Mobile Available");
			}
			
		}
	}
	public static void display_mobile_details(ArrayList<mobile> list) {
		System.out.println("***********************************************");
		int flag=0;
		int price_ll=15000,price_ul=20000;
		System.out.println("Mobile phone whose price is between 15000 t0 20000 are :");
		for(mobile i:list) {
			if(i.price>=price_ll && i.price<=price_ul) {
				System.out.println("Model: "+i.model+"\nPrice: "+i.price+"\nRAM: "+i.RAM);
				flag=1;
			}
			else if(list.size()-1==list.indexOf(i) && flag==0) {
				System.out.println("No Mobile Available");
			}
			
		}
	}
	public static void display_mobile_details1(ArrayList<mobile> list) {
		System.out.println("***********************************************");
		int flag=0;
		int r=6,price=10000;
		System.out.println("Mobile phone whose RAM > 6G  and price is less than 10000 : ");
		for(mobile i:list) {
			if(i.RAM>r && i.price<price) {
				System.out.println("Model: "+i.model+"\nPrice: "+i.price+"\nRAM: "+i.RAM);
				flag=1;
			}
			else if(list.size()-1==list.indexOf(i) && flag==0) {
				System.out.println("No Mobile Available");
			}
		}
	}
}
