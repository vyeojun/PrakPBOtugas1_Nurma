/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author HP
 */
    // Kelas KreditBank sebagai turunan dari AkunBank
class KreditBank extends AkunBank implements bisaTransaksi {
    float saldo;
    float limitKredit;
    float bungaKredit;

    public KreditBank(String namaPemilik, String nomorRekening, String jenisAkun, float saldoAwal, float limitKredit, float bungaKredit) {
        super(namaPemilik, nomorRekening, jenisAkun);
        this.saldo = saldoAwal;
        this.limitKredit = limitKredit;
        this.bungaKredit = bungaKredit;
    }

    @Override
    void setorTunai(float jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp " + jumlah + ". Saldo sekarang: Rp " + saldo);
    }

    @Override
    void tarikTunai(float jumlah) {
        if (saldo + limitKredit >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp " + jumlah + ". Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println(namaPemilik + " gagal menarik uang! Saldo dan limit kredit tidak mencukupi.");
        }
    }

    @Override
    void periksaSaldo() {
        System.out.println(namaPemilik + " memiliki saldo Rp " + saldo + " dengan limit kredit Rp " + limitKredit);
    }

    @Override
    public void transaksi() {
        System.out.println(namaPemilik + " menggunakan kartu kredit untuk pembayaran belanja.");
        saldo -= 300000; // penggunaan kredit
    }


    @Override
    void tampilkanInfoAkun() {
        System.out.println("\n+------+ Info Akun Bank +------+");
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Jenis Akun    : " + jenisAkun);
        System.out.println("Saldo         : Rp " + saldo);
        System.out.println("Limit Kredit  : Rp " + limitKredit);
        System.out.println("Bunga Kredit  : " + bungaKredit + "%");
        System.out.println("----------------------------------\n");
    }
}
