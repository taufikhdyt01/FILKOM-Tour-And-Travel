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
public class PemesananTravel implements ActionListener{
    
    PemesananTravel(){
        initComponents();
    }
    
    public void initComponents() {
        //CONTAINER
        JFrame pesan = new JFrame("Filkom Tour And Travel");
        pesan.setSize(480, 800);
        pesan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pesan.setLocationRelativeTo(null);
        pesan.setLayout(null);

        //COMPONENT
        JLabel labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MainProgram/logo.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        labelLogo.setBounds(120, 0, 250, 250);
        pesan.add(labelLogo);
        
        JLabel labelJudul = new JLabel("Pemesanan Travel");
        labelJudul.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelJudul.setBounds(180, 220, 500, 20);
        pesan.add(labelJudul);
        
        JLabel labelNama = new JLabel("Nama Pemesan");
        labelNama.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelNama.setBounds(40, 260, 500, 20);
        pesan.add(labelNama);
        JTextField txtNama = new JTextField();
        txtNama.setBounds(200, 260, 220, 30);
        pesan.add(txtNama);
        
        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelAlamat.setBounds(40, 300, 500, 20);
        pesan.add(labelAlamat);
        JTextField txtAlamat = new JTextField();
        txtAlamat.setBounds(200, 300, 220, 30);
        pesan.add(txtAlamat);
        
        JLabel labelTelp = new JLabel("No. Telepon");
        labelTelp.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelTelp.setBounds(40, 340, 500, 20);
        pesan.add(labelTelp);
        JTextField txtTelp = new JTextField();
        txtTelp.setBounds(200, 340, 220, 30);
        pesan.add(txtTelp);
        
        JLabel labelKelamin = new JLabel ("Jenis Kelamin");
        labelKelamin.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelKelamin.setBounds(40, 380, 500, 20);
        pesan.add(labelKelamin);
        JRadioButton laki = new JRadioButton ();
        laki.setText("Laki-Laki");
        laki.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        laki.setBounds(200, 380, 100, 20);
        JRadioButton perempuan = new JRadioButton ();
        perempuan.setText("Perempuan");
        perempuan.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        perempuan.setBounds(300, 380, 150, 20);
        pesan.add(laki);
        pesan.add(perempuan);
        ButtonGroup groupJenisKelamin = new ButtonGroup();
        groupJenisKelamin.add(laki);
        groupJenisKelamin.add(perempuan);
        
        JLabel labelTanggal = new JLabel ("Tanggal Pemesanan");
        labelTanggal.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelTanggal.setBounds(40, 420, 500, 20);
        pesan.add(labelTanggal);
        String[] tanggal = new String[31];
        for (int i = 0; i < tanggal.length; i++){
            tanggal[i] = Integer.toString(i+1);
        }
        JComboBox boxTanggal = new JComboBox(tanggal);
        boxTanggal.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxTanggal.setBounds(200, 420, 50, 30);
        pesan.add(boxTanggal);
        String[] bulan = {"Jan","Feb","Mar","Apr","Mei","Jun","Jul","Ags","Sep","Okt","Nov","Des"};
        JComboBox boxBulan = new JComboBox(bulan);
        boxBulan.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxBulan.setBounds(260, 420, 60, 30);
        pesan.add(boxBulan);
        JTextField txtTahun = new JTextField();
        txtTahun.setBounds(330, 420, 90, 30);
        pesan.add(txtTahun);
        
        JLabel labelRute = new JLabel ("Rute Perjalanan");
        labelRute.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelRute.setBounds(40, 460, 500, 20);
        pesan.add(labelRute);
        String[] rute = {"Surabaya - Malang", "Madura - Malang", "Banyuwangi – Malang", "Situbondo – Malang", "Tulungagung – Malang"};
        JComboBox boxRute = new JComboBox(rute);
        boxRute.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        boxRute.setBounds(200, 460, 225, 30);
        pesan.add(boxRute);
               
        JButton next = new JButton("LANJUT");
        next.setBounds(320, 540, 100, 30);
        pesan.add(next);
        
        
        JButton back = new JButton("");
        back.setBounds(20, 10, 50, 30);
        pesan.add(back);
        
        pesan.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
