class Notification {
    void show(int num) {
        System.out.println("You have " + num + " new messages");
    }
}

public class Main {
    public static void main(String[] args) {

        Notification notification = new Notification();

        notification.show(1);
        notification.show(10);
        notification.show(99);
        notification.show(100);
        notification.show(135);
    }
}