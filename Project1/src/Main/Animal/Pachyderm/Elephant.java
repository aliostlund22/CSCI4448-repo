package Main.Animal.Pachyderm;

public class Elephant extends Pachyderm {
    public Elephant (String names){
        super(names);
    }

    //makeNoise and eat are unique per animal
    public String makeNoise() {
        return "Elephant is making noise";
    }
    public String eat() {
        return "Eating Grass";
    }


}
