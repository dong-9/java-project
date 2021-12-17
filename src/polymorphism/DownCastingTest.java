package polymorphism;

import java.util.ArrayList;

public class DownCastingTest {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Person());
        animals.add(new Tiger());

        for(Animal animal : animals){
            if(animal instanceof Person) ((Person) animal).readBook();

            else if(animal instanceof Tiger) ((Tiger) animal).hunting();

            else System.out.println("Error");
        }
    }
}
