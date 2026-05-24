/* Nama File : Manusia.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int countMns;

    public Manusia(){
        nama="";
        tgl_mulai_kerja=null;
        alamat="";
        pendapatan=0.0;
        countMns++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        countMns++;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public static int getCountMns(){
        return countMns;
    }

    public void cetakInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }

    public abstract int hitungMasaKerja();

}