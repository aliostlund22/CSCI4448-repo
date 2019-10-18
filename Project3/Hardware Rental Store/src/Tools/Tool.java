package Tools;

public abstract class Tool {

	// Variables
	public double price;
	public String name;
	public String type;

	// Methods
	public double getToolPrice(){
		return this.price;
	} // Returns price of tool
	public String getToolName(){
		return this.name;
	} // Returns name of tool

	public abstract void setToolPrice(); // Set price of tool (done in subclasses based off category)
}
