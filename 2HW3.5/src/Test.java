import java.util.Date;

public class Test {
	 public static void main(String[] args)
	 {
		OldItems oldItem=new OldItems("01","Second hand computer", 2000, 300, "Kadıköy Warehouse","İstanbul" ); 
		ClothProduct clothProduct= new ClothProduct("10", "Red Skirt","Women","XL", 175, 15, "Maltepe Warehouse", "İstanbul"); 
		Consultancy consultancy=new Consultancy("3", "Design Process Consultancy", 3000., 600.);
		Gift gift =new Gift("15","Socks", "Kadıköy WareHouse","İstanbul");
		@SuppressWarnings("deprecation")
		FoodProdut foodProduct=new FoodProdut("98", "Milk", new Date(02,04,2032), 5, "Köyceğiz Warehouse", "Muğla", 40.0, 6.0);
		
	
	    

		oldItem.Purchase(); 
		clothProduct.Purchase();
		consultancy.Purchase();
		gift.giveagift();
		foodProduct.Purchase();
	 }
}
