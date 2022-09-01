import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodProdut extends Product implements Locatable,Priceable
{
	String place;
	String depot;
	Double price;
	Double tax;
	Date productionDate;
	int life;

	public FoodProdut(String sku, String description, Date productionDate, int life, String place, String depot, Double price, Double tax) {
		super(sku, description);
		this.place = place;
		this.depot = depot;
		this.price = price;
		this.tax = tax;
		this.productionDate = productionDate;
		this.life = life;
	}
	
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice() {
	
	}

	@Override
	public double getTax() {
		return tax;
	}

	@Override
	public void setTax() {
	
	}

	@Override
	public void Purchase() {
		SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
    String pdate = formatter.format(productionDate);
    System.out.println(description + " (production date: "+ pdate +", life: "+ life + " days) can be purchased for "+ price + "TL with "+tax+ " TL tax from "+ depot+ " in "+place);	
		
	
    
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
		
		return place;
	}

	@Override
	public void setPlace() {
	
		
	}



}
