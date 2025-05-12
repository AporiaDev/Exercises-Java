public class Plata extends Suscripcion{

    public Plata(String nombre,
                 String apellido,
                 double valueSuscription,
                 Tipo tipo) {

        super(nombre, apellido, valueSuscription);
        this.tipo=tipo;
    }
    @Override
    public double discountToGet() {
        double descuento = getValueSuscription() * tipo.getValueDiscount();
        double total = getValueSuscription() - descuento;
        return total - descuento;
    }
}
