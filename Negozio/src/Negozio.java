import java.util.ArrayList;

class NegozioElettronica {
    private ArrayList<Prodotto> prodotti = new ArrayList<>();

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
        System.out.println("Prodotto aggiunto!");
    }

    public Prodotto cercaProdotto(String nome) {
        for (Prodotto p : prodotti) {
            if (p instanceof Libro && ((Libro) p).getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    public void rimuoviProdotto(String nome) {
        prodotti.removeIf(p -> (p instanceof Libro && ((Libro) p).getNome().equals(nome)));
    }

    public void visualizzaProdotti() {
        if (prodotti.isEmpty()) {
            System.out.println("Nessun prodotto disponibile.");
        } else {
            for (Prodotto p : prodotti) {
                System.out.println(p);
            }
        }
    }
}
