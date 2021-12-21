package generic;


public class GenericClass implements GenericInterface<String> {

    @Override
    public String example() {
        return "GenericCLass";
    }

    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass();

    }
}
