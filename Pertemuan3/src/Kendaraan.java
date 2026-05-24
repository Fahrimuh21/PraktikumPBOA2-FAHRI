/* Nama File : Kendaraan.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class Kendaraan {
    /**********************ATRIBUT**********************/
    /* Variabel untuk menyimpan nomor plat kendaraan */
    private String noPlat;
    
    /* Variabel untuk menyimpan jenis kendaraan */
    private String jenis;

    /* 
     * Constructor: Kendaraan()
     * Deskripsi   : Membuat object Kendaraan dengan nilai default
     * Parameter   : -
     * Return      : -
     */
    Kendaraan() {
        noPlat = "#";
        jenis = "#";
    }

    /* 
     * Constructor: Kendaraan(String newNoPlat, String newJenis)
     * Deskripsi   : Membuat object Kendaraan dengan parameter yang diberikan
     * Parameter   : newNoPlat (String), newJenis (String)
     * Return      : -
     */
    Kendaraan(String newNoPlat, String newJenis) {
        noPlat = newNoPlat;
        jenis = newJenis;
    }

    /* 
     * Method      : getNoPlat()
     * Deskripsi   : Mengembalikan nomor plat kendaraan
     * Parameter   : -
     * Return      : String (nomor plat)
     */
    String getNoPlat() {
        return noPlat;
    }

    /* 
     * Method      : getJenis()
     * Deskripsi   : Mengembalikan jenis kendaraan
     * Parameter   : -
     * Return      : String (jenis kendaraan)
     */
    String getJenis() {
        return jenis;
    }

    /* 
     * Method      : setNoPlat(String newNoPlat)
     * Deskripsi   : Mengeset nomor plat kendaraan
     * Parameter   : newNoPlat (String)
     * Return      : -
     */
    public void setNoPlat(String newNoPlat) {
        noPlat = newNoPlat;
    }

    /* 
     * Method      : setJenis(String newJenis)
     * Deskripsi   : Mengeset jenis kendaraan
     * Parameter   : newJenis (String)
     * Return      : -
     */
    public void setJenis(String newJenis) {
        jenis = newJenis;
    }
}