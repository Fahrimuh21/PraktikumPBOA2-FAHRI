/* Nama File : Piaraan.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul removed = Lanabul.poll();
        if (removed != null) {
            nbelm--;
        }
        return removed;
    }

    public void showAnabul() {
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul.getClass().getSimpleName().equals("Kucing")) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                totalBobot += ((Kucing) anabul).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama() + " - " + anabul.getClass().getSimpleName());
        }
    }
}