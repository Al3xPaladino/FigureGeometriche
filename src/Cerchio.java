public class Cerchio extends Forma {
    
    private double raggio;

    //construct
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    //method
    @Override
    public double area() {
        return Math.PI * Math.pow(raggio, 2);
    }

    @Override
    public double perimetro() {
        return (2 * Math.PI) * raggio;
    }

}
