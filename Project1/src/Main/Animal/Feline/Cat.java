package Main.Animal.Feline;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Cat extends Feline {
    public Cat (String names){
        super(names);
    }

    //makeNoise and eat are unique per animal
    //Here we determine the noise based off a random sample
    public String makeNoise() {
        List<String> noisesx = new ArrayList<String>();
        Random rand = new Random();

        // Generate random integers in range 0 to 2
        int rand_int1 = rand.nextInt(2);
        noisesx.add("prr");
        noisesx.add("meow");
        noisesx.add("scartssdfkdajfpo");
        String randomNoise = noisesx.get(rand_int1);
        return randomNoise;
    }
    public String eat() {
        return "Eating Tuna";
    }

}
