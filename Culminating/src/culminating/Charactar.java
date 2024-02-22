/*
 * Name: Daniyal Naqvi
 * Date: June 2nd, 2022
 * Desc: Main charachter class, extends to player
 */

package culminating;

import java.io.IOException;

public class Charactar {
    
    //fields
    protected int hunger;
    protected int thirst;
    protected int sleep;
    
    //no-arg constuctor
    public Charactar(){
        hunger = 20;
        thirst = 20;
        sleep = 20;
    }
    
    //arg constructor
    public Charactar(int hun, int thr, int slp){
        hunger = hun;
        thirst = thr;
        sleep = slp;
    }
    
    //setters
    public void setHunger(int hun){
        hunger = hun;
    }

    public void setThirst(int thr){
        thirst = thr;
    }
    
    public void setSleep(int slp){
        sleep = slp;
    }
    
    //getters
    public int getHunger() {
        return hunger;
    } 
    public int getThirst() {
        return thirst;
    }
    public int getSleep() {
        return sleep;
    }
    
    /*
    All of the methods below are there to be overriden, so that we can access
    the unique methods in our subclasses. You can choose to place code in these
    methods (i.e print "If you are reading this an error occured"), but you
    should never be calling upon these methods.
    */
    
    public void menu() {
        System.out.println("Error: #93846");
    }
    public void eatFood() {
        System.out.println("Error: #19023");
    }
    public void drink() {
        System.out.println("Error: #90138");
    }
    public void Sleep(){
        System.out.println("Error: #09103");
    }
    public void getAJob(){
        System.out.println("Error: #90423");
    }
    public void workOnBusiness(){
        System.out.println("Error: #90310");
    }
    public void interact(){
        System.out.println("Error: #67324");
    }
    public void shop() throws IOException{
        System.out.println("Error: #08352");
    }
    
}
