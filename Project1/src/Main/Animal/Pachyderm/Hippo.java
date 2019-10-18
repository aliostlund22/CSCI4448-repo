package Main.Animal.Pachyderm;

public class Hippo extends Pachyderm {
    public Hippo (String names){
        super(names);
    }

    //makeNoise and eat are unique per animal
    public String makeNoise() {return "Hippo is making noise";
    }
    public String eat() {
        return "Eating plants";
    }

}
