public class Plata extends Suscripcion{

    public Plata(String nombre,
                 double valueSuscription,
                 Tipo tipo) {

        super(nombre, valueSuscription);
        this.tipo=tipo;

    }

    @Override
    public double discountToGet() {
        double descuento = getValueSuscription() * tipo.getValueDiscount();
        double total = getValueSuscription() - descuento;
        return total - descuento;
    }
}
