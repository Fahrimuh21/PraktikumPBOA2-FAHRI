public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen() {

    }

    public String getFakultas() {
        return fakultas;
    }

    public Dosen(String nip, String nama, java.time.LocalDate tanggalLahir,java.time.LocalDate tmt, double gajiPokok, String fakultas) {
            super(nip, nama, tanggalLahir, tmt, gajiPokok);
            this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}