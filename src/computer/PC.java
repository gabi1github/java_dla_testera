package computer;

public class PC extends Computer{

    private boolean isConnectedToSupply;

    public PC(String name, String type, int hdd, int ram, boolean isConnectedToSupply) {
        super(name, type, hdd, ram);
        this.isConnectedToSupply=isConnectedToSupply;
    }

    public void showComputerName(){
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isConnectedToSupply == true){
            super.switchOn();
        } else {
            System.out.println("Cannot swich on - not conneted to supply");
        }

    }
}
