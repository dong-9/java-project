package abstractclass;

public class Desktop extends Computer {

    @Override
    void display() {
        System.out.println("DeskTop display");
    }

    @Override
    void typing() {
        System.out.println("DeskTop Keyboard");
    }

    @Override
    void turnOn() {
        System.out.println("DeskTop TurnOn");
    }
}
