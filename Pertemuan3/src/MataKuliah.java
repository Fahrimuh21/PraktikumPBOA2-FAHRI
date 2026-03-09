public class MataKuliah {
    //===== ATRIBUT =====//
    String idMatKul;
    String namaMatKul;
    int sks;

    //===== METHOD =====//
    
    // Konstruktor tanpa parameter dan menginisialisasi atribut dengan nilai default
    MataKuliah() {
        idMatKul = "#";
        namaMatKul = "#";
        sks = 0;
    }

    // Konstruktor dengan parameter dan menginisialisasi atribut dengan nilai yang diberikan
    MataKuliah(String newIdMatKul, String newNamaMatKul, int newSks) { 
        idMatKul = newIdMatKul;
        namaMatKul = newNamaMatKul;
        sks = newSks;
    }

    // Mengembalikan nilai idMatKul untuk mata kuliah
    String getIdMatKul() {
        return idMatKul;
    }

    // Mengembalikan nilai namaMatKul untuk mata kuliah
    String getNamaMatKul() {
        return namaMatKul;
    }

    // Mengembalikan nilai sks untuk mata kuliah
    int getSks() {
        return sks;
    }

    // Mengatur nilai idMatKul untuk mata kuliah
    public void setIdMatKul(String newIdMatKul) {
        idMatKul = newIdMatKul;
    }

    // Mengatur nilai namaMatKul untuk mata kuliah
    public void setNamaMatKul(String newNamaMatKul) {
        namaMatKul = newNamaMatKul;
    }

    // Mengatur nilai sks untuk mata kuliah
    public void setSks(int newSks) {
        sks = newSks;
    }
}