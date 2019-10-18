package Tools;

public class ProtectionGearKit extends AddOns {
    // Constructor
    public ProtectionGearKit() {
        this.name = "Protection Gear Kit";
        setToolPrice();
    };


    @Override
    public void setToolPrice() {
        this.price = 15.0;

    }


}