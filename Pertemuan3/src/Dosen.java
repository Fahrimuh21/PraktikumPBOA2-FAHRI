/* Nama File : Dosen.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class Dosen {
    /**********************ATRIBUT**********************/
    /* Variabel untuk menyimpan nomor induk pegawai dosen */
    private String nip;
    
    /* Variabel untuk menyimpan nama dosen */
    private String nama;
    
    /* Variabel untuk menyimpan prodi yang diampu */
    private String prodi;

    /* 
     * Constructor: Dosen()
     * Deskripsi   : Membuat object Dosen dengan nilai default
     * Parameter   : -
     * Return      : -
     */
    public Dosen() {
        nip = "#";
        nama = "#";
        prodi = "#";
    }

    /* 
     * Constructor: Dosen(String nip, String nama, String prodi)
     * Deskripsi   : Membuat object Dosen dengan parameter yang diberikan
     * Parameter   : nip (String), nama (String), prodi (String)
     * Return      : -
     */
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* 
     * Method      : getNIP()
     * Deskripsi   : Mengembalikan nilai NIP dosen
     * Parameter   : -
     * Return      : String (NIP dosen)
     */
    String getNIP() {
        return nip;
    }

    /* 
     * Method      : getNama()
     * Deskripsi   : Mengembalikan nama dosen
     * Parameter   : -
     * Return      : String (nama dosen)
     */
    String getNama() {
        return nama;
    }

    /* 
     * Method      : getProdi()
     * Deskripsi   : Mengembalikan prodi yang diampu dosen
     * Parameter   : -
     * Return      : String (prodi)
     */
    String getProdi() {
        return prodi;
    }

    /* 
     * Method      : setNIP(String newNip)
     * Deskripsi   : Mengeset nilai NIP dosen
     * Parameter   : newNip (String)
     * Return      : -
     */
    public void setNIP(String newNip) {
        nip = newNip;
    }

    /* 
     * Method      : setNama(String newNama)
     * Deskripsi   : Mengeset nama dosen
     * Parameter   : newNama (String)
     * Return      : -
     */
    public void setNama(String newNama) {
        nama = newNama;
    }

    /* 
     * Method      : setProdi(String newProdi)
     * Deskripsi   : Mengeset prodi yang diampu dosen
     * Parameter   : newProdi (String)
     * Return      : -
     */
    public void setProdi(String newProdi) {
        prodi = newProdi;
    }
}