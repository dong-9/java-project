package abstractclass;

public class Benz extends Car{
    @Override
    void drive() {
        System.out.println("Benz Drive");
    }

    @Override
    void stop() {
        System.out.println("Benz Stop");
    }
}
