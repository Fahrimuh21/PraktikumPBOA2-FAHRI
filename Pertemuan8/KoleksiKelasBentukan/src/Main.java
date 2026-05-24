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
            new Anabul("Kucing", "Kitty"),
            new Anabul("Anjing", "Doggy")
        };
        OperatorGenerik.tukar(hewan);
        System.out.println("Anabul: " + hewan[0] + " " + hewan[1]);

        Anggora k1 = new Anggora("Anggora1", 4);
        Persia k2 = new Persia("Persia1", 5);

        int total = OperatorGenerik.bobot2(k1, k2);
        System.out.println("Total bobot: " + total);

        Piaraan piaraan = new Piaraan();

        Kucing kucing1 = new Kucing("Milo", 4);
        Kucing kucing2 = new Kucing("Luna", 3);
        Anabul anjing = new Anabul("Buddy", "Dog");

        piaraan.enqueueAnabul((Anabul) kucing1);
        piaraan.enqueueAnabul((Anabul) kucing2);
        piaraan.enqueueAnabul(anjing);

        System.out.println("Jumlah anabul: " + piaraan.getNbelm());
        System.out.println("Apakah Luna ada di antrean? " + piaraan.isMember(kucing2));

        System.out.println("Anabul pertama: " + piaraan.getAnabul().getNama());
        System.out.println("Mengeluarkan anabul pertama: " + piaraan.dequeueAnabul().getNama());

        System.out.println("Nama-nama anabul:");
        piaraan.showAnabul();

        System.out.println("Jumlah kucing: " + piaraan.countKucing());
        System.out.println("Total bobot kucing: " + piaraan.bobotKucing());

        System.out.println("Jenis-jenis anabul:");
        piaraan.showJenisAnabul();
    }
}