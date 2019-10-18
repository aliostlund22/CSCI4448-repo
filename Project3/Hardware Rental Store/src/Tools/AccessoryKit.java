package Tools;

public class AccessoryKit extends AddOns {

    // Constructor
    public AccessoryKit() {
        this.name = "Accessory Kit";
        setToolPrice();
    };


    @Override
    public void setToolPrice() {
        this.price = 20.0;

    }


}