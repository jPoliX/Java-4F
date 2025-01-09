public class Automobile implements Comparable<Automobile>{
    private String marca, modello;
    private Integer cilindrata;

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public Automobile(String marca, String modello, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }
    public Automobile(Automobile auto){
        this.marca = auto.marca;
        this.modello = auto.modello;
        this.cilindrata = auto.cilindrata;
    }

    @Override
    public int compareTo(Automobile auto){
        return this.cilindrata.compareTo(auto.cilindrata);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Automobile){
            return this.marca.equals((((Automobile) obj).marca)) && this.modello.equals((((Automobile) obj).modello)) && this.cilindrata == ((Automobile) obj).cilindrata;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("Marca: %s Modello: %s Cilindrata: %d", marca, modello, cilindrata);
    }
}
