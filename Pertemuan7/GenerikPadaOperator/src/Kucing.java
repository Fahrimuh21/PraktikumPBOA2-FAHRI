//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas Kucing dengan atribut bobot, serta metode untuk mengakses bobot tersebut. Kelas ini akan menjadi kelas induk untuk kelas Anggora dan KembangTelon dalam konteks generik pada operator.

public class Kucing {
    protected int bobot;
    public Kucing(int bobot) {
        this.bobot = bobot;
    }
    public int getBobot() {
        return bobot;
    }
}