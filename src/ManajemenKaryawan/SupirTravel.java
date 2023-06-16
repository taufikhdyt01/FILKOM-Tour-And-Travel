package ManajemenKaryawan;

public class SupirTravel extends Karyawan implements CetakInfo {
    private String rute;
    private double biayaJasaPerRute;

    public SupirTravel(String nama, String alamat, String noTelp, boolean jenisKelamin, String rute) {
        super(nama, alamat, noTelp, jenisKelamin);
        setRute();
        setBiayaJasaPerRute();
    }


    public String getRute() {
        return rute;
    }

    public double getBiayaJasaPerRute() {
        return biayaJasaPerRute;
    }


    public void setRute() {
        this.rute = rute;
    }

    public void setBiayaJasaPerRute() {
        if (rute.equals("Surabaya - Malang")) {
            biayaJasaPerRute = 450000;
        } else if (rute.equals("Madura - Malang")) {
            biayaJasaPerRute = 550000;
        } else if (rute.equals("Banyuwangi – Malang")) {
            biayaJasaPerRute = 700000;
        } else if (rute.equals("Situbondo – Malang")) {
            biayaJasaPerRute = 650000;
        } else if (rute.equals("Tulungagung – Malang")) {
            biayaJasaPerRute = 300000;
        }
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Rute Perjalanan\t: " +getRute());
    }
}
