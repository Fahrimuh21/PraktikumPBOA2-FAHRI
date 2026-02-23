/*
 * Nama File  : MTitik.java
 * Deskripsi  : berisi program utama untuk menguji class Titik
 * Pembuat    : Muhammad Fahri
 * Tanggal    : 23 Februari 2026
 */

public class MTitik {

    /************** MAIN PROGRAM **************/
    public static void main(String[] args) {

        // Membuat objek Titik
        Titik T1 = new Titik();
        Titik T2 = new Titik(3,4);

        // Menampilkan jumlah objek Titik
        System.out.println("Jumlah Objek Titik = "
                + Titik.getCounterTitik());

        // Menampilkan koordinat
        T1.printTitik();
        T2.printTitik();

        /************** METHOD DASAR **************/

        // Menggeser titik
        T1.geser(2,3);
        T1.printTitik();

        // Menentukan kuadran
        System.out.println("Kuadran T2 = " + T2.getKuadran());

        // Jarak ke pusat
        System.out.println("Jarak T2 ke pusat = " + T2.getJarakPusat());

        // Jarak antar titik
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));

        /************** REFLEKSI **************/

        // Refleksi sumbu X (mengubah objek)
        T2.refleksiX();
        T2.printTitik();

        // Refleksi sumbu Y (menghasilkan objek baru)
        Titik T3 = T2.getRefleksiY();
        T3.printTitik();

        /************** OBJECT REFERENCE **************/

        T2 = T1;
        T2.printTitik();

        // Menampilkan counter
        T1.printCounterTitik();
    }
}