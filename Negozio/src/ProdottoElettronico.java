abstract class ProdottoElettronico {
    private String codiceProdotto;
    private String marca;
    private double prezzo;

    public ProdottoElettronico(String codiceProdotto, String marca, double prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return String.format("Codice Prodotto: %s Marca: %s Prezzo: %.2f", codiceProdotto, marca, prezzo);
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof ProdottoElettronico prodotto){
            return prodotto.codiceProdotto.equals(((ProdottoElettronico) o).codiceProdotto);
        }
        return false;
    }
}