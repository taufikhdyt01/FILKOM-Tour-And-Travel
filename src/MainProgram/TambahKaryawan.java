/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainProgram;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class TambahKaryawan implements ActionListener{
    
    TambahKaryawan(){
        initComponents();
    }
    
    public void initComponents(){
        //CONTAINER
        JFrame tambah = new JFrame("Filkom Tour And Travel");
        tambah.setSize(480, 800);
        tambah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tambah.setLocationRelativeTo(null);
        tambah.setLayout(null);

        //COMPONENT
        JLabel labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MainProgram/logo.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        labelLogo.setBounds(120, 0, 250, 250);
        tambah.add(labelLogo);
        
        JLabel labelJudul = new JLabel("Tambah Karyawan");
        labelJudul.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelJudul.setBounds(180, 220, 500, 20);
        tambah.add(labelJudul);
        
        JLabel labelNama = new JLabel("Nama Karyawan");
        labelNama.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelNama.setBounds(40, 260, 500, 20);
        tambah.add(labelNama);
        JTextField txtNama = new JTextField();
        txtNama.setBounds(200, 260, 220, 30);
        tambah.add(txtNama);
        
        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelAlamat.setBounds(40, 300, 500, 20);
        tambah.add(labelAlamat);
        JTextField txtAlamat = new JTextField();
        txtAlamat.setBounds(200, 300, 220, 30);
        tambah.add(txtAlamat);
        
        JLabel labelTelp = new JLabel("No. Telepon");
        labelTelp.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelTelp.setBounds(40, 340, 500, 20);
        tambah.add(labelTelp);
        JTextField txtTelp = new JTextField();
        txtTelp.setBounds(200, 340, 220, 30);
        tambah.add(txtTelp);
        
        JLabel labelKelamin = new JLabel ("Jenis Kelamin");
        labelKelamin.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKelamin.setBounds(40, 380, 500, 20);
        tambah.add(labelKelamin);
        JRadioButton laki = new JRadioButton ();
        laki.setText("Laki-Laki");
        laki.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        laki.setBounds(200, 380, 100, 20);
        JRadioButton perempuan = new JRadioButton ();
        perempuan.setText("Perempuan");
        perempuan.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        perempuan.setBounds(300, 380, 150, 20);
        tambah.add(laki);
        tambah.add(perempuan);
        ButtonGroup groupJenisKelamin = new ButtonGroup();
        groupJenisKelamin.add(laki);
        groupJenisKelamin.add(perempuan);
        
        JLabel labelKategori = new JLabel ("Kategori");
        labelKategori.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKategori.setBounds(40, 420, 500, 20);
        tambah.add(labelKategori);
        String[] kategori = {"Supir Travel", "Supir RentCar", "Admin"};
        JComboBox boxKategori = new JComboBox(kategori);
        boxKategori.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxKategori.setBounds(200, 420, 160, 30);
        tambah.add(boxKategori);
        JButton ok = new JButton("V");
        ok.setBounds(370, 420, 50, 30);
        tambah.add(ok);
        /*
        //IF SUPIR TRAVEL
        JLabel labelRute = new JLabel ("Rute Perjalanan");
        labelRute.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelRute.setBounds(40, 460, 500, 20);
        tambah.add(labelRute);
        String[] rute = {"Surabaya - Malang", "Madura - Malang", "Banyuwangi – Malang", "Situbondo – Malang", "Tulungagung – Malang"};
        JComboBox boxRute = new JComboBox(rute);
        boxRute.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxRute.setBounds(200, 460, 225, 30);
        tambah.add(boxRute);
        
        //IF SUPIR RENTCAR
        JLabel labelDurasi = new JLabel ("Durasi Kerja");
        labelDurasi.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelDurasi.setBounds(40, 460, 500, 20);
        tambah.add(labelDurasi);
        String[] durasi = {"1 Hari", "2 Hari", "3 Hari"};
        JComboBox boxDurasi = new JComboBox(durasi);
        boxDurasi.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxDurasi.setBounds(200, 460, 225, 30);
        tambah.add(boxDurasi);
        
        //IF ADMIN
        JLabel labelShift = new JLabel ("Shift Kerja");
        labelShift.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelShift.setBounds(40, 460, 500, 20);
        tambah.add(labelShift);
        String[] shift = {"Pagi", "Siang", "Malam"};
        JComboBox boxShift = new JComboBox(shift);
        boxShift.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxShift.setBounds(200, 460, 225, 30);
        tambah.add(boxShift);
        */
        
        JButton simpan = new JButton("SIMPAN");
        simpan.setBounds(320, 540, 100, 30);
        tambah.add(simpan);
        
        
        JButton back = new JButton("");
        back.setBounds(20, 10, 50, 30);
        tambah.add(back);
        
        tambah.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
