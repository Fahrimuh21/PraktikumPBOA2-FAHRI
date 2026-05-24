/* Nama File : Datum.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas generik Datum yang dapat menyimpan nilai dari berbagai tipe data, serta metode untuk mengakses dan mengubah nilai tersebut.

public class Datum<T> {
    private T isi;
    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}