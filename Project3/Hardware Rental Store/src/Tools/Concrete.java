package Tools;

public class Concrete extends Tool {

	// Constructor
	Concrete(String name, String category) {
		this.name = name;
		this.type = category;
		setToolPrice();
	}

	@Override
	public void setToolPrice() {
		this.price = 1.0;
	}
}