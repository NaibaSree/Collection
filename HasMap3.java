package Collection;
import java.util.*;
public class HasMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     product p1=new product(101," Samsung Galaxy S21",69999,"Samsung","Samsung Electronics",10);
     product p2=new product(102," Apple iPhone 13",79900,"Apple","Foxconn",23);
     product p3=new product(103," OnePlus 9 Pro",64999,"OnePlus","BBK  Electronics",10);
     product p4=new product(104," Xiaomi Mi 11X",29999,"Xiaomi","Xiaomi Corporation",5);
     product p5=new product(105," Realme GT",37999,"Realme ","BBK Electronics",8);
     product p6=new product(106," Vivo V21",27990,"Vivo","BBK Electronics",9);
     product p7=new product(107," Oppo Reno6",29990,"Oppo","BBK Electronics",6);
     product p8=new product(108," Google Pixel 6",59999,"Google","Foxconn",4);
     product p9=new product(109," Motorola Edge 20",34999,"Motorola","Lenovo",3);
     product p10=new product(110," Asus ROG Phone 5",49999,"Asus","AsusTek Computer Inc",2);
     Map<Object,product> map=new HashMap<>();
     map.put(p1.p_id,p1);
     map.put(p2.p_id,p2);
     map.put(p3.p_id,p3);
     map.put(p4.p_id,p4);
     map.put(p5.p_id,p5);
     map.put(p6.p_id,p6);
     map.put(p7.p_id,p7);
     map.put(p8.p_id,p8);
     map.put(p9.p_id,p9);
     map.put(p10.p_id,p10);
     product_func p=new product_func();
     p.displayProduct(map);
     p.buyProduct(map);
	}
}


