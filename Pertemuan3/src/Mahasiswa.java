import java.util.ArrayList;

public class Mahasiswa  {
    //===== ATRIBUT =====//
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //===== METHOD =====//
    
    // Konstruktor tanpa parameter dan menginisialisasi atribut dengan nilai default
    Mahasiswa() {
        nim = "#";
        nama = "#";
        prodi = "#";
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    // Konstruktor dengan parameter dan menginisialisasi atribut dengan nilai yang diberikan
    Mahasiswa(String newNim, String newNama, String newProdi) {
        nim = newNim;
        nama = newNama;
        prodi = newProdi;
        this.listMatkul = new ArrayList<>(); // Inisialisasi listMatkul sebagai ArrayList kosong
    }

    // Menghitung total SKS dari semua mata kuliah yang diambil oleh mahasiswa dan mengembalikan nilai total SKS
    int getJumlahSKS() {
        int total = 0;
        
        for (MataKuliah mataKuliah : listMatkul) {
            total = total + mataKuliah.getSks();
        }

        return total;
    }

    // Mengembalikan jumlah mata kuliah yang diambil oleh mahasiswa
    int getJumlahMatKul() {
        return listMatkul.size();
    }

    // Mengembalikan nilai nim untuk mahasiswa
    String getNim() {
        return nim;
    }

    // Mengembalikan nilai nama untuk mahasiswa
    String getNama() {
        return nama;
    }

    // Mengembalikan nilai prodi untuk mahasiswa
    String getProdi() {
        return prodi;
    }

    // Mengembalikan daftar mata kuliah yang diambil oleh mahasiswa
    ArrayList<MataKuliah> getListMatKul() {
        return listMatkul;
    }

    // Mengembalikan dosen wali untuk mahasiswa
    Dosen getDosen() {
        return dosenWali;
    }

    // Mengembalikan kendaraan yang digunakan oleh mahasiswa
    Kendaraan getKendaraan() {
        return kendaraan;
    }

    // Mengatur nilai nim untuk mahasiswa
    public void setNim(String newNim) {
        nim = newNim;
    }

    // Mengatur nilai nama untuk mahasiswa
    public void setNama(String newNama) {
        nama = newNama;
    }

    // Mengatur nilai prodi untuk mahasiswa
    public void setProdi(String newProdi) {
        prodi = newProdi;
    }

    // Mengatur dosen wali untuk mahasiswa
    public void setDosen(Dosen newDosen) {
        dosenWali = newDosen;
    }

    // Mengatur kendaraan yang digunakan oleh mahasiswa
    public void setKendaraan(Kendaraan newKendaraan) {
        kendaraan = newKendaraan;
    }
    
    // Menambahkan mata kuliah ke dalam list mata kuliah yang diambil oleh mahasiswa
    public void addMatKul (MataKuliah newMatKul) {
        listMatkul.add(newMatKul);
    }

    // Mencetak informasi singkat mahasiswa seperti NIM, nama, dan jumlah mata kuliah yang diambil
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah MatKul: " + getJumlahMatKul());
    }

    // Mencetak informasi lengkap mahasiswa termasuk NIM, nama, prodi, daftar mata kuliah yang diambil, dosen wali, dan kendaraan yang digunakan
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar mata kuliah: ");
        for (MataKuliah mataKuliah : listMatkul) {
            System.out.println(mataKuliah.getNamaMatKul());
        }
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis());
    }
    
}