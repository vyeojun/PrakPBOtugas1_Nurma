/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author HP
 */
// Kelas RekeningBank yang merupakan turunan dari AkunBank
class RekeningBank extends AkunBank implements bisaTransaksi {
    float saldo;

    public RekeningBank(String namaPemilik, String nomorRekening, String jenisAkun, float saldoAwal) {
        super(namaPemilik, nomorRekening, jenisAkun);
        this.saldo = saldoAwal;
    }

    @Override
    void setorTunai(float jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp " + jumlah + ". Saldo sekarang: Rp " + saldo);
    }

    @Override
    void tarikTunai(float jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp " + jumlah + ". Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println(namaPemilik + " gagal menarik uang! Saldo tidak mencukupi.");
        }
    }

    @Override
    void periksaSaldo() {
        System.out.println(namaPemilik + " memiliki saldo Rp " + saldo);
    }

    @Override
    public void transaksi() {
        System.out.println(namaPemilik + " melakukan transaksi utama: Pembayaran Tagihan.");
        saldo -= 100000; // pembayaran tagihan
    }

    @Override
    void tampilkanInfoAkun() {
        System.out.println("\n+------+ Info Akun Bank +------+");
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Jenis Akun    : " + jenisAkun);
        System.out.println("Saldo         : Rp " + saldo);
        System.out.println("+-------------------------------+\n");
    }
}