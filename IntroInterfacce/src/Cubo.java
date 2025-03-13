public class Cubo extends Solido {
    private double lato;

    protected Cubo(double pesoSpecifico, double lato) {
        super(pesoSpecifico);
        this.lato = lato;
    }

    @Override
    public double volume() {
        return Math.pow(lato, 3);
    }

    @Override
    public double superficie() {
        return Math.pow(lato, 2) * 6;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Sono una cubo, la mia superficie è %.2f e il mio volume è %.2f", superficie(), volume());
    }
}
