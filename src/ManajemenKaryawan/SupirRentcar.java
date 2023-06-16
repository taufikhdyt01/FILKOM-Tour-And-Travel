package ManajemenKaryawan;

public class SupirRentcar extends Karyawan implements CetakInfo {
    private String durasi;
    private double biayaJasaPerDurasi;

    public SupirRentcar(String nama, String alamat, String noTelp, boolean jenisKelamin, String durasi) {
        super(nama, alamat, noTelp, jenisKelamin);
        setDurasi(durasi);
        setBiayaJasaPerDurasi();
    }

    public String getDurasi() {
        return durasi;
    }

    public double getBiayaJasaPerDurasi() {
        return biayaJasaPerDurasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public void setBiayaJasaPerDurasi() {
        biayaJasaPerDurasi = Integer.parseInt(durasi) * 300000;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Durasi Kerja\t: " +getDurasi());
    }

}
