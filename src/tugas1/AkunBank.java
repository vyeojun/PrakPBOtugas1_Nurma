/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author HP
 */
  // Kelas abstrak untuk Akun Bank
abstract class AkunBank {
    String namaPemilik;
    String nomorRekening;
    String jenisAkun;

    // Constructor
    public AkunBank(String namaPemilik, String nomorRekening, String jenisAkun) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.jenisAkun = jenisAkun;
    }

    // Method abstrak
    abstract void setorTunai(float jumlah);
    abstract void tarikTunai(float jumlah);
    abstract void periksaSaldo();

    // Menampilkan informasi akun
    void tampilkanInfoAkun() {
        System.out.println("\n+------+ Info Akun Bank +------+");
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Jenis Akun    : " + jenisAkun);
        System.out.println("--------------------------------\n");
    }
}
