/* Nama File : Main.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat dan belajar tentang konversi tipe data dan parsing

public class Main {
    public static void main(String[] args) {

        // ====== INTEGER ======
        Data<Integer> dataInt = new Data<>();
        dataInt.setIsi(1, 10);
        dataInt.setIsi(2, 20);

        System.out.println("Isi ke-1: " + dataInt.getIsi(1));
        System.out.println("Size: " + dataInt.getSize());

        // ====== STRING ======
        Data<String> dataStr = new Data<>();
        dataStr.setIsi(1, "Halo");
        dataStr.setIsi(2, "Dunia");

        System.out.println("Isi ke-2: " + dataStr.getIsi(2));
        System.out.println("Size: " + dataStr.getSize());

        // ====== ANABUL ======
        Data<Anabul> dataHewan = new Data<>();
        dataHewan.setIsi(1, new Anabul("Kucing"));
        dataHewan.setIsi(2, new Anabul("Anjing"));

        System.out.println("Isi ke-1: " + dataHewan.getIsi(1));
        System.out.println("Isi ke-2: " + dataHewan.getIsi(2));
        System.out.println("Size: " + dataHewan.getSize());
    }
}