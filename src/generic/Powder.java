package generic;

public class Powder extends Material {
    public String toString(){
        return "POWDER";
    }

    @Override
    public void doPrinting() {
        System.out.println("파우더 출력");
    }
}
