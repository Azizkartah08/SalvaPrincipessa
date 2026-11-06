import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringBuilder storytelling = new StringBuilder();
        ArrayList<Thread> draghi = new ArrayList<>();
        for(int i = 0; (i < 3); i++) {
            Thread t = new Thread(new D_SputaFuoco(String.valueOf(i)));
            draghi.add(t);
        }
        Thread sangiorgio = new Thread(new Cavaliere("giorgio", get(1)));

        for(Thread t: draghi) {
            t.start();
        }
        System.out.println("I draghi sono partiti per distruggere i villaggi");
        sangiorgio.start();
        System.out.println(sangiorgio.getName() + " ha atterrato il drago");
    }
}
