public class TicketMachine {
    private TiketBus tiket;
    private int saldo;
    private Pembeli pembeli;

    public TicketMachine() {
        this.saldo = 0;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
        System.out.println("Informasi telah tersimpan:");
        System.out.println("Nama: " + pembeli.getNama());
        System.out.println("NIK: " + pembeli.getNik());
    }

    public void pilihTiket(TiketBus tiket) {
        this.tiket = tiket;
        System.out.println("Anda telah memilih: " + tiket.getDetail() + " dengan harga " + tiket.getHarga() + " rupiah.");
    }

    public void bayar(int jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Anda telah memasukkan " + jumlah + " rupiah. Saldo saat ini: " + this.saldo);
        } else {
            System.out.println("Mohon masukkan jumlah pembayaran yang sesuai.");
        }
    }

    public void printTiket() {
        if (this.tiket == null) {
            System.out.println("Anda belum memilih tiket.");
            return;
        }

        if (this.saldo >= this.tiket.getHarga()) {
            this.saldo -= this.tiket.getHarga();
            System.out.println("Tiket untuk " + pembeli.getNama() + " (" + pembeli.getNik() + ") telah dicetak.");
            System.out.println("Sisa saldo: " + this.saldo);
        } else {
            int kekurangan = this.tiket.getHarga() - this.saldo;
            System.out.println("Pembayaran tidak cukup. Anda kekurangan " + kekurangan + " rupiah.");
        }
    }

    public int getSaldo() {
        return this.saldo;
    }
}
