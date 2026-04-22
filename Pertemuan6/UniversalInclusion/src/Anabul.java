//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat class Anabul sebagai kelas dasar untuk berbagai jenis hewan peliharaan (Anabul = Anak Bulan) dengan atribut nama dan method gerak serta bersuara. Kelas ini akan menjadi parent class untuk kelas

public class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println("Anabul bergerak");
    }

    public void bersuara() {
        System.out.println("Anabul bersuara");
    }
}