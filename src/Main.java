public class Main {
    public static void main(String[] args) throws Exception {

        Quadrato q = new Quadrato(20);

        System.out.println("Quadrato Area: " + q.area() + " Perimetro: " + q.perimetro());

        Rettangolo r = new Rettangolo(10, 20);

        System.out.println("Rettangolo Area: " + r.area() + " Perimetro: " + r.perimetro());

        Cerchio c = new Cerchio(20);

        System.out.println("Cerchio Area: " + c.area() + " Perimetro: " + c.perimetro());
    }
}
