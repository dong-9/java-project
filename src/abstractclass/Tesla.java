package abstractclass;

public class Tesla extends Car{

    @Override
    void drive() {
        System.out.println("Tesla Drive");
    }

    @Override
    void stop() {
        System.out.println("Tesla Stop");
    }
}
