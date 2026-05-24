/* Nama File : Pengusaha.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

import java.time.LocalDate;
import java.time.Period;


public class Pengusaha extends Manusia implements Pajak {
    private String namaPerusahaan;
    public static int counterPengusaha;

    public Pengusaha(){
        super();
        namaPerusahaan="";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String namaPerusahaan){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.namaPerusahaan = namaPerusahaan;
        counterPengusaha++;
    }

    public String getNamaPerusahaan(){
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(getTgl_mulai_kerja(), sekarang);
        return period.getYears();
    }

    @Override
    public double hitungPajak() {
        // Misalnya, pajak yang harus dibayar adalah 15% dari pendapatan
        return getPendapatan() * 0.15;
    }
}
