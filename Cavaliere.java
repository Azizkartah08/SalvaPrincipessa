public class Cavaliere implements Runnable {
    private final String nome;
    private final Thread dragoDaUccidere;

    public Cavaliere(String nome, Thread dragoDaUccidere) {
        this.nome = nome;
        this.dragoDaUccidere = dragoDaUccidere;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 && dragoDaUccidere.isAlive(); i++) {
            try {
                Thread.sleep(5);
                System.out.println(nome + " sta cercando di colpire il drago " + (i + 1));
                dragoDaUccidere.interrupt(); // Il cavaliere lancia una freccia
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(nome + " è stato interrotto.");
                return;
            }
        }
    }
}
