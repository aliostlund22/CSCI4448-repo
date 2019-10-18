package Main.Animal.Canine;

import Main.Animal.Animal;

//Second level in class hierarchy based on a given animals species
public abstract class Canine extends Animal {
    public Canine (String names){
        super(names);
    }

    //Only responsible for roaming
    public String roam(){
        return "Canine is roaming";
    }

}
