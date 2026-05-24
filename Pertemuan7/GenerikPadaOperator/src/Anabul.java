/* Nama File : Anabul.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas Anabul yang memiliki atribut nama dan metode untuk menampilkan nama tersebut, serta menguji kelas ini dengan membuat objek Anabul dan menampilkan namanya.

public class Anabul {
    private String nama;
    public Anabul(String nama) {
        this.nama = nama;
    }
    @Override
    public String toString() {
        return nama;
    }
}