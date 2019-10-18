package Main;
import Main.Animal.Animal;
import Main.Animal.Canine.Dog;
import Main.Animal.Canine.Wolf;
import Main.Animal.Feline.Cat;
import Main.Animal.Feline.Lion;
import Main.Animal.Feline.Tiger;
import Main.Animal.Pachyderm.Elephant;
import Main.Animal.Pachyderm.Hippo;
import Main.Animal.Pachyderm.Rhino;
import Main.Zookeeper.Zookeeper;

import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main( String[] args){

        //First we create our zoo
        Animal Doug = new Dog("Doug");
        Animal Will = new Wolf("Will");
        Animal Chloe = new Cat("Chloe");
        Animal Leo = new Lion("Leo");
        Animal Tim = new Tiger("Tim");
        Animal Elly = new Elephant("Elly");
        Animal Herman = new Hippo("Herman");
        Animal Rex = new Rhino("Rex");

        //add it to a list of type Animal
        List<Animal> zoo = new ArrayList<>();
        zoo.add(Doug);
        zoo.add(Will);
        zoo.add(Chloe);
        zoo.add(Leo);
        zoo.add(Tim);
        zoo.add(Elly);
        zoo.add(Herman);
        zoo.add(Rex);

        //Create a Zookeper to call speciifc methods on our zoo
        Zookeeper Kevin = new Zookeeper();

        //Wake
        List<String> wakeZoo = new ArrayList<String>();
        wakeZoo = Kevin.wakeUpAnimals(zoo);
        System.out.println("Wake" + wakeZoo);

        //Make Noise
        List<String> rollCallZoo = new ArrayList<String>();
        rollCallZoo = Kevin.rollCall(zoo);
        System.out.println("RollCall" + rollCallZoo);

        //Feed
        List<String> feeZoo = new ArrayList<String>();
        feeZoo = Kevin.feed(zoo);
        System.out.println("Feed" + feeZoo);

        //Exercise
        List<String> eZoo = new ArrayList<String>();
        eZoo = Kevin.exercise(zoo);
        System.out.println("Exercise" + eZoo);

        //Sleep
        List<String> sZoo = new ArrayList<String>();
        sZoo = Kevin.shutDown(zoo);
        System.out.println("ShutDown" + sZoo);

        //Combine all the output so we can print it in a simple way
        ArrayList<String> al= new ArrayList<String>();
        al.addAll(wakeZoo);
        al.addAll(rollCallZoo);
        al.addAll(feeZoo);
        al.addAll(eZoo);
        al.addAll(sZoo);

        //Create output file
        Path out = Paths.get("dayatthezoo.out");

        //Write data to file
        try {
            Files.write(out, al, Charset.defaultCharset());
        } catch (Exception e) {
            // Handle it.
        }

    }

}




