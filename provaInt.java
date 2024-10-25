case 6 ->{
                    if(i>0){
                        Libro nuovo = new Libro();
                        System.out.println("inserisci l'autore:");
                        nuovo.Autore = tastiera.nextLine();
                        System.out.println("inserisci il titolo:");
                        nuovo.Titolo = tastiera.nextLine();
                        try {
                            if (trovaData(nuovo, mensola, i)) {
                                System.out.println("Il libro è stato pubblicato negli anni 2000");
                            } else
                                throw new Exception("Il libro è vecchio");
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                }


public static boolean trovaData( Libro nuovo, Libro[] mensola, int numeroLibri){
        LocalDate today = LocalDate.of(2000, 1, 1);
        for(int i=0; i<numeroLibri; i++){
            if (mensola[i].Autore.equals(nuovo.Autore) && mensola[i].Titolo.equals(nuovo.Titolo)) {
                return mensola[i].dataDiPubblicazione.isAfter(today);
            }
        }
        return false;
    }
