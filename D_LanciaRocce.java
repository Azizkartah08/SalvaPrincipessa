public class D_LanciaRocce extends Drago implements Runnable {

    public D_LanciaRocce(String nome) {
        super(nome);
    }

    @Override
    public String Distruggi() {
        return this.getNome() + " sta lanciando sassi al villaggio";
    }

    @Override
    public void run() {
        for(int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            System.out.print(this.getNome() + " lancia rocce e si libra nell'aria: " + (i+1) + " battiti");
        }
    }
}
