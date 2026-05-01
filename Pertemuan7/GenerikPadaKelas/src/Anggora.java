//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas Anggora yang merupakan turunan dari kelas Kucing, dengan metode tambahan untuk mengeluarkan suara khas Anggora.

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }
    public void suara() {
        System.out.println(nama + " (Anggora): Meong lembut");
    }
}

