import java.util.ArrayList;

class NegozioElettronica {
    private ArrayList<ProdottoElettronico> prodotti = new ArrayList<>();

    public void aggiungiProdotto(ProdottoElettronico prodotto) {
        for (ProdottoElettronico p : prodotti) {
            prodotti.add(prodotto);
        }

    }

    public ProdottoElettronico cercaProdotto(String codiceProdotto) {
        for (ProdottoElettronico p : prodotti) {
            if (p.getCodiceProdotto().equals(codiceProdotto)) {
                return p;
            }
        }
        return null;
    }

    public void rimuoviProdotto(String codiceProdotto) {
        prodotti.removeIf(p -> p.getCodiceProdotto().equals(codiceProdotto));
    }

    public void visualizzaProdotti() {
        if (prodotti.isEmpty()) {
            System.out.println("Nessun prodotto disponibile.");
        } else {
            for (ProdottoElettronico p : prodotti) {
                System.out.println(p);
            }
        }
    }
}