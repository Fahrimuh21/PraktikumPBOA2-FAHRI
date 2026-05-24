/* Nama File : Persegi.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class Persegi extends BangunDatar{
    /* Variabel untuk menyimpan panjang sisi persegi */
    private double sisi;

    /* 
     * Constructor: Persegi()
     * Deskripsi   : Membuat object Persegi dengan nilai default
     * Parameter   : -
     * Return      : -
     */
    public Persegi(){
        sisi=0.0;
    }
    
    /* 
     * Constructor: Persegi(double sisi, String warna, String border)
     * Deskripsi   : Membuat object Persegi dengan parameter yang diberikan
     * Parameter   : sisi (double), warna (String), border (String)
     * Return      : -
     */
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi=sisi;
    }

    /* 
     * Method      : setPersegi(double sisi, String warna, String border)
     * Deskripsi   : Mengeset semua atribut persegi
     * Parameter   : sisi (double), warna (String), border (String)
     * Return      : -
     */
    public void setPersegi(double sisi, String warna, String border){
        this.sisi = sisi;
        this.setWarna(warna);
        this.setBorder(border);
    }
    
    /* 
     * Method      : getSisi()
     * Deskripsi   : Mengembalikan nilai sisi
     * Parameter   : -
     * Return      : double (sisi persegi)
     */
    public double getSisi(){
        return sisi;
    }
    
    /* 
     * Method      : setSisi(double sisi)
     * Deskripsi   : Mengeset sisi persegi
     * Parameter   : sisi (double)
     * Return      : -
     */
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    /* 
     * Method      : getLuas()
     * Deskripsi   : Menghitung dan mengembalikan luas persegi
     * Parameter   : -
     * Return      : double (luas persegi)
     */
    public double getLuas(){
        return sisi*sisi;
    }
    
    /* 
     * Method      : getKeliling()
     * Deskripsi   : Menghitung dan mengembalikan keliling persegi
     * Parameter   : -
     * Return      : double (keliling persegi)
     */
    public double getKeliling(){
        return 4*sisi;
    }
    
    /* 
     * Method      : getDiagonal()
     * Deskripsi   : Menghitung dan mengembalikan diagonal persegi
     * Parameter   : -
     * Return      : double (diagonal persegi)
     */
    public double getDiagonal(){
        return Math.sqrt(sisi*sisi);
    }
    
    /* 
     * Method      : printInfo()
     * Deskripsi   : Mencetak informasi persegi (override dari BangunDatar)
     * Parameter   : -
     * Return      : -
     */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("sisi : " + sisi);
    }
}