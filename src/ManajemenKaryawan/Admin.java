package ManajemenKaryawan;

public class Admin extends Karyawan implements CetakInfo {
    private String shift;


    public Admin(String nama, String alamat, String noTelp, boolean jenisKelamin, String shift) {
        super(nama, alamat, noTelp, jenisKelamin);
        setShift(shift);
    }

    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Shift Kerja\t: " +getShift());
    }

}
