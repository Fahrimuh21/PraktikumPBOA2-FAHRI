//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : membuat kelas Main untuk menguji kelas Kucing, Anggora, KembangTelon, dan Datum dengan berbagai tipe data. Menampilkan informasi kucing dan menggunakan kelas generik Datum untuk menyimpan dan mengambil data.

public class Main {
    public static void main(String[] args) {

        // Membuat objek kucing
        Anggora kucing1 = new Anggora("Milo", 3.5);
        KembangTelon kucing2 = new KembangTelon("Oyen", 4.2);

        // Menampilkan info
        kucing1.tampilkanInfo();
        kucing1.suara();

        kucing2.tampilkanInfo();
        kucing2.suara();

        System.out.println("==== Generic Datum ====");

        // Generic dengan tipe Kucing
        Datum<Kucing> dataKucing = new Datum<>();
        dataKucing.setIsi(kucing1);

        Kucing hasil = dataKucing.getIsi();
        hasil.tampilkanInfo();

        // Generic dengan tipe lain (contoh String)
        Datum<String> dataString = new Datum<>();
        dataString.setIsi("Ini contoh generic String");

        System.out.println(dataString.getIsi());
    }
}