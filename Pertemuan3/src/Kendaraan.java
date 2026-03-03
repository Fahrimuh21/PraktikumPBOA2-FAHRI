public class Kendaraan {
    //===== ATRIBUT =====//
    private String noPlat;
    private String jenis;

    //===== METHOD =====//
    
    // Konstruktor tanpa parameter dan menginisialisasi atribut dengan nilai default
    Kendaraan() {
        noPlat = "#";
        jenis = "#";
    }

    // Konstruktor dengan parameter dan menginisialisasi atribut dengan nilai yang diberikan
    Kendaraan(String newNoPlat, String newJenis) {
        noPlat = newNoPlat;
        jenis = newJenis;
    }

    // Mengembalikan nilai noPlat untuk kendaraan
    String getNoPlat() {
        return noPlat;
    }

    // Mengembalikan nilai jenis untuk kendaraan
    String getJenis() {
        return jenis;
    }

    // Mengatur nilai noPlat untuk kendaraan
    public void setNoPlat(String newNoPlat) {
        noPlat = newNoPlat;
    }

    // Mengatur nilai jenis untuk kendaraan
    public void setJenis(String newJenis) {
        jenis = newJenis;
    }
}