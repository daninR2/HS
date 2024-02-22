package animalsurvival;

public class Giraffe extends Animal{

    public Giraffe(int hunger, int thirst, int warmth) {
        super(hunger, thirst, warmth);
    }
    
    public String toString() {
        return ("ANIMAL: GIRAFFE" + super.toString());
    }
}
