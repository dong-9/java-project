package iostream;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {

        Person kim = new Person("김삼순", "과일가게사장");
        Person lee = new Person("이정재", "영화배우");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/iostream/serial.txt"))){
            oos.writeObject(kim);
            oos.writeObject(lee);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/iostream/serial.txt"))){
            Person pKim = (Person) ois.readObject();
            Person pLee = (Person) ois.readObject();
            System.out.println(pKim);
            System.out.println(pLee);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
