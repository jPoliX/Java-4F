public class Giocatore implements Comparable<Giocatore>{
    private String nome;
    private Integer nVittorie;
    private Dado dado;

    public Giocatore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Dado getDado() {
        return dado;
    }

    public Integer getnVittorie() {
        return nVittorie;
    }

    public void setnVittorie(Integer nVittorie) {
        this.nVittorie = nVittorie;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s NumeroVittorie: %d", nome, nVittorie);
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Giocatore giocatore) {
            return this.nome.equals(giocatore.nome);
        }
        return false;
    }

    @Override
    public int compareTo(Giocatore o) {
        return nVittorie.compareTo(o.nVittorie);
    }
    public int incremento(){
        return nVittorie++;
    }
}
