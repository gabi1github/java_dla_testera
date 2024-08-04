public class MainApp {
    
    public static void main(String[] args){

        Bug bug1 = new Bug("testowyopisbledu1", "testowyemail1", 2);

        bug1.getFullInfo();
        bug1.getEmail();
        bug1.getStatus();
        int priority = bug1.getPriority();
        System.out.println(priority);

        bug1.status = false;
        bug1.getStatus();

    }



}
