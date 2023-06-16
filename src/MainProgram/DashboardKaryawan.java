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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class DashboardKaryawan implements ActionListener{
    
    DashboardKaryawan(){
        initComponents();

    }
    public void initComponents(){
        //CONTAINER
        JFrame dashboard = new JFrame("Filkom Tour And Travel");
        dashboard.setSize(480, 800);
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashboard.setLocationRelativeTo(null);
        dashboard.setLayout(null);

        //COMPONENT
        JLabel labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MainProgram/logo.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        labelLogo.setBounds(120, 0, 250, 250);
        dashboard.add(labelLogo);
        
        JLabel labelJudul = new JLabel("Welcome Home!!!");
        labelJudul.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelJudul.setBounds(180, 220, 500, 20);
        dashboard.add(labelJudul);
        
        JButton tambahKaryawan = new JButton("TAMBAH KARYAWAN");
        tambahKaryawan.setBounds(85, 280, 300, 50);
        dashboard.add(tambahKaryawan);
        
        JButton tambahMobil = new JButton("TAMBAH MOBIL");
        tambahMobil.setBounds(85, 340, 300, 50);
        dashboard.add(tambahMobil);
        
        JButton daftarKaryawan = new JButton("DAFTAR KARYAWAN");
        daftarKaryawan.setBounds(85, 400, 300, 50);
        dashboard.add(daftarKaryawan);
        
        JButton daftarMobil = new JButton("DAFTAR MOBIL");
        daftarMobil.setBounds(85, 460, 300, 50);
        dashboard.add(daftarMobil);
        
        JButton daftarPemesananTravel = new JButton("DAFTAR PEMESANAN TRAVEL");
        daftarPemesananTravel.setBounds(85, 520, 300, 50);
        dashboard.add(daftarPemesananTravel);
        
        
        JButton daftarPemesananRentCar = new JButton("DAFTAR PEMESANAN RENTCAR");
        daftarPemesananRentCar.setBounds(85, 580, 300, 50);
        dashboard.add(daftarPemesananRentCar);
        
        JButton back = new JButton("");
        back.setBounds(20, 10, 50, 30);
        dashboard.add(back);
        
        dashboard.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
