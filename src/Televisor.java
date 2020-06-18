public class Televisor {
    boolean status;

    Televisor(boolean status) {
        this.status = status;
    }

    void turnOn() {
        status = true;
    }

    void turnOff() {
        status = false;
    }

    void showStatus() {
        System.out.println("Status: " + status);
    }
}
