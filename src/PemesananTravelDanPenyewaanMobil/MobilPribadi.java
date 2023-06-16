package PemesananTravelDanPenyewaanMobil;

public class MobilPribadi extends Mobil implements CetakInfoMobil {
    private String seat;

    public MobilPribadi(String noPlat, String merk, String warna, String tahunKeluaran, String seat) {
        super(noPlat, merk, warna, tahunKeluaran);
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    @Override
    
    public void cetakInfoMobil() {
        super.cetakInfoMobil();
        System.out.println("Jumlah Seat\t: " +getSeat());
    }
}
