/* Nama File : Dosen.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat class Dosen sebagai subclass dari Civitasakademika dengan atribut NIP.



public class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }

    public String getNIP() {
        return NIP;
    }
}