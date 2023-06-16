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
public class PilihKendaraan implements ActionListener{
    
    PilihKendaraan(){
        initComponents();
    }
    
    public void initComponents(){
         //CONTAINER
        JFrame pilih = new JFrame("Filkom Tour And Travel");
        pilih.setSize(480, 800);
        pilih.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pilih.setLocationRelativeTo(null);
        pilih.setLayout(null);

        //COMPONENT
        JLabel labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MainProgram/logo.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        labelLogo.setBounds(120, 0, 250, 250);
        pilih.add(labelLogo);
        
        JLabel labelJudul = new JLabel("Pilihan Kendaraan");
        labelJudul.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelJudul.setBounds(180, 220, 500, 20);
        pilih.add(labelJudul);
        
        JLabel labelNama = new JLabel("Jenis Mobil");
        labelNama.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelNama.setBounds(40, 260, 500, 20);
        pilih.add(labelNama);
        String[] kendaraan = {"Mobil Pribadi", "Bus", "Mini Bus"};
        JComboBox boxKendaraan = new JComboBox(kendaraan);
        boxKendaraan.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxKendaraan.setBounds(200, 260, 165, 30);
        pilih.add(boxKendaraan);
        JButton ok = new JButton("V");
        ok.setBounds(370, 260, 50, 30);
        pilih.add(ok);
        
        //IF MOBIL PRIBADI
        JLabel labelSeat = new JLabel("Jumlah Seat");
        labelSeat.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelSeat.setBounds(40, 300, 500, 20);
        pilih.add(labelSeat);
        String[] seat = {"4 Penumpang", "6 Penumpang"};
        JComboBox boxSeat = new JComboBox(seat);
        boxSeat.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxSeat.setBounds(200, 300, 165, 30);
        pilih.add(boxSeat);
        JButton ok2 = new JButton("V");
        ok2.setBounds(370, 300, 50, 30);
        pilih.add(ok2);
        /*
        //IF BUS
        JLabel labelKelas = new JLabel("Kelas Bus");
        labelKelas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKelas.setBounds(40, 300, 500, 20);
        pilih.add(labelKelas);
        String[] kelas = {"Ekonomi", "Bisnis", "Eksekutif"};
        JComboBox boxKelas = new JComboBox(kelas);
        boxKelas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxKelas.setBounds(200, 300, 165, 30);
        pilih.add(boxKelas);
        JButton ok3 = new JButton("V");
        ok3.setBounds(370, 300, 50, 30);
        pilih.add(ok3);
        
        //IF MINIBUS
        JLabel labelKapasitas = new JLabel("Kapasitas");
        labelKapasitas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKapasitas.setBounds(40, 300, 500, 20);
        pilih.add(labelKapasitas);
        String[] kapasitas = {"20 Penumpang", "30 Penumpang"};
        JComboBox boxKapasitas = new JComboBox(kapasitas);
        boxKapasitas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxKapasitas.setBounds(200, 300, 165, 30);
        pilih.add(boxKapasitas);
        JButton ok4 = new JButton("V");
        ok4.setBounds(370, 300, 50, 30);
        pilih.add(ok4);
        */
        
        JLabel labelPlat = new JLabel("Nomor Plat");
        labelPlat.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelPlat.setBounds(40, 340, 500, 20);
        pilih.add(labelPlat);
        JTextField txtTelp = new JTextField();
        txtTelp.setBounds(200, 340, 220, 30);
        pilih.add(txtTelp);
        
        JLabel labelMerk = new JLabel ("Merk");
        labelMerk.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelMerk.setBounds(40, 380, 500, 20);
        pilih.add(labelMerk);
        JTextField txtMerk = new JTextField();
        txtMerk.setBounds(200, 380, 220, 30);
        pilih.add(txtMerk);
        
        
        JLabel labelKeluaran = new JLabel ("Tahun Keluaran");
        labelKeluaran.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKeluaran.setBounds(40, 420, 500, 20);
        pilih.add(labelKeluaran);
        JTextField txtKeluaran = new JTextField();
        txtKeluaran.setBounds(200, 420, 220, 30);
        pilih.add(txtKeluaran);
        
        JLabel labelBiaya = new JLabel ("Biaya");
        labelBiaya.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelBiaya.setBounds(40, 460, 500, 20);
        pilih.add(labelBiaya);
        JTextField txtBiaya = new JTextField();
        txtBiaya.setBounds(200, 460, 220, 30);
        pilih.add(txtBiaya);
        
               
        JButton simpan = new JButton("SIMPAN");
        simpan.setBounds(320, 540, 100, 30);
        pilih.add(simpan);
        
        
        JButton back = new JButton("");
        back.setBounds(20, 10, 50, 30);
        pilih.add(back);
        
        pilih.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
