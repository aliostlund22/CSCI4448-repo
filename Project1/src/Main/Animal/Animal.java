package Main.Animal;

//Top Level
//Every animal will wake up and sleep the same so we define it in this superclass
public abstract class Animal {
    public String sleep(){
        return "Sleeping...";
    }
    public String wakeUp() {return "Waking Up...";}

    //Methods used in second class
    public abstract String roam();

    //Methods used in third class
    public abstract String eat();
    public abstract String makeNoise();
    public String names;

    //give each animal a name
    public Animal (String names){
        this.names = names;
    }

}
