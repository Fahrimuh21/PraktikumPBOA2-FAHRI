//Nama : Muhammad Fahri
//NIM : 24060124120037
//Deskripsi : Membuat interface IResize untuk mengubah ukuran bangun datar

public interface IResize {
    //menambah ukuran sebesar 10%
    public void zoomIn();

    //mengurangi ukuran sebesar 10%
    public void zoomOut();

    //menambah ukuran sebesar persentase tertentu
    public void zoom(int percent);
}
