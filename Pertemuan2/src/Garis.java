/*
 * Nama File  : Garis.java
 * Deskripsi  : berisi atribut dan method dalam class Garis
 */

public class Garis {

    /************** ATRIBUT **************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /************** KONSTRUKTOR **************/

    // Konstruktor default
    Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    // Konstruktor dengan parameter
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    /************** SELEKTOR **************/

    // Mengembalikan titik awal
    Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan titik akhir
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengembalikan jumlah objek Garis
    static int getCounterGaris() {
        return counterGaris;
    }

    /************** MUTATOR**************/

    // Mengubah titik awal
    void setTitikAwal(Titik t) {
        titikAwal = t;
    }

    // Mengubah titik akhir
    void setTitikAkhir(Titik t) {
        titikAkhir = t;
    }

    /************** METHOD **************/

    // Menghitung panjang garis
    double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Menghitung gradien garis
    double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Menghitung titik tengah garis
    Titik getTitikTengah() {

        double x = (titikAwal.getAbsis() +
                    titikAkhir.getAbsis()) / 2;

        double y = (titikAwal.getOrdinat() +
                    titikAkhir.getOrdinat()) / 2;

        return new Titik(x,y);
    }

    // Mengecek apakah dua garis sejajar
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah dua garis tegak lurus
    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan titik pembentuk garis
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