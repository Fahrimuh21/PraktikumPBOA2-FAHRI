/* Nama File : BangunDatar.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class BangunDatar {
    /*===== ATRIBUT ======*/
    /* Variabel untuk menyimpan jumlah sisi dari bangun datar */
    private int jmlSisi;
    
    /* Variabel untuk menyimpan warna dari bangun datar */
    private String warna;
    
    /* Variabel untuk menyimpan tipe border dari bangun datar */
    private String border;


    /*===== METHOD =======*/
    /* 
     * Constructor: BangunDatar()
     * Deskripsi   : Membuat object BangunDatar dengan nilai default
     * Parameter   : -
     * Return      : -
     */
    public BangunDatar(){
        jmlSisi=0;
        warna="";
        border="";
    }

    /* 
     * Constructor: BangunDatar(int jmlSisi, String warna, String border)
     * Deskripsi   : Membuat object BangunDatar dengan parameter yang diberikan
     * Parameter   : jmlSisi (int), warna (String), border (String)
     * Return      : -
     */
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna =warna;
        this.border = border;
    }
    /* 
     * Method      : getJmlSisi()
     * Deskripsi   : Mengembalikan jumlah sisi
     * Parameter   : -
     * Return      : int (jumlah sisi)
     */
    public int getJmlSisi(){
        return jmlSisi;
    }

    /* 
     * Method      : setJmlSisi(int jmlSisi)
     * Deskripsi   : Mengeset jumlah sisi
     * Parameter   : jmlSisi (int)
     * Return      : -
     */
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    /* 
     * Method      : setWarna(String warna)
     * Deskripsi   : Mengeset warna
     * Parameter   : warna (String)
     * Return      : -
     */
    public void setWarna(String warna){
        this.warna = warna;
    }

    /* 
     * Method      : getBorder()
     * Deskripsi   : Mengembalikan tipe border
     * Parameter   : -
     * Return      : String (tipe border)
     */
    public String getBorder(){
        return border;
    }   

    /* 
     * Method      : setBorder(String border)
     * Deskripsi   : Mengeset tipe border
     * Parameter   : border (String)
     * Return      : -
     */
    public void setBorder(String border){
        this.border = border;
    }

    /* 
     * Method      : getWarna()
     * Deskripsi   : Mengembalikan warna
     * Parameter   : -
     * Return      : String (warna)
     */
    public String getWarna(){
        return warna;
    }
    
    /* 
     * Method      : printInfo()
     * Deskripsi   : Mencetak informasi bangun datar
     * Parameter   : -
     * Return      : -
     */
    public void printInfo(){
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}
