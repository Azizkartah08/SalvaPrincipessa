public class Drago {
    private final String nome;
    private Cavaliere cacciatore;

    public Drago(String nome) {
        this.nome = nome;
    }

    public Cavaliere getCacciatore() {
        return cacciatore;
    }

    public void setCacciatore(Cavaliere cacciatore) {
        this.cacciatore = cacciatore;
    }

    public String getNome() {
        return nome;
    }
}
