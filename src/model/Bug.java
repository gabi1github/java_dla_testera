package model;

import java.security.KeyStore;

public class Bug {

    private String bugDescription;
    private String email;
    private int priority;
    private boolean status;

    public Bug(String bugDescription, String email, int priority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.status = true;
    }

    public void getFullInfo() {
        System.out.println(bugDescription + " " + email + " " + priority + " " + status);
    }

    public void getEmail() {
        System.out.println(email);
    }

    public void getStatus() {
        System.out.println(status);
    }

    public int getPriority() {
        return priority;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("bugDescription is too short");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("email is incorrect");
        }
    }

    public void setPriority(int priority) {
        switch (priority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.priority = priority;
                break;
            default: {
                System.out.println("Incorrect priotity");
            }
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}


