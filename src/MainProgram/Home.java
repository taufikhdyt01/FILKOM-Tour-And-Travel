package MainProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home implements ActionListener {

    Home() {
        initComponents();
    }
    
    public void initComponents(){
        //CONTAINER
        JFrame home = new JFrame("Filkom Tour And Travel");
        home.setSize(480, 800);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLocationRelativeTo(null);
        home.setLayout(null);

        //COMPONENT
        JLabel labelJudul = new JLabel("Filkom Tour And Travel");
        labelJudul.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 24));
        labelJudul.setBounds(112, 60, 500, 20);
        home.add(labelJudul);

        JLabel labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MainProgram/logo.png")).getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH)));
        labelLogo.setBounds(0, 40, 500, 500);
        home.add(labelLogo);
        
        JButton masukAdmin = new JButton("MASUK SEBAGAI KARYAWAN");
        masukAdmin.setBounds(85, 500, 300, 50);
        home.add(masukAdmin);
        
        JButton masukPemesan = new JButton("MASUK SEBAGAI PEMESAN");
        masukPemesan.setBounds(85, 560, 300, 50);
        home.add(masukPemesan);
        
        home.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}