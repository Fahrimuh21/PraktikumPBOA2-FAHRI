public class Dosen {
    //===== ATRIBUT =====//
    private String nip;
    private String nama;
    private String prodi;

    //====== METHOD =====//   

    // Konstruktor tanpa parameter dan menginisialisasi atribut dengan nilai default
    public Dosen() {
        nip = "#";
        nama = "#";
        prodi = "#";
    }

    // Konstruktor dengan parameter untuk menginisialisasi atribut dengan nilai yang diberikan
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // mengembalikan nilai nip untuk dosen
    String getNIP() {
        return nip;
    }

    // mengembalikan nilai nama untuk dosen
    String getNama() {
        return nama;
    }

    // mengembalikan nilai prodi untuk dosen
    String getProdi() {
        return prodi;
    }

    // mengeset nilai nip untuk dosen
    public void setNIP(String newNip) {
        nip = newNip;
    }

    // mengeset nilai nama untuk dosen
    public void setNama(String newNama) {
        nama = newNama;
    }

    // mengeset nilai prodi untuk dosen
    public void setProdi(String newProdi) {
        prodi = newProdi;
    }
}