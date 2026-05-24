/* Nama File : Anjing.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi guk-guk");
    }
}