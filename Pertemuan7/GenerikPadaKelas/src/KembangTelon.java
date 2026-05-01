//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas KembangTelon yang merupakan turunan dari kelas Kucing, dengan metode tambahan untuk mengeluarkan suara khas KembangTelon.

public class KembangTelon extends Kucing {
    
    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    public void suara() {
        System.out.println(nama + " (KembangTelon): Meong keras!");
    }
}