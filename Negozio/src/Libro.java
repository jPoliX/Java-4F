public class Libro implements Prodotto {
    private String nome;
    private String descrizione;
    private String autore;
    private int ISBN;
    private double prezzo;
    private int quantità;

    public Libro(String nome, String descrizione, String autore, int ISBN, double prezzo, int quantità) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.autore = autore;
        this.ISBN = ISBN;
        this.prezzo = prezzo;
        this.quantità = quantità;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    public String getAutore() { return autore; }
    public void setAutore(String autore) { this.autore = autore; }

    public int getISBN() { return ISBN; }
    public void setISBN(int ISBN) { this.ISBN = ISBN; }

    public double getPrezzo() { return prezzo; }
    public void setPrezzo(double prezzo) { this.prezzo = prezzo; }

    public int getQuantità() { return quantità; }
    public void setQuantità(int quantità) { this.quantità = quantità; }

    @Override
    public void crea() {
        System.out.println("Libro creato: " + nome);
    }

    @Override
    public void leggi() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Autore: " + autore);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Quantità: " + quantità);
    }

    @Override
    public void aggiorna() {
        System.out.println("Aggiornato: " + nome);
    }

    @Override
    public void elimina() {
        System.out.println("Libro eliminato: " + nome);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Autore: %s, ISBN: %d, Prezzo: %.2f, Quantità: %d", nome, autore, ISBN, prezzo, quantità);
    }
}
