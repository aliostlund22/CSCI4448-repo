package Main.Animal.Feline;

public class Tiger extends Feline {
    public Tiger (String names){
        super(names);
    }

    //makeNoise and eat are unique per animal
    public String makeNoise() {
       return "Roar";
    }
    public String eat() {
        return "Eating Steak";
    }
    public String names;

}

