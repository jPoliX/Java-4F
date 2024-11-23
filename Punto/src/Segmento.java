public class Segmento {
    private Punto puntoA;
    private Punto puntoB;

    public Segmento(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public double calcolaLunghezza() {
        double dx = puntoB.getX() - puntoA.getX();
        double dy = puntoB.getY() - puntoA.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}