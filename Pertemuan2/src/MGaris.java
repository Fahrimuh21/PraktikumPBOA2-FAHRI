/*
 * Nama File  : MGaris.java
 * Deskripsi  : berisi program utama untuk menguji class Garis
 */

public class MGaris {

    /************** MAIN PROGRAM **************/

    public static void main(String[] args) {

        // Membuat titik
        Titik A = new Titik(-2,0);
        Titik B = new Titik(0,4);
        Titik C = new Titik(0,0);
        Titik D = new Titik(2,4);

        // Membuat objek Garis
        Garis G1 = new Garis(A,B);
        Garis G2 = new Garis(C,D);
        Garis G3 = new Garis(); // konstruktor default

        /************** MENAMPILKAN DATA GARIS **************/

        G1.printGaris();
        System.out.println("Panjang G1 = " + G1.getPanjang());
        System.out.println("Gradien G1 = " + G1.getGradien());

        /************** TITIK TENGAH **************/

        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik Tengah G1 = ");
        tengah.printTitik();

        /************** RELASI ANTAR GARIS **************/

        System.out.println("G1 sejajar G2 = "
                + G1.isSejajar(G2));

        System.out.println("G1 tegak lurus G2 = "
                + G1.isTegakLurus(G2));

        /************** PERSAMAAN GARIS **************/

        System.out.println("Persamaan G1 : "
                + G1.getPersamaanGaris());

        /************** COUNTER **************/

        System.out.println("Jumlah Objek Garis = "
                + Garis.getCounterGaris());
    }
}