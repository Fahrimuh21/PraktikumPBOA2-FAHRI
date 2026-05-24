//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas Anabul yang memiliki atribut nama dan metode untuk menampilkan nama tersebut, serta menguji kelas ini dengan membuat objek Anabul dan menampilkan namanya.

public class Anabul {
    private String nama;
    private String panggilan;

    public Anabul() {
        this.nama = "Default";
        this.panggilan = "Default";
    }

    public Anabul(String nama, String panggilan) {
        this.nama = nama;
        this.panggilan = panggilan;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    @Override
    public String toString() {
        return nama;
    }
}