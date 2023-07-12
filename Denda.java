public class Denda {
    private Peminjaman peminjaman;
    private int hariTerlambat;
    private static final int TARIF_DENDA = 10000;

    public Denda(Peminjaman peminjam, int hariTerlambat) {
        this.peminjam = peminjaman;
        this.hariTerlambat = hariTerlambat;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public int getTagihan() {
        return hariTerlambat * TARIF_DENDA;
    }
}