/* Nama File : Main.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        System.out.println("===== PNS =====");
        PNS pns1 = new PNS("Fahri", LocalDate.of(2020, 1, 1), "Jakarta", 5000000, "123456789s");
        pns1.cetakInfo();

        System.out.println("\n===== Pengusaha =====");
        Pengusaha pengusaha1 = new Pengusaha("Budi", LocalDate.of(2018, 3, 10), "Surabaya", 10000000, "PT XYZ");
        pengusaha1.cetakInfo();

        System.out.println("\n===== Petani =====");
        Petani petani1 = new Petani("Andi", LocalDate.of(2019, 6, 15), "Bandung", 3000000, "Padi");
        petani1.cetakInfo();

        System.out.println("\n===== Total Manusia =====");
        System.out.println("Total PNS : " + PNS.getCounterPNS());
        System.out.println("Total Pengusaha : " + Pengusaha.getCounterPengusaha());
        System.out.println("Total Petani : " + Petani.getCounterPetani());

        System.out.println("\n===== Masa Kerja =====");
        System.out.println("Masa Kerja PNS : " + pns1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja Pengusaha : " + pengusaha1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja Petani : " + petani1.hitungMasaKerja() + " tahun");

        System.out.println("\n===== Pajak yang harus dibayar =====");
        System.out.println("Pajak PNS : " + pns1.hitungPajak());
        System.out.println("Pajak Pengusaha : " + pengusaha1.hitungPajak());
        System.out.println("Pajak Petani : " + petani1.hitungPajak());


    }

}
    