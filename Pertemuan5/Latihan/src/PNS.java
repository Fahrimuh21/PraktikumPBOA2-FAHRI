/* Nama File : PNS.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    public static int counterPNS;

    public PNS(){
        super();
        nip="";
        counterPNS++;
    }
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(getTgl_mulai_kerja(), sekarang);
        return period.getYears();
    }

    @Override
    public double hitungPajak() {
        // Misalnya, pajak yang harus dibayar adalah 10% dari gaji
        return getPendapatan() * 0.1;
    }
    
}
