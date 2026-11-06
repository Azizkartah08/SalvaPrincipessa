public class D_SputaFuoco extends Drago implements Runnable {
    public D_SputaFuoco(String nome) {
        super(nome);
    }

    @Override
    public String Distruggi() {
        return this.getNome() + " sta dando fuoco al villaggio";
    }

    @Override
    public void run() {
        for(int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            System.out.print(this.getNome() + " sputa fuoco e si libra nell'aria: " + (i+1) + " battiti");
        }
    }
}
