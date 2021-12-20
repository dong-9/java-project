package abstractclass;

public abstract class Car {

    abstract void drive();

    abstract void stop();

    public void turnOff(){
        System.out.println("turn Off");
    }

    public void turnOn(){
        System.out.println("turn On");
    }

    public void washCar(){}

    final public void run(){
        turnOn();
        drive();
        stop();
        turnOff();
    }

}
