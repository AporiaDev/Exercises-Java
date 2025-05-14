public class Premium extends Suscripcion{

    public Premium(String nombre,
                   double valueSuscription,
                   Tipo tipo) {
        super(nombre,  valueSuscription);
        this.tipo = tipo;

    }

    @Override
    public double discountToGet(){
        double descuento = getValueSuscription() * tipo.getValueDiscount();
        double total = getValueSuscription() - descuento;
        return total - descuento;
    }
}
