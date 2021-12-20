package abstractclass;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Tesla());
        cars.add(new Benz());

        for(Car car : cars){
            car.run();
            System.out.println();
        }
    }
}
