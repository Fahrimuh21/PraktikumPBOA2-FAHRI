//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat class persegi dengan inherit BangunDatar


public class Persegi extends BangunDatar implements IResize {
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

    @Override
    public void zoomIn() {
        sisi *= 1.1; // Menambah ukuran sebesar 10%
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9; // Mengurangi ukuran sebesar 10%
    }

    @Override
    public void zoom(int percent) {
        sisi *= (1 + percent / 100.0); 
        // Menambah ukuran sebesar persentase tertentu
    }

}