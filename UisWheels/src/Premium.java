public class Premium extends Suscripcion{

    public Premium(String nombre,
                   String apellido,
                   double valueSuscription, Tipo premium) {
        super(nombre, apellido, valueSuscription);
        this.tipo = premium;

    }

    @Override
    public double discountToGet(){
        double descuento = getValueSuscription() * tipo.getValueDiscount();
        double total = getValueSuscription() - descuento;
        return total - descuento;
    }
}
