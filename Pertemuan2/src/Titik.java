/*
 * Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Muhammad Fahri
 * Tanggal    : 23 Februari 2026
 */

public class Titik {

    /************** ATRIBUT **************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /************** KONSTRUKTOR **************/

    // Konstruktor default (0,0)
    Titik() {
        this(0,0);
    }

    // Konstruktor dengan parameter
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    /************** SELEKTOR **************/

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengembalikan jumlah objek Titik
    static int getCounterTitik() {
        return counterTitik;
    }

    /************** MUTATOR**************/

    // Mengubah nilai absis
    void setAbsis(double x) {
        absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        ordinat = y;
    }

    /************** METHOD DASAR **************/

    // Menggeser titik sejauh (x,y)
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Menampilkan koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Menampilkan jumlah objek Titik
    void printCounterTitik() {
        System.out.println(counterTitik);
    }

    /************** METHOD BAGIAN 6 **************/

    // Menentukan kuadran titik
    int getKuadran() {

        if (absis > 0 && ordinat > 0)
            return 1;
        else if (absis < 0 && ordinat > 0)
            return 2;
        else if (absis < 0 && ordinat < 0)
            return 3;
        else
            return 4;
    }

    // Menghitung jarak ke pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // Menghitung jarak ke titik lain
    double getJarak(Titik T) {

        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;

        return Math.sqrt(dx*dx + dy*dy);
    }

    // Refleksi terhadap sumbu X
    void refleksiX() {
        ordinat = -ordinat;
    }

    // Refleksi terhadap sumbu Y
    void refleksiY() {
        absis = -absis;
    }

    // Menghasilkan titik baru hasil refleksi X
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Menghasilkan titik baru hasil refleksi Y
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}