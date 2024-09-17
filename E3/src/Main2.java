interface Ejacutable {
    void ejecutar();
}

class Ejecutor {
    void ejecutarXVeces(int y, Ejacutable ejecutable){
        for (int i = 0; i < y; i++) {
            ejecutable.ejecutar();
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Ejecutor ejecutor = new Ejecutor();

        ejecutor.ejecutarXVeces(10,new Ejacutable(){
            @Override
            public void ejecutar() {
                System.out.println("Holiii, estamos executando...");
            }
        });
    }
}