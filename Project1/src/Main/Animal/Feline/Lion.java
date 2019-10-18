package Main.Animal.Feline;

public class Lion extends Feline {
    public Lion (String names){
        super(names);
    }

    //makeNoise and eat are unique per animal
    public String makeNoise() {
        return "Roar";
    }
    public String eat() {
        return "Eating Steak";
    }

}
