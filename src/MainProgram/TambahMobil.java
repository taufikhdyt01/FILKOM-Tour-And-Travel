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
public class TambahMobil implements ActionListener{
    
    TambahMobil(){
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
        
        JLabel labelJudul = new JLabel("Tambah Mobil");
        labelJudul.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelJudul.setBounds(180, 220, 500, 20);
        tambah.add(labelJudul);
        
        JLabel labelPlat = new JLabel("Nomor Plat");
        labelPlat.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelPlat.setBounds(40, 260, 500, 20);
        tambah.add(labelPlat);
        JTextField txtPlat = new JTextField();
        txtPlat.setBounds(200, 260, 220, 30);
        tambah.add(txtPlat);
        
        JLabel labelMerk = new JLabel("Merk");
        labelMerk.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelMerk.setBounds(40, 300, 500, 20);
        tambah.add(labelMerk);
        JTextField txtMerk = new JTextField();
        txtMerk.setBounds(200, 300, 220, 30);
        tambah.add(txtMerk);
        
        JLabel labeWarna = new JLabel("Warna");
        labeWarna.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labeWarna.setBounds(40, 340, 500, 20);
        tambah.add(labeWarna);
        JTextField txtWarna = new JTextField();
        txtWarna.setBounds(200, 340, 220, 30);
        tambah.add(txtWarna);
        
        JLabel labelKeluaran = new JLabel ("Tahun Keluaran");
        labelKeluaran.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKeluaran.setBounds(40, 380, 500, 20);
        tambah.add(labelKeluaran);
        JRadioButton laki = new JRadioButton ();
        JTextField txtKeluaran = new JTextField();
        txtKeluaran.setBounds(200, 380, 220, 30);
        tambah.add(txtKeluaran);
        
        JLabel labelKategori = new JLabel ("Kategori");
        labelKategori.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKategori.setBounds(40, 420, 500, 20);
        tambah.add(labelKategori);
        String[] kategori = {"Mobil Pribadi", "Bus", "Mini Bus"};
        JComboBox boxKategori = new JComboBox(kategori);
        boxKategori.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxKategori.setBounds(200, 420, 165, 30);
        tambah.add(boxKategori);
        JButton ok = new JButton("V");
        ok.setBounds(370, 420, 50, 30);
        tambah.add(ok);
        /*
        //IF MOBIL PRIIBADI
        JLabel labelSeat = new JLabel("Jumlah Seat");
        labelSeat.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelSeat.setBounds(40, 460, 500, 20);
        tambah.add(labelSeat);
        String[] seat = {"4 Penumpang", "6 Penumpang"};
        JComboBox boxSeat = new JComboBox(seat);
        boxSeat.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxSeat.setBounds(200, 460, 225, 30);
        tambah.add(boxSeat);
        
        //IF BUS
        JLabel labelKelas = new JLabel("Kelas Bus");
        labelKelas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKelas.setBounds(40, 460, 500, 20);
        tambah.add(labelKelas);
        String[] kelas = {"Ekonomi", "Bisnis", "Eksekutif"};
        JComboBox boxKelas = new JComboBox(kelas);
        boxKelas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxKelas.setBounds(200, 460, 225, 30);
        tambah.add(boxKelas);
        
        //IF MINIBUS
        JLabel labelKapasitas = new JLabel("Kapasitas");
        labelKapasitas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKapasitas.setBounds(40, 460, 500, 20);
        tambah.add(labelKapasitas);
        String[] kapasitas = {"20 Penumpang", "30 Penumpang"};
        JComboBox boxKapasitas = new JComboBox(kapasitas);
        boxKapasitas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxKapasitas.setBounds(200, 460, 225, 30);
        tambah.add(boxKapasitas);
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
