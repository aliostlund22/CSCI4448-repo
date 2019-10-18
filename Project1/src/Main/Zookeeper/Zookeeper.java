package Main.Zookeeper;
import Main.Animal.Animal;
import java.util.ArrayList;
import java.util.List;

//Responsible for calling all the methods in each class and then organizing that information
public class Zookeeper {

    //Each task (wakeup, make noise, eat, roam, sleep) is called for each animal
    //We go in the order given to us via the pdf project file
    public List<String> wakeUpAnimals(List<Animal> zoo){

        //return an array with all the wakeupAnimals information
        List<String> wakeZoo = new ArrayList<String>();
        String zoo1 = "";

        //Weird hacky code within this for loop but I didnt realize we needed to write to a file until i completed everything
        for (int i = 0; i < zoo.size(); i++ ){
            //System.out.print("Name: " + zoo.get(i).names + ", ");
            zoo1  =  zoo1 + "Name: ";
            zoo1  =  zoo1 + zoo.get(i).names;
            zoo1  =  zoo1 + ", ";
            //System.out.print("Type: " + zoo.get(i).getClass().getName() + ", ");
            zoo1  =  zoo1 + "Type: ";
            zoo1  =  zoo1 + zoo.get(i).getClass().getName();
            zoo1  =  zoo1 + ", ";
            //System.out.print("Response: ");
            zoo1  =  zoo1 + "Response: ";
            String wake = zoo.get(i).wakeUp();
            //System.out.println("fuck" + wake);
            zoo1  =  zoo1 + wake;

            //System.out.println("zoo1" + zoo1);
            //append each animal to a list
            wakeZoo.add(zoo1);
            zoo1 = "";

        }
        //return list of all woken up animals
        return wakeZoo;
    }

    public List<String> rollCall(List<Animal> zoo){

        //return an array with all the makeNoise information
        List<String> wakeZoo = new ArrayList<String>();
        String zoo1 = "";
        for (int i = 0; i < zoo.size(); i++ ){
            zoo1  =  zoo1 + "Name: ";
            zoo1  =  zoo1 + zoo.get(i).names;
            zoo1  =  zoo1 + ", ";
            //System.out.print("Type: " + zoo.get(i).getClass().getName() + ", ");
            zoo1  =  zoo1 + "Type: ";
            zoo1  =  zoo1 + zoo.get(i).getClass().getName();
            zoo1  =  zoo1 + ", ";
            //System.out.print("Response: ");
            zoo1  =  zoo1 + "Response: ";

            String noise = zoo.get(i).makeNoise();
            zoo1  =  zoo1 + noise;

            //System.out.println("zoo1" + zoo1);
            wakeZoo.add(zoo1);
            zoo1 = "";
        }

        return wakeZoo;

    }

    public List<String> feed(List<Animal> zoo) {

        //return an array with all the feeding information
        List<String> feeZoo = new ArrayList<String>();
        String zoo1 = "";
        for (int i = 0; i < zoo.size(); i++ ){
            zoo1  =  zoo1 + "Name: ";
            zoo1  =  zoo1 + zoo.get(i).names;
            zoo1  =  zoo1 + ", ";
            //System.out.print("Type: " + zoo.get(i).getClass().getName() + ", ");
            zoo1  =  zoo1 + "Type: ";
            zoo1  =  zoo1 + zoo.get(i).getClass().getName();
            zoo1  =  zoo1 + ", ";
            //System.out.print("Response: ");
            zoo1  =  zoo1 + "Response: ";

            String noise = zoo.get(i).eat();
            zoo1  =  zoo1 + noise;

            //System.out.println("zoo1" + zoo1);
            feeZoo.add(zoo1);
            zoo1 = "";
        }
        return feeZoo;
    }

    public List<String> exercise(List<Animal> zoo){

        //return an array with all the roaming information
        List<String> feeZoo = new ArrayList<String>();
        String zoo1 = "";
        for (int i = 0; i < zoo.size(); i++ ){
            zoo1  =  zoo1 + "Name: ";
            zoo1  =  zoo1 + zoo.get(i).names;
            zoo1  =  zoo1 + ", ";
            //System.out.print("Type: " + zoo.get(i).getClass().getName() + ", ");
            zoo1  =  zoo1 + "Type: ";
            zoo1  =  zoo1 + zoo.get(i).getClass().getName();
            zoo1  =  zoo1 + ", ";
            //System.out.print("Response: ");
            zoo1  =  zoo1 + "Response: ";

            String noise = zoo.get(i).roam();
            zoo1  =  zoo1 + noise;

            //System.out.println("zoo1" + zoo1);
            feeZoo.add(zoo1);
            zoo1 = "";
        }
        return feeZoo;
    }

    public List<String> shutDown(List<Animal> zoo){

        //return an array with all the sleeping information
        List<String> feeZoo = new ArrayList<String>();
        String zoo1 = "";
        for (int i = 0; i < zoo.size(); i++ ){
            zoo1  =  zoo1 + "Name: ";
            zoo1  =  zoo1 + zoo.get(i).names;
            zoo1  =  zoo1 + ", ";
            //System.out.print("Type: " + zoo.get(i).getClass().getName() + ", ");
            zoo1  =  zoo1 + "Type: ";
            zoo1  =  zoo1 + zoo.get(i).getClass().getName();
            zoo1  =  zoo1 + ", ";
            //System.out.print("Response: ");
            zoo1  =  zoo1 + "Response: ";

            String noise = zoo.get(i).sleep();
            zoo1  =  zoo1 + noise;

            //System.out.println("zoo1" + zoo1);
            feeZoo.add(zoo1);
            zoo1 = "";
        }
        return feeZoo;
    }



}
