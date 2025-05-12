public abstract class Suscripcion {

    private String nombre;
    private String apellido;
    private double valueSuscription;
    protected Tipo tipo;

    public Suscripcion(String nombre,
                       String apellido,
                       double valueSuscription) {
        this.nombre =   nombre;
        this.apellido = apellido;
        this.valueSuscription = valueSuscription;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getValueSuscription() {
        return valueSuscription;
    }
    public void setValueSuscription(double valueSuscription) {
        this.valueSuscription = valueSuscription;
    }
    public abstract double discountToGet();
}
