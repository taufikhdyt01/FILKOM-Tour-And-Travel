package MainProgram;
import ManajemenKaryawan.Karyawan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    public static void main(String[] args) {
        new Home();
        new MasukPemesan();
        new MasukKaryawan();
        new DashboardKaryawan();
        new TambahKaryawan();
        new TambahMobil();
        new DashboardPemesanan();
        new PemesananTravel();
        new PemesananRentCar();
        new PilihKendaraan();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
