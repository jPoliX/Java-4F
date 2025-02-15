import java.util.Random;

public class Dado {
    private int valoreDado;

    public int getValoreDado() {
        return valoreDado;
    }

    public int lanciaDado() {
        Random rn = new Random();
        this.valoreDado = rn.nextInt(1, 6) + 1;
        return valoreDado;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Dado d) {
            return this.valoreDado == d.valoreDado;
        }
        return false;
    }
}
