public class Premium extends Suscripcion{

    public Premium(String nombre,
                   String apellido,
                   double valueSuscription) {
        super(nombre, apellido, valueSuscription);
        this.tipo = tipo;

    }

    @Override
    public double discountToGet(){
        double descuento = getValueSuscription() * tipo.getValueDiscount();
        double total = getValueSuscription() - descuento;
        return total - descuento;
    }
}
