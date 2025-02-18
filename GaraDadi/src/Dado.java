import java.util.Random;

public class Dado {
    private int valoreDado;
    public Dado(){
    }
    public int getValoreDado() {
        return valoreDado;
    }

    public int lanciaDado() {
        Random rn = new Random();
        this.valoreDado = rn.nextInt(1, 6);
        return valoreDado;
    }
}
