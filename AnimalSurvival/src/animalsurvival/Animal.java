package animalsurvival;

public class Animal {
  
    //fields
    protected int hunger;
    protected int hungerCap;
    protected int thirst;
    protected int thirstCap;
    protected int warmth;
    protected int warmthCap;
    

    public Animal(int hunger, int thirst, int warmth) {
        this.hunger = hunger-3;
        hungerCap = hunger;
        this.thirst = thirst-3;
        thirstCap = thirst;
        this.warmth = warmth-3;
        warmthCap = warmth;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setWarmth(int warmth) {
        this.warmth = warmth;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWarmth() {
        return warmth;
    }
    
    public String toString() {
        return ("\nHUNGER: " + hunger + "/" + hungerCap + "\nTHIRST: " + thirst 
                + "/" + thirstCap + "\nWARMTH: " + warmth + "/" + warmthCap);
    }
    
    public void menu(int day) {
    }
    
}

