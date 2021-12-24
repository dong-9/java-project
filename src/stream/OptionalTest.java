package stream;

import java.util.Optional;

public class OptionalTest {

    public static Optional<String> createEmpty(){
        return Optional.empty();
    }

    public static boolean isPresent(){
        return createEmpty().isPresent();
    }

    public static String offNullable(){
        return (String) Optional.ofNullable(null).orElse("Anonymous");
    }


    public static void main(String[] args) {
        System.out.println(createEmpty());
        System.out.println(isPresent());
        System.out.println(offNullable());
        System.out.println(Optional.ofNullable(null));
        System.out.println(Optional.ofNullable("null"));
    }
}
