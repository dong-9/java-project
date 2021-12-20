package abstractclass;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {

        Computer desktop = new Desktop();
        Computer myNoteBook = new MyNotebook();

        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(desktop);
        computers.add(myNoteBook);

        for(Computer computer : computers){
            computer.turnOn();
            computer.display();
            computer.typing();
            computer.turnOff();
        }
    }
}
