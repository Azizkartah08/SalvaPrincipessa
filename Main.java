public class Main {
    public static void main(String[] args) {
        Principessa principessa = new Principessa("Aurora");

        D_SputaFuoco drago1 = new D_SputaFuoco("Fiamma", principessa);
        D_SputaFuoco drago2 = new D_SputaFuoco("Bruciacuore", principessa);
        D_SputaFuoco drago3 = new D_SputaFuoco("Scarlatto", principessa);

        Thread t1 = new Thread(drago1);
        Thread t2 = new Thread(drago2);
        Thread t3 = new Thread(drago3);

        Thread[] draghi = {t1, t2, t3};

        // Il cavaliere prende di mira il secondo drago.
        Thread cavaliere = new Thread(new Cavaliere("Giorgio", t2));

        System.out.println("I draghi sono partiti per distruggere i villaggi.");

        for (Thread drago : draghi) {
            drago.start();
        }
        cavaliere.start();

        try {
            cavaliere.join();
            for (Thread drago : draghi) {
                drago.join();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("L'esecuzione principale è stata interrotta.");
            return;
        }

        // Se il drago sconfitto era il carceriere, il cavaliere libera Aurora.
        if (principessa.libera(drago2)) {
            System.out.println("Il cavaliere ha liberato " + principessa.getNome() + "!");
        }

        System.out.println("Stato della principessa: " + principessa.getStato());
        if (principessa.getCarceriere() != null) {
            System.out.println("Carceriere: " + principessa.getCarceriere().getNome());
        }
        System.out.println("Avventura terminata.");
    }
}
