package Main.Animal.Feline;
import Main.Animal.Animal;

//Second level in class hierarchy based on a given animals species
public abstract class Feline extends Animal {
    public Feline (String names){
        super(names);
    }

    //Only responsible for roaming
    public String roam(){
        return "Feline is roaming";
    }

}

