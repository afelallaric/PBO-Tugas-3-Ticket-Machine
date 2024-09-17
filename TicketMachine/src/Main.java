import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketMachine machine = new TicketMachine();

        System.out.println("Masukkan nama anda: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan NIK anda: ");
        String nik = scanner.nextLine();

        Pembeli pembeli = new Pembeli(nama, nik);
        machine.setPembeli(pembeli);

        System.out.println("Tiket yang bisa dibeli:");
        for (TiketBus ticket : TiketBus.values()) {
            System.out.println(ticket.ordinal() + 1 + ". " + ticket.getDetail() + " - harga: " + ticket.getHarga());
        }

        System.out.println("Silahkan memilih tiket yang ingin anda beli (1/2/3): ");
        int PemilihanTiket = scanner.nextInt();

        switch (PemilihanTiket) {
            case 1:
                machine.pilihTiket(TiketBus._1_JAM);
                break;
            case 2:
                machine.pilihTiket(TiketBus._6_JAM);
                break;
            case 3:
                machine.pilihTiket(TiketBus._16_JAM);
                break;
            default:
                System.out.println("Mohon memilih pilihan tiket dengan benar.");
                return;
        }

        System.out.println("Masukkan uang anda: ");
        int amount = scanner.nextInt();
        machine.bayar(amount);

        machine.printTiket();

        System.out.println("Kembalian: " + machine.getSaldo());
    }
}
