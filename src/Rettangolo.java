public class Rettangolo extends Forma {

    private double base;
    private double altezza;

    // constructor
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // method
    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public double perimetro() {
        return (base + altezza) * 2;
    }

}