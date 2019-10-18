package Main.Animal.Pachyderm;

public class Rhino extends Pachyderm {
    public Rhino (String names){
        super(names);
    }

    //makeNoise and eat are unique per animal
    public String makeNoise() {
        return "Rhino is making noise";
    }
    public String eat() {
        return "Eating Grass";
    }



}
