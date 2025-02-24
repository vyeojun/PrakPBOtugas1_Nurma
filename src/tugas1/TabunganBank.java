/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author HP
 */
// Kelas TabunganBank turunan dari AkunBank
class TabunganBank extends AkunBank implements bisaTransaksi {
    float saldo;
    float bunga;

    public TabunganBank(String namaPemilik, String nomorRekening, String jenisAkun, float saldoAwal, float bunga) {
        super(namaPemilik, nomorRekening, jenisAkun);
        this.saldo = saldoAwal;
        this.bunga = bunga;
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
        System.out.println(namaPemilik + " melakukan transaksi utama: Transfer Dana.");
        saldo -= 200000; // Simulasi transfer uang
    }

    @Override
    void tampilkanInfoAkun() {
        System.out.println("\n+------+ Info Akun Bank +------+");
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Jenis Akun    : " + jenisAkun);
        System.out.println("Saldo         : Rp " + saldo);
        System.out.println("Bunga         : " + bunga + "%");
        System.out.println("--------------------------------\n");
    }
}
