//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat class Petani dengan inherit Manusia dan implement Pajak

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String jenisTanaman;
    public static int counterPetani;

    public Petani(){
        super();
        jenisTanaman="";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String jenisTanaman){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.jenisTanaman = jenisTanaman;
        counterPetani++;
    }

    public String getJenisTanaman(){
        return jenisTanaman;
    }

    public void setJenisTanaman(String jenisTanaman){
        this.jenisTanaman = jenisTanaman;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(getTgl_mulai_kerja(), sekarang);
        return period.getYears();
    }
    
    @Override
    public double hitungPajak() {
        // Misalnya, pajak yang harus dibayar adalah 10% dari pendapatan
        return getPendapatan() * 0.10;
    }
    
}
