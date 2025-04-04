package Collection;
import java.util.*;
public class product_func {
	public static void displayProduct(Map<Object, product> map) {
        System.out.println("Product List:");
            for (Map.Entry<Object, product> e : map.entrySet()) {
                product p = e.getValue();
                System.out.println("ID: " + p.p_id + " Name: " + p.p_name + " Price: " + p.price + " Brand: " + p.brand + " Manufacturer: " + p.manufacturer + " Quality: " + p.quality);
            }
        }
	static Map<Object,Object> pro=new HashMap<>();
	public static void buyProduct(Map<Object,product> map) {
		int exit=4;
		Scanner s=new Scanner(System.in);
		System.out.println("Press 1 to buy product and Press 4 to exit.....!");
		int n=s.nextInt();
		while(n!=4) {
			System.out.println("Enter the product id to add to cart");
			int id=s.nextInt();
			for(Map.Entry<Object,product> e : map.entrySet()) {
				Object p=e.getKey();
				product r=e.getValue();
				if((int)p==id) {
					pro.put(p,r.price);
				}
			}
			
			System.out.println("To continue enter 1 and  for exit enter 4....!");
			n=s.nextInt();
			if(n==4) {
				System.out.println("Products in your cart....!");
				for (Map.Entry<Object, Object> e : pro.entrySet()) {
	                System.out.println("Product ID : "+ e.getKey() +" Product Price : "+e.getValue());
	            }
				Bill(pro);
				break;
			}
		}
		
	}
	public static void Bill(Map<Object,Object> pro) {
		double t_bill=0.00;
		for (Map.Entry<Object, Object> e : pro.entrySet()) {
            t_bill+=(int)e.getValue();
            }
		System.out.print("Total Amount : ");
		System.out.println(t_bill);
		System.out.println("Total Amount After Discount.....!!!");
		Discount(t_bill);
	}
	public static void Discount(double bill) {
		double dbill;
		if(bill>25000) {
			dbill=bill*0.20;
			bill-=dbill;
			System.out.println("Total amount after discount : "+bill);
		}
		else if(bill<25000 && bill>15000) {
			dbill=bill*0.10;
			bill-=dbill;
			System.out.println("Total amount after discount : "+bill);
		}
		else if(pro.size()>=3) {
			dbill=bill*0.10;
			bill-=dbill;
			System.out.println("Total amount after discount : "+bill);
		}
	}

}
