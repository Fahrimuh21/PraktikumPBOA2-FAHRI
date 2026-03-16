//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat class persegi dengan inherit BangunDatar


public class Persegi extends BangunDatar{
    //ATRIBUT
    private double sisi;

    //METHOD
    public Persegi(){
        sisi=0.0;
    }
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi=sisi;
    }

    public void setPersegi(double sisi, String warna, String border){
        this.sisi = sisi;
        this.setWarna(warna);
        this.setBorder(border);
    }
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getLuas(){
        return sisi*sisi;
    }
    public double getKeliling(){
        return 4*sisi;
    }
    public double getDiagonal(){
        return Math.sqrt(sisi*sisi);
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("sisi : " + sisi);
    }
}