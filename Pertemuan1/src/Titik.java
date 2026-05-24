/* Nama File : Titik.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class Titik {

    /******************** ATRIBUT ********************/
    double absis;   // koordinat X
    double ordinat; // koordinat Y

    /******************** METHOD ********************/

    // Membuat object Titik dengan absis dan ordinat = 0
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis titik
    void setAbsis(double x) {
        absis = x;
    }

    // Mengubah nilai ordinat titik
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser titik sejauh (x, y)
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Menampilkan koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}