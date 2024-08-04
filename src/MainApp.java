import computer.Laptop;
import computer.PC;
import model.Bug;

public class MainApp {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500, 128, false);
        Laptop gamingLaptop = new Laptop("Gaming", "HP", 500, 500);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());



    }
}