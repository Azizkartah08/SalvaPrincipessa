import java.util.ArrayList;

public class Cavaliere implements Runnable {
    private String nome;
    private Cavaliere maestro;
    private ArrayList<Drago> draghiUccisi;
    private Thread dragoDaUccidere;

    public Cavaliere(String nome, Thread dragoDaUccidere) {
        this.nome = nome;
        this.dragoDaUccidere = dragoDaUccidere;
        this.draghiUccisi = new ArrayList<Drago>();
    }

    public void AggiungiDragoUcciso(Drago d) {
        this.draghiUccisi.add(d);
    }

    public ArrayList<Drago> getDraghiUccisi() {
        return draghiUccisi;
    }

    public void run() {
        for (int i = 0; (i <= 20) && (!dragoDaUccidere.isInterrupted()); i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("sleep error nel main" + e);
            }
            System.out.println("il cacciatore " + nome + " sta lanciando il dardo = " + i);
            dragoDaUccidere.interrupt();
        }
    }
}
