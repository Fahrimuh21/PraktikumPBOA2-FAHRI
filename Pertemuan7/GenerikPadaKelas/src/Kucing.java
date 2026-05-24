/* Nama File : Kucing.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas Kucing dengan atribut nama dan bobot, serta metode untuk menampilkan informasi kucing.

public class Kucing {
    protected String nama;
    protected double bobot;

    public String getNama(){
        return this.nama;
    }

    public double getBobot(){
        return this.bobot;
    }

    public void setNama(String nama){
        this.nama = nama;
    } 

    public void setBobot(double bobot){
        this.bobot = bobot;
    }

    public Kucing(String nama, double bobot) {
        this.nama = nama;
        this.bobot = bobot;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Bobot: " + bobot + " kg");
    }
}