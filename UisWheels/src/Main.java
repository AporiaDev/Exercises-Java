//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance("Enero");
        balance.agregarSuscripcion(new Plata("bryan", "Silva", 2000, Tipo.PLATA));
        balance.agregarSuscripcion(new Premium("Daniela", "Silva", 400, Tipo.PREMIUM));
        balance.agregarSuscripcion(new Platino("Brenda", "Silva", 4000, Tipo.PLATINO));
        balance.imprimirListaSuscripcion();
    }
}