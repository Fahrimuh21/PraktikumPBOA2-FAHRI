/* Nama File : Lingkaran.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class Lingkaran extends BangunDatar {
    /* Variabel untuk menyimpan jari-jari lingkaran */
    private double jari;

    /* 
     * Constructor: Lingkaran()
     * Deskripsi   : Membuat object Lingkaran dengan nilai default
     * Parameter   : -
     * Return      : -
     */
    public Lingkaran(){
        jari=0.0;
        
    }
    
    /* 
     * Constructor: Lingkaran(double jari, String Warna, String warna, String border)
     * Deskripsi   : Membuat object Lingkaran dengan parameter yang diberikan
     * Parameter   : jari (double), Warna (String), warna (String), border (String)
     * Return      : -
     */
    public Lingkaran(double jari, String Warna, String warna, String border){
        this.jari = jari;
        this.setWarna(Warna);
        this.setBorder(border);
    }
    /* 
     * Method      : getJari()
     * Deskripsi   : Mengembalikan nilai jari-jari
     * Parameter   : -
     * Return      : double (jari-jari)
     */
    public double getJari(){
        return jari;
    }
    
    /* 
     * Method      : setJari(double jari)
     * Deskripsi   : Mengeset jari-jari lingkaran
     * Parameter   : jari (double)
     * Return      : -
     */
    public void setJari(double jari){
        this.jari = jari;
    }
    
    /* 
     * Method      : getLuas()
     * Deskripsi   : Menghitung dan mengembalikan luas lingkaran
     * Parameter   : -
     * Return      : double (luas lingkaran)
     */
    public double getLuas(){
        return Math.PI * jari * jari;
    }
    
    /* 
     * Method      : getKeliling()
     * Deskripsi   : Menghitung dan mengembalikan keliling lingkaran
     * Parameter   : -
     * Return      : double (keliling lingkaran)
     */
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }
    
    /* 
     * Method      : Diagonal()
     * Deskripsi   : Menghitung dan mengembalikan diagonal (diameter) lingkaran
     * Parameter   : -
     * Return      : double (diameter lingkaran)
     */
    public double Diagonal(){
        return 2*jari;
    }
    /* 
     * Method      : printInfo()
     * Deskripsi   : Mencetak informasi lingkaran (override dari BangunDatar)
     * Parameter   : -
     * Return      : -
     */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }

}

