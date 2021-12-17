package polymorphism;


import java.util.ArrayList;

class Animal {

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Person extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 움직입니다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends  Animal {

    @Override
    public void move() {
        System.out.println("사자가 움직입니다.");
    }

    public void hunting(){
        System.out.println("사자가 사냥합니다.");
    }
}

public class AnimalTest {

    public void moveAnimal(Animal animal){
        animal.move();
    }
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal person = new Person();
        Animal tiger = new Tiger();

        AnimalTest animalTest = new AnimalTest();
        animalTest.moveAnimal(animal);
        animalTest.moveAnimal(person);
        animalTest.moveAnimal(tiger);


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(person);
        animals.add(tiger);

        for(Animal ani : animals){
            ani.move();
        }
    }
}
