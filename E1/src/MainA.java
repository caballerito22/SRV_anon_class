class Persona {
    // ...
}

class Alumne extends Persona {
    // ...
}

public class MainA {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {

        Alumne pastorBelga = new Alumne(){};

        imprimirJerarquiaDeClasses(pastorBelga.getClass());
    }
}