interface KK {
}


public class MainB {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {

        Alumne pastorBelga = new Alumne() {
        };

        KK kk = new KK() {};
        imprimirJerarquiaDeClasses(kk.getClass());
    }
}