abstract class Ejacutable {
    abstract void ejecutar();
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

        //hay que poner bublic si es interface

        ejecutor.ejecutarXVeces(10,new Ejacutable(){
            @Override
            public void ejecutar() {
                System.out.println("Holiii, estamos executando...");
            }
        });
    }
}