import java.security.KeyStore;

public class Bug {

    String bugDescription;
    String email;
    int priority;
    boolean status;

    Bug(String bugDescription, String email, int priority){
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.status = true;
    }

    void getFullInfo() {
        System.out.println(bugDescription + " " + email + " " + priority + " " + status);
    }

    void getEmail (){
        System.out.println(email);
    }

    void getStatus(){
        System.out.println(status);
    }

    int getPriority(){
        return priority;
    }
}
