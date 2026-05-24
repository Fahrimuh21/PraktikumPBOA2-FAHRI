/* Nama File : Main.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi :  membuat kelas Main untuk menguji kelas Kucing, Anggora, KembangTelon, dan Datum dengan berbagai tipe data. Menampilkan informasi kucing dan menggunakan kelas generik Datum untuk menyimpan dan mengambil data.

public class Main {
    public static void main(String[] args) {
        Integer[] angka = {3, 6};
        OperatorGenerik.tukar(angka);
        System.out.println("Integer: " + angka[0] + " " + angka[1]);

        String[] teks = {"A", "B"};
        OperatorGenerik.tukar(teks);
        System.out.println("String: " + teks[0] + " " + teks[1]);

        Anabul[] hewan = {
            new Anabul("Kucing"),
            new Anabul("Anjing")
        };
        OperatorGenerik.tukar(hewan);
        System.out.println("Anabul: " + hewan[0] + " " + hewan[1]);

        Anggora k1 = new Anggora(4);
        Persia k2 = new Persia(5);

        int total = OperatorGenerik.bobot2(k1, k2);
        System.out.println("Total bobot: " + total);
    }
}