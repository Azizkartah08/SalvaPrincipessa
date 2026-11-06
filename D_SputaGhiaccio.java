public class D_SputaGhiaccio extends Drago implements Runnable {

    public D_SputaGhiaccio(String nome) {
        super(nome);
    }

    @Override
    public String Distruggi() {
        return this.getNome() + " sta ghiacciando il villaggio";
    }

    @Override
    public void run() {
        for(int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            System.out.print(this.getNome() + " sputa ghiaccio e si libra nell'aria: " + (i+1) + " battiti");
        }
    }
}
