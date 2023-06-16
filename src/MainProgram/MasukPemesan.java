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
public class MasukPemesan implements ActionListener {
    
    MasukPemesan(){
        initComponents();
    }
    
    public void initComponents(){
        //CONTAINER
        JFrame login = new JFrame("Filkom Tour And Travel");
        login.setSize(480, 800);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.setLayout(null);

        //COMPONENT
        JLabel labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MainProgram/logo.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        labelLogo.setBounds(120, 0, 250, 250);
        login.add(labelLogo);
        
        JLabel labelJudul = new JLabel("Holla, Travelers!!");
        labelJudul.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 16));
        labelJudul.setBounds(180, 220, 500, 20);
        login.add(labelJudul);

        JLabel labelEmail = new JLabel("Email :");
        labelEmail.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
        labelEmail.setBounds(60, 260, 500, 20);
        login.add(labelEmail);
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(60, 280, 350, 40);
        login.add(txtEmail);
        
        JLabel labelSandi = new JLabel("Kata Sandi :");
        labelSandi.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
        labelSandi.setBounds(60, 340, 500, 20);
        login.add(labelSandi);
        JTextField txtSandi = new JTextField();
        txtSandi.setBounds(60, 360, 350, 40);
        login.add(txtSandi);
        
        JLabel labelLupaSandi = new JLabel("Lupa Sandi");
        labelLupaSandi.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
        labelLupaSandi.setBounds(335, 400, 500, 20);
        login.add(labelLupaSandi);
        
        JButton masuk = new JButton("MASUK");
        masuk.setBounds(85, 500, 300, 50);
        login.add(masuk);
        
        JButton back = new JButton("");
        back.setBounds(20, 10, 50, 30);
        login.add(back);
        
        login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
