//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance("Enero");
        balance.agregarSuscripcion(new Plata("bryan", 2000, Tipo.PLATA));
        balance.agregarSuscripcion(new Premium("Daniela",  400, Tipo.PREMIUM));
        balance.agregarSuscripcion(new Platino("Brenda", 4000, Tipo.PLATINO));
        balance.imprimirListaSuscripcion();
        Balance balance2 = new Balance("Febrero");
        balance2.agregarSuscripcion(new Plata("bryan", 6060, Tipo.PLATA));
        balance2.agregarSuscripcion(new Premium("Daniela",  464, Tipo.PREMIUM));
        balance2.agregarSuscripcion(new Platino("Brenda", 9292, Tipo.PLATINO));
        balance2.imprimirListaSuscripcion();
    }
}