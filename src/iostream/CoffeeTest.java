package iostream;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee coffe = new EtiopiaAmericano();
        coffe.brewing();
        System.out.println();

        Coffee latte = new Latte(coffe);
        latte.brewing();
        System.out.println();

        Coffee mocha = new Mocha(new Latte(new EtiopiaAmericano()));
        mocha.brewing();
    }
}
