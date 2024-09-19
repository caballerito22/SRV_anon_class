import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface Alerta {
    String getMissatge();

    default int getMinuts() {
        return 0;
    }

    int getSegons();
}

class Temporitzador {
    List<Thread> threadList = new ArrayList<>();

    Temporitzador programar(Alerta alerta) {
        threadList.add(Thread.ofVirtual().start(() -> {
            try {
                Thread.sleep(alerta.getSegons() * 1000);
            } catch (Exception _) {
            }
            System.out.println("¡ALERTA! " + alerta.getMissatge());
        }));

        return this;
    }

    public void esperarQueAcabenLesAlertes() throws InterruptedException {
        for (Thread thread : threadList) thread.join();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclat = new Scanner(System.in);
        Temporitzador temporitzador = new Temporitzador();

        while (true){

            System.out.println("Introduce el mensaje");
            String mensaje = teclat.nextLine();
            System.out.println("Introduce el tiempo");
            int tiempo = teclat.nextInt();
            teclat.nextLine();

            temporitzador.programar(new Alerta() {
                public String getMissatge() {
                    return mensaje;
                }

                public int getSegons() {
                    return tiempo;
                }
            });


        }

    }
}