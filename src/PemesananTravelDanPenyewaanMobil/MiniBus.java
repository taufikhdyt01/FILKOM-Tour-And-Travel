package PemesananTravelDanPenyewaanMobil;

public class MiniBus extends Mobil implements CetakInfoMobil {
    private String kapasitas;

    public MiniBus(String noPlat, String merk, String warna, String tahunKeluaran, String kapasitas){
        super(noPlat, merk, warna, tahunKeluaran);
        setKapasitas(kapasitas);
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    @Override
    public void cetakInfoMobil() {
        super.cetakInfoMobil();
        System.out.println("Kapasitas\t: " +getKapasitas());
    }

}
