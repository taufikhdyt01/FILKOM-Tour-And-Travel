package ManajemenKaryawan;

import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Karyawan {
    private String nama;
    private String alamat;
    private String noTelp;
    private boolean jenisKelamin;

    public Karyawan(String nama, String alamat, String noTelp, boolean jenisKelamin) {
        setNama(nama);
        setAlamat(alamat);
        setNoTelp(noTelp);
        setJenisKelamin(jenisKelamin);
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void cetakInfo() {
        System.out.println("Karyawan\t\t: " +getClass().getSimpleName());
        System.out.println("Nama\t\t: " +getNama());
        System.out.println("Alamat\t\t: " +getAlamat());
        System.out.println("No. Telp\t\t: " +getNoTelp());
        System.out.println("Jenis Kelamin:" +(isJenisKelamin()? "Laki-Laki" : "Perempuan"));
    }

}
