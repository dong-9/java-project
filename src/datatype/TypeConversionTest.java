package datatype;

public class TypeConversionTest {
    public static void main(String[] args){
        byte byteNum = 10;
        int intNum = byteNum;

        System.out.println(intNum);

        intNum = 255;
        byteNum = (byte) intNum;
        System.out.println(byteNum);

        double doubleNum = 1.2;
        float floatNum = 0.8F;

        int dSumF1 = (int)doubleNum + (int)floatNum;
        int dSumF2 = (int)(doubleNum + floatNum);

        System.out.println(dSumF1);
        System.out.println(dSumF2);
    }
}