/* Nama File : Garis.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class Garis {

    /******************** ATRIBUT ********************/
    Titik titikAwal;   // titik awal garis
    Titik titikAkhir;  // titik akhir garis
    static int counterGaris = 0; // jumlah objek Garis yang dibuat

    /******************** METHOD ********************/

    // Membuat objek Garis dengan titik default (0,0) ke (1,1)
    Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    // Membuat objek Garis dengan titik awal dan akhir tertentu
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Mengembalikan titik awal garis
    Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan titik akhir garis
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengembalikan jumlah objek Garis yang dibuat
    static int getCounterGaris() {
        return counterGaris;
    }

    // Mengubah titik awal garis
    void setTitikAwal(Titik t) {
        titikAwal = t;
    }

    // Mengubah titik akhir garis
    void setTitikAkhir(Titik t) {
        titikAkhir = t;
    }

    // Menghitung panjang garis
    double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Menghitung gradien (kemiringan) garis
    double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Menghitung titik tengah garis
    Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x,y);
    }

    // Mengecek apakah garis sejajar dengan garis G
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah garis tegak lurus dengan garis G
    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan titik awal dan titik akhir garis
    void printGaris() {
        System.out.println("Titik Awal : (" +
                titikAwal.getAbsis() + "," +
                titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir : (" +
                titikAkhir.getAbsis() + "," +
                titikAkhir.getOrdinat() + ")");
    }

    // Menghasilkan persamaan garis y = mx + c
    String getPersamaanGaris() {
        double m = getGradien();
        double x = titikAwal.getAbsis();
        double y = titikAwal.getOrdinat();
        double c = y - m*x;
        return "y = " + m + "x + " + c;
    }
}