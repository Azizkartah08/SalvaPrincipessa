public class Drago {
    private String nome;
    private Cavaliere cacciatore;
    public Drago(String nome) {
        this.nome = nome;
    }

    public String Distruggi() {
        return this.nome + " sta distruggendo il villaggio";
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
