package generic;

public class Printer<T extends Material> {

    private T material;

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return material;
    }

    public String toString(){
        return material.toString();
    }
}
