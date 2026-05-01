//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : membuat kelas Data yang merupakan kelas generik untuk menyimpan dan mengelola data dalam bentuk larik. Kelas ini memiliki metode untuk mengatur isi larik, mengambil isi larik, dan menghitung jumlah elemen yang terisi dalam larik. Kelas ini digunakan untuk menyimpan berbagai tipe data, termasuk objek Anabul, dalam konteks larik generik.


public class Data<T> {

    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int posisi, T nilai) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("Posisi tidak valid!");
            return;
        }

        if (ruang[posisi - 1] == null) {
            banyak++;
        }

        ruang[posisi - 1] = nilai;
    }

    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("Posisi tidak valid!");
            return null;
        }
        return ruang[posisi - 1];
    }

    public int getSize() {
        return banyak;
    }
}