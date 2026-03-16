public class BangunDatar {
    /*===== ATRIBUT ======*/
    private int jmlSisi;
    private String warna;
    private String border;


    /*===== METHOD =======*/
    public BangunDatar(){
        jmlSisi=0;
        warna="";
        border="";
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna =warna;
        this.border = border;
    }
    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }   

    public void setBorder(String border){
        this.border = border;
    }

    public String getWarna(){
        return warna;
    }
    public void printInfo(){
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}
