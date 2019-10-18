package Main.Animal.Canine;

//Third level of class hierarchy
public class Dog extends Canine {
    public Dog (String names){
        super(names);
    }

    //makeNoise and eat are unique per animal
    public String makeNoise() {
        return "Woof";
    }
    public String eat() {
         return "Eating Kibble";
    }

}
