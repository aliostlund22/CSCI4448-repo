
//Decorator
public abstract class AddOns extends Tool {
    public String name;
    public double price;

    @Override
    public double getPrice() {
        return price;
    }
}
