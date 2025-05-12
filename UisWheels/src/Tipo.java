public enum Tipo {
    PLATA(0.1) , PREMIUM(0.2), PLATINO(0.3);
    private final double value;

    Tipo(double value){
        this.value = value;
    }
    public double getValueDiscount(){
        return value;
    }

}
