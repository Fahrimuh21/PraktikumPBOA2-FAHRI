/* Nama File : Titik.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class Titik {

    /******************** ATRIBUT ********************/
    double absis;          // koordinat X
    double ordinat;        // koordinat Y
    static int counterTitik = 0; // jumlah objek Titik yang dibuat

    /******************** METHOD ********************/

    // Membuat objek Titik dengan koordinat default (0,0)
    Titik() {
        this(0,0);
    }

    // Membuat objek Titik dengan koordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengembalikan jumlah objek Titik yang dibuat
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        ordinat = y;
    }

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

    // Menghitung jarak titik ke pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // Menghitung jarak ke titik lain
    double getJarak(Titik T) {
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // Refleksi terhadap sumbu X (mengubah objek)
    void refleksiX() {
        ordinat = -ordinat;
    }

    // Refleksi terhadap sumbu Y (mengubah objek)
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