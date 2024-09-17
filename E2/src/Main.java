class Notification {
    void show(int num) {
        System.out.println("You have " + num + " new messages");
    }
}
public class Main {
    public static void main(String[] args) {

        Notification notification = new Notification(){
            void show(int num) {
                if (num > 99){
                    System.out.println("You have +99 new messages");
                }else if (num == 1){

                    System.out.println("You have " + num + " new message");
                }else {
                    System.out.println("You have " + num + " new messages");
                }
            }
        };

        notification.show(1);
        notification.show(10);
        notification.show(99);
        notification.show(100);
        notification.show(135);
    }
}