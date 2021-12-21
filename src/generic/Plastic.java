package generic;

public class Plastic extends Material{
    public String toString(){
        return "PLASTIC";
    }

    @Override
    public void doPrinting() {
        System.out.println("플라스틱 출력");
    }
}
