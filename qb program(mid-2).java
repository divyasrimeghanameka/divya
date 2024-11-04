import java.util.*;
interface Flyable  
{ 
    void fly(); 
} 
interface Swimmable { 
    void swim(); 
} 
class Duck implements Flyable, Swimmable { 
    @Override 
    public void fly() { 
        System.out.println("The duck is flying."); 
    } 
    public void swim() { 
        System.out.println("The duck is swimming."); 
    } 
} 
public class Main { 
    public static void main(String[] args) { 
        Duck myDuck = new Duck(); 
        myDuck.fly();   // Outputs: The duck is flying. 
        myDuck.swim();  // Outputs: The duck is swimming. 
    }
}
