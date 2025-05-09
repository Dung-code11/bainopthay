/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author ADMIN
 */
// Tạo lớp Border tròn
class RoundBorder implements Border {
    private int radius;

    public RoundBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(10, 10, 10, 10);
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(new Color(180, 180, 180)); // Viền màu xám nhạt
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
      setTitle("Sign In");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Font setup
        Font titleFont = new Font("Segoe UI", Font.BOLD, 28);
        Font subTitleFont = new Font("Segoe UI", Font.PLAIN, 16);
        Font labelFont = new Font("Segoe UI", Font.BOLD, 16);
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 16);
        Font smallFont = new Font("Segoe UI", Font.PLAIN, 14);

        JPanel leftPanel = new JPanel(new GridBagLayout());
        leftPanel.setPreferredSize(new Dimension(400, 500));
        leftPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 20, 5, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        // Tiêu đề "WELCOME!" và phụ đề "Login to your account"
        JPanel titlePanel = new JPanel(new GridBagLayout());
        titlePanel.setBackground(Color.WHITE);
        GridBagConstraints titleGbc = new GridBagConstraints();
        titleGbc.gridx = 0;
        titleGbc.gridy = 0;
        titleGbc.insets = new Insets(0, 0, 5, 0);

        JLabel welcomeLabel = new JLabel("WELCOME!");
        welcomeLabel.setFont(titleFont);
        welcomeLabel.setForeground(new Color(220, 53, 69));
        titlePanel.add(welcomeLabel, titleGbc);

        titleGbc.gridy++;
        JLabel subtitleLabel = new JLabel("Login to your account");
        subtitleLabel.setFont(subTitleFont);
        subtitleLabel.setForeground(Color.GRAY);
        titlePanel.add(subtitleLabel, titleGbc);

        gbc.gridy = 0;
        leftPanel.add(titlePanel, gbc);

        // Label Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setPreferredSize(new Dimension(250, 20));
        usernameLabel.setFont(labelFont);
        gbc.gridy = 1;
        leftPanel.add(usernameLabel, gbc);

        // Username Field
        JTextField usernameField = new JTextField();
        usernameField.setBorder(new RoundBorder(20));
        usernameField.setPreferredSize(new Dimension(250, 40));
        usernameField.setFont(fieldFont);
        gbc.gridy = 2;
        leftPanel.add(usernameField, gbc);

        // Label Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setPreferredSize(new Dimension(250, 20));
        passwordLabel.setFont(labelFont);
        gbc.gridy = 3;
        leftPanel.add(passwordLabel, gbc);

        // Password Field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBorder(new RoundBorder(20));
        passwordField.setPreferredSize(new Dimension(250, 40));
        passwordField.setFont(fieldFont);
        gbc.gridy = 4;
        leftPanel.add(passwordField, gbc);

        // Remember checkbox
        JCheckBox rememberBox = new JCheckBox("Remember password.");
        rememberBox.setBackground(Color.WHITE);
        rememberBox.setPreferredSize(new Dimension(250, 30));
        rememberBox.setFont(smallFont);
        gbc.gridy = 5;
        leftPanel.add(rememberBox, gbc);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.WHITE);
        JButton signInBtn = new JButton("Sign In");
        signInBtn.setBackground(new Color(220, 53, 69));
        signInBtn.setForeground(Color.WHITE);
        signInBtn.setFont(fieldFont);
        signInBtn.setPreferredSize(new Dimension(120, 40));
        JButton signUpBtn = new JButton("Sign Up");
        signUpBtn.setPreferredSize(new Dimension(120, 40));
        signUpBtn.setFont(fieldFont);
        buttonPanel.add(signInBtn);
        buttonPanel.add(signUpBtn);
        gbc.gridy = 6;
        leftPanel.add(buttonPanel, gbc);

        // Forgot password
        JLabel forgotLabel = new JLabel("Forgot Password", SwingConstants.CENTER);
        forgotLabel.setForeground(Color.PINK);
        forgotLabel.setFont(smallFont);
        gbc.gridy = 7;
        leftPanel.add(forgotLabel, gbc);

        add(leftPanel, BorderLayout.WEST);

        // Right panel with image
        JPanel rightPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                java.net.URL imgUrl = getClass().getResource("/images/anhhong.jpg");
                if (imgUrl != null) {
                    ImageIcon imageIcon = new ImageIcon(imgUrl);
                    g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
                } else {
                    g.setColor(Color.GRAY);
                    g.drawString("Image not found", 10, 20);
                }
            }
        };
        rightPanel.setBackground(Color.LIGHT_GRAY);
        add(rightPanel, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
