package animalsurvival;

public class Fish extends Animal {

    public Fish(int hunger, int thirst, int warmth) {
        super(hunger, thirst, warmth);
    }
    
    public String toString() {
        return ("ANIMAL: FISHY" + super.toString());
    }
    
    
}
