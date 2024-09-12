class PersonaB {
    // ...
}

interface alumne {
}


public class MainB {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {

        alumne pastorBelga = new alumne() {
        };

        imprimirJerarquiaDeClasses(pastorBelga.getClass());
    }
}