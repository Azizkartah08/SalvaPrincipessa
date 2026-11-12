public class D_LanciaSassi extends Drago implements Runnable {
    public D_LanciaSassi(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5 && !Thread.currentThread().isInterrupted(); i++) {
            System.out.println(getNome()
                    + " lancia sassi e si libra nell'aria! Gioia immensa, al battito " + (i + 1));
        }
    }
}
