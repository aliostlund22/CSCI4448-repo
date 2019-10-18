package Main.Animal.Pachyderm;

import Main.Animal.Animal;

//Second level in class hierarchy based on a given animals species

public abstract class Pachyderm extends Animal {
    public Pachyderm (String names){
        super(names);
    }

    //Only responsible for roaming
    public String roam(){
        return "Pachyderm is roaming";
    }

}
