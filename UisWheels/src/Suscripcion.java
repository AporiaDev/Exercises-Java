public abstract class Suscripcion {

    private String nombre;
    private double valueSuscription;
    protected Tipo tipo;

    public Suscripcion(String nombre,
                       double valueSuscription) {
        this.nombre =   nombre;
        this.valueSuscription = valueSuscription;
    }

    public String getNombre() {
        return nombre;
    }
    public double getValueSuscription() {
        return valueSuscription;
    }
    public abstract double discountToGet();
}
