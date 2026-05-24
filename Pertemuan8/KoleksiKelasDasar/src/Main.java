//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat Aplikasi teman

public class Main {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("Alice");
        teman.addNama("Bob");
        teman.addNama("Charlie");

        System.out.println("Daftar Teman:");
        teman.showTeman();
        System.out.println("\nApakah Bob adalah teman? " + teman.isMember("Bob"));

        teman.gantiNama("Charlie", "David");
        System.out.println("\nDaftar Teman setelah mengganti nama Charlie menjadi David:");
        teman.showTeman();

        teman.delNama("Alice");
        System.out.println("\nDaftar Teman setelah menghapus Alice:");
        teman.showTeman();

        System.out.println("\nJumlah nama Bob: " + teman.countNama("Bob"));
    }
}