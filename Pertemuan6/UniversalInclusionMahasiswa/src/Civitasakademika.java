//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat class Civitasakademika sebagai kelas dasar untuk berbagai jenis civitas akademika dengan atribut nama dan method getNama serta getNomor. 
// Method getNomor akan dioverride pada subclass untuk memberikan nomor identitas yang spesifik sesuai dengan jenis civitas akademika, seperti NIM untuk mahasiswa, NIP untuk dosen, dan NIK untuk tendik.


public class Civitasakademika {
    protected String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // akan dioverride
    public String getNomor() {
        return "-";
    }
}