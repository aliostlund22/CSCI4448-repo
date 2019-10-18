package Tools;

public class Painting extends Tool {

	// Constructor
	Painting(String name, String category) {
		this.name = name;
		this.type = category;
		setToolPrice();
	}


	@Override
	public void setToolPrice() {
		this.price = 2.0;
		
	}


}
