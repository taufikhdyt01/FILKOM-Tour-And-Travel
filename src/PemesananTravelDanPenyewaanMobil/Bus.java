package PemesananTravelDanPenyewaanMobil;

public class Bus extends Mobil implements CetakInfoMobil {
    private String kelas;

    public Bus(String noPlat, String merk, String warna, String tahunKeluaran, String kelas) {
        super(noPlat, merk, warna, tahunKeluaran);
        setKelas(kelas);
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    @Override
    public void cetakInfoMobil() {
        super.cetakInfoMobil();
        System.out.println("Kelas Bus\t: " +getKelas());
    }

}
