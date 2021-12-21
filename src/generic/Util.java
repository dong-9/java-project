package generic;

public class Util {

    public <T> T showPeople(T t){
        People<T> people = new People<>();
        people.setT(t);
        return people.getT();
    }
}
