public class Plata extends Suscripcion{

    public Plata(String nombre,
                 String apellido,
                 double valueSuscription, Tipo plata) {

        super(nombre, apellido, valueSuscription);
        this.tipo=plata;

    }

    @Override
    public double discountToGet() {
        double descuento = getValueSuscription() * tipo.getValueDiscount();
        double total = getValueSuscription() - descuento;
        return total - descuento;
    }
}
