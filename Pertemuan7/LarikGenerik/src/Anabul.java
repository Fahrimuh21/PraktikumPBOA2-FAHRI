//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : membuat kelas Anabul yang memiliki atribut nama dan metode toString untuk menampilkan nama anabul. Kelas ini digunakan dalam konteks larik generik untuk menyimpan objek Anabul.


public class Anabul {
    String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }
}