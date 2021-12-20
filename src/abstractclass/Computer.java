package abstractclass;

public abstract class Computer {

    abstract void display();

    abstract void typing();

    void turnOn(){
        System.out.println("전원을 킵니다.");
    }

    void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
