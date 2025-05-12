public class Platino extends Suscripcion{

    public Platino(String nombre,
                   String apellido,
                   double valueSuscription, Tipo platino) {

        super(nombre, apellido, valueSuscription);
        this.tipo = platino;
    }

    @Override
    public double discountToGet() {
        double descuento = getValueSuscription() * tipo.getValueDiscount();
        double total = getValueSuscription() - descuento;
        return total - descuento;
    }

}
