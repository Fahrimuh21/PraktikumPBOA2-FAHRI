//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat kelas OperatorGenerik yang memiliki metode generik untuk menukar elemen dalam array dan menghitung bobot total dari dua objek Kucing, serta menguji metode ini dengan berbagai tipe data dan objek Kucing.

public class OperatorGenerik {
    public static <T> void tukar(T[] arr) {
        T temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static <T extends Kucing> int bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}
