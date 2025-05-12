import java.util.ArrayList;

public class Balance implements PatronBalance{

    private String nombreMes;
    private ArrayList<Suscripcion> suscripciones;

    public Balance(String nombreMes) {
        this.nombreMes = nombreMes;
        suscripciones = new ArrayList<>();
    }

    @Override
    public void agregarSuscripcion(Suscripcion suscripcion) {
        suscripciones.add(suscripcion);
    }
    @Override
    public void imprimirListaSuscripcion() {
        System.out.println("******Balance de" + nombreMes + "******");
        for (int i = 0; i < suscripciones.size(); i++) {
            Suscripcion suscripcion = suscripciones.get(i);


            System.out.println("El descontado a : "
                    + suscripcion.getNombre() + " es: $" + suscripcion.discountToGet() + " tipo de suscripcion " +
                    suscripcion.tipo);
        }
    }
}
