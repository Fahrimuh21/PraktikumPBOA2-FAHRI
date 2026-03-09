
public class Lingkaran extends BangunDatar {
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

}

