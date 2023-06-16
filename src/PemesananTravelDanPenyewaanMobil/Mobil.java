package PemesananTravelDanPenyewaanMobil;

public class Mobil {
    private String noPlat;
    private String merk;
    private String warna;
    private String tahunKeluaran;

    public Mobil(String noPlat, String merk, String warna, String tahunKeluaran) {
        setNoPlat(noPlat);
        setMerk(merk);
        setWarna(warna);
        setTahunKeluaran(tahunKeluaran);
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public String getTahunKeluaran() {
        return tahunKeluaran;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahunKeluaran(String tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public void cetakInfoMobil() {
        System.out.println("Kategori Mobil\t: " +getClass().getSimpleName());
        System.out.println("No. Plat\t\t: " +getNoPlat());
        System.out.println("Merk\t\t: " +getMerk());
        System.out.println("Warna\t\t: " +getWarna());
        System.out.println("Tahun Keluaran\t: " +getTahunKeluaran());
    }

}
