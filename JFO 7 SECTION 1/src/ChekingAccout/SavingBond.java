package ChekingAccout;

public class SavingBond {
    private double jumlahPinjaman;
    private int jangkaWaktu;
    private double tingkatBunga;

    public SavingBond(double jumlahPinjaman, int jangkaWaktu) {
        this.jumlahPinjaman = jumlahPinjaman;
        this.jangkaWaktu = jangkaWaktu;
        setTingkatBunga();
    }

    private void setTingkatBunga() {
        if (jangkaWaktu >= 0 && jangkaWaktu <= 11) {
            tingkatBunga = 0.005;
        } else if (jangkaWaktu >= 12 && jangkaWaktu <= 23) {
            tingkatBunga = 0.01;
        } else if (jangkaWaktu >= 24 && jangkaWaktu <= 35) {
            tingkatBunga = 0.015;
        } else if (jangkaWaktu >= 36 && jangkaWaktu <= 47) {
            tingkatBunga = 0.02;
        } else if (jangkaWaktu >= 48 && jangkaWaktu <= 60) {
            tingkatBunga = 0.025;
        } else {
            System.out.println("Jangka waktu peminjaman tidak valid.");
        }
    }

    public double hitungTotalPembayaran() {
        double totalPembayaran = jumlahPinjaman;
        for (int i = 0; i < jangkaWaktu; i++) {
            totalPembayaran += totalPembayaran * tingkatBunga;
        }
        return totalPembayaran;
    }

    public void cetakDetailPinjaman() {
        System.out.println("Jumlah Pinjaman: " + jumlahPinjaman);
        System.out.println("Jangka Waktu: " + jangkaWaktu + " bulan");
        System.out.println("Tingkat Bunga: " + (tingkatBunga * 100) + "% per bulan");
        System.out.println("Total Pembayaran: " + hitungTotalPembayaran());
    }
}