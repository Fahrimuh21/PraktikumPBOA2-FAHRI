/* Nama File : Kucing.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas Kucing dengan atribut bobot, serta metode untuk mengakses bobot tersebut. Kelas ini akan menjadi kelas induk untuk kelas Anggora dan KembangTelon dalam konteks generik pada operator.

public class Kucing extends Anabul {
    protected int bobot;
    private String nama;

    public void Kucing() {
        this.nama = "Default";
        this.bobot = 0;
    }

    public Kucing(String nama, int bobot) {
        this.nama = nama;
        this.bobot = bobot;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBobot() {
        return bobot;
    }
}