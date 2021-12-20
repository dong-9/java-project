package interfacetest;

public class CalculatorTest {
    public static void main(String[] args) {

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(1,2));
        System.out.println(calc.sub(1,2));
        System.out.println(calc.times(1,2));
        System.out.println(calc.divide(1,2));
        System.out.println(calc.divide(1,0));

    }
}
