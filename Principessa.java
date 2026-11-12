public class Principessa {
    private final String nome;
    private Drago carceriere;
    // Valori possibili: "libera", "prigioniera", "liberata".
    private String stato;

    public Principessa(String nome) {
        this.nome = nome;
        this.stato = "libera";
        this.carceriere = null;
    }

    public String getNome() {
        return nome;
    }

    public synchronized Drago getCarceriere() {
        return carceriere;
    }

    public synchronized void setCarceriere(Drago carceriere) {
        this.carceriere = carceriere;
    }

    public synchronized String getStato() {
        return stato;
    }

    public synchronized void setStato(String stato) {
        this.stato = stato;
        if (!"prigioniera".equals(stato)) {
            this.carceriere = null;
        }
    }

    // synchronized impedisce a due draghi di catturarla contemporaneamente.
    public synchronized boolean tentaCattura(Drago drago) {
        if (!"libera".equals(stato)) {
            return false;
        }

        stato = "prigioniera";
        carceriere = drago;
        return true;
    }

    public synchronized boolean libera(Drago drago) {
        if ("prigioniera".equals(stato) && carceriere == drago) {
            stato = "liberata";
            carceriere = null;
            return true;
        }
        return false;
    }
}
