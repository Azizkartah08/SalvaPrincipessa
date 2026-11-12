public class D_SputaFuoco extends Drago implements Runnable {
    private final Principessa principessaDaCatturare;

    public D_SputaFuoco(String nome, Principessa principessaDaCatturare) {
        super(nome);
        this.principessaDaCatturare = principessaDaCatturare;
    }

    // Costruttore mantenuto per compatibilità con il codice precedente.
    public D_SputaFuoco(String nome) {
        this(nome, null);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5 && !Thread.currentThread().isInterrupted(); i++) {
            // Genera un numero casuale compreso tra 0.0 (incluso) e 1.0 (escluso).
            double numeroCasuale = Math.random();

            // Se supera 0.5, il drago prova a catturare la principessa.
            if (numeroCasuale > 0.5 && principessaDaCatturare != null) {
                boolean catturata = principessaDaCatturare.tentaCattura(this);

                if (catturata) {
                    System.out.println(getNome() + " ha catturato "
                            + principessaDaCatturare.getNome() + "!");
                } else {
                    System.out.println(getNome()
                            + " tenta di catturare la principessa, ma non è libera.");
                }
            }

            System.out.println(getNome()
                    + " sputa fuoco e si libra nell'aria! Gioia immensa, al battito " + (i + 1));
        }
    }
}
