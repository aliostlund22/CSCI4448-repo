package Tools;

public class Plumbing extends Tool{

	// Constructor
	Plumbing(String name, String category) {
		this.name = name;
		this.type = category;
		setToolPrice();
	}

	@Override
	public void setToolPrice() {
		this.price = 3.0;
		
	}

}
