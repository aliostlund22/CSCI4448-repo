package Tools;

public class Yardwork extends Tool{

	// Constructor
	Yardwork(String name, String category) {
		this.name = name;
		this.type = category;
		setToolPrice();
	}

	@Override
	public void setToolPrice() {
		this.price = 4.0;
	}
}
