
public class OldItems extends Items implements Locatable, Priceable
{

String place;
String depot;
Double price;
Double tax;
	
	
	public OldItems(String sku, String description, double price, double tax, String depot, String place ) {
		super(sku, description);
		this.place = place;
		this.depot = depot;
		this.price = price;
		this.tax = tax;
	}

	@Override
	public double getPrice() {
		System.out.println("Old Item's price=" + price);
		return price;
	}

	@Override
	public void setPrice() {		
	}

	@Override
	public double getTax() {
		System.out.println("Old Item's tax=" + tax);
		return tax;
	}

	@Override
	public void setTax() {
	}

	@Override
	public void Purchase() {
		
	System.out.println(description + " can be purchased for "+ price + "TL with "+tax+ " TL tax from "+ depot+ " in "+place);	
	}

	@Override
	public String getDepot() {
		
		return depot;
	}

	@Override
	public void setDepot() {
	
		
	}

	@Override
	public String getPlace() {
	
		return place
		;
	}

	@Override
	public void setPlace() {
		
	}

}
