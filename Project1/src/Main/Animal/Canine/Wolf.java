package Main.Animal.Canine;

public class Wolf extends Canine {
    public Wolf (String names){
        super(names);
    }

    //makeNoise and eat are unique per animal
    public String makeNoise() {
        return "Howl";
    }
    public String eat() {
        return "Eating Steak";
    }


}
