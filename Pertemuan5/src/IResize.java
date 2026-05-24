/* Nama File : IResize.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

public interface IResize {
    //menambah ukuran sebesar 10%
    public void zoomIn();

    //mengurangi ukuran sebesar 10%
    public void zoomOut();

    //menambah ukuran sebesar persentase tertentu
    public void zoom(int percent);
}
