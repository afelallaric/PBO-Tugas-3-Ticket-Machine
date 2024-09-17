public enum TiketBus {
    _1_JAM(5000, "Tiket selama 1 jam"),
    _6_JAM(7000, "Tiket selama 6 jam"),
    _16_JAM(10000, "Tiket selama 16 jam");

    private final int harga;
    private final String detail;

    TiketBus(int harga, String detail) {
        this.harga = harga;
        this.detail = detail;
    }

    public int getHarga() {
        return harga;
    }

    public String getDetail() {
        return detail;
    }
}
