package Tools;

public class Woodwork extends Tool{

	// Constructor
	Woodwork(String name, String category) {
		this.name = name;
		this.type = category;
		setToolPrice();
	}

	@Override
	public void setToolPrice() {
		this.price = 3.0;
	}
}
