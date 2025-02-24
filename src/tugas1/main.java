/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("Numa", "123230229", "Giro", 5000000);
        TabunganBank tabungan1 = new TabunganBank("Buwana", "12323998", "Tabungan", 10000000, 3.5f);
        KreditBank kredit1 = new KreditBank("Driessen", "1232397110", "Kredit", 2000000, 5000000, 5.0f);

        rekening1.tampilkanInfoAkun();
        rekening1.setorTunai(500000);
        rekening1.tarikTunai(200000);
        rekening1.transaksi();
        rekening1.periksaSaldo();

        tabungan1.tampilkanInfoAkun();
        tabungan1.setorTunai(1000000);
        tabungan1.tarikTunai(500000);
        tabungan1.transaksi();
        tabungan1.periksaSaldo();

        kredit1.tampilkanInfoAkun();
        kredit1.setorTunai(1000000);
        kredit1.tarikTunai(3000000);
        kredit1.transaksi();
        kredit1.periksaSaldo();
    }
}
