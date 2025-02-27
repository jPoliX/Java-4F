abstract public class Solido implements Cloneable {
    private double pesoSpecifico;

    protected Solido(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public void setPesoSpecifico(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    abstract public double volume();

    abstract public double superficie();

    public double peso() {
        return pesoSpecifico * volume();
    }

    @Override
    public String toString() {
        return "Sono un solido";
    }

    @Override
    public Solido clone() throws CloneNotSupportedException {
        return (Solido) super.clone();
    }
}
