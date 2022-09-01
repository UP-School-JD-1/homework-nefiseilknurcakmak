
public class Gift extends Product implements Locatable{

String depot;
String place;


public Gift(String sku, String description, String depot, String place) {
	super(sku, description);
	this.depot = depot;
	this.place = place;
}

public void giveagift()
{
	System.out.println(description + " can be given as a gift from " + depot+ " in "+place);

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
