//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat class Lingkaran dengan inherit BangunDatar dan implement IResize


public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran(){
        jari=0.0;
        
    }
    public Lingkaran(double jari, String Warna, String warna, String border){
        this.jari = jari;
        this.setWarna(Warna);
        this.setBorder(border);
    }
    public double getJari(){
        return jari;
    }
    public void setJari(double jari){
        this.jari = jari;
    }
    public double getLuas(){
        return Math.PI * jari * jari;
    }
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }
    public double Diagonal(){
        return 2*jari;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }

    @Override
    public void zoomIn() { 
        jari *= 1.1; // Menambah ukuran sebesar 10%
    }

    @Override
    public void zoomOut() {
        jari *= 0.9; // Mengurangi ukuran sebesar 10%
    }

    @Override
    public void zoom(int percent) {
        jari *= (1 + percent / 100.0); 
        // Menambah ukuran sebesar persentase tertentu
    }

}

