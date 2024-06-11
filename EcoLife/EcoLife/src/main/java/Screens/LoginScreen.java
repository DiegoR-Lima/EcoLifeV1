package Screens;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Rodrigo
 */
public class LoginScreen extends javax.swing.JFrame {

    public LoginScreen() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        User.setBackground(new Color(0, 0, 0, 0));
        User.setBorder(null);
        User.setOpaque(false);
        
        Pass.setBackground(new Color(0, 0, 0, 0));
        Pass.setBorder(null);
        Pass.setOpaque(false);
        
        Entrar.setBackground(new Color(0, 0, 0, 0));
        Entrar.setBorder(null);
        Entrar.setOpaque(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        View = new javax.swing.JLabel();
        Nview = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        User.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setText("user@email.com");
        getContentPane().add(User);
        User.setBounds(440, 450, 350, 80);

        Pass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Pass);
        Pass.setBounds(440, 590, 350, 90);

        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar);
        Entrar.setBounds(700, 840, 120, 60);

        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ViewPass.png"))); // NOI18N
        View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewMouseClicked(evt);
            }
        });
        getContentPane().add(View);
        View.setBounds(810, 610, 40, 50);

        Nview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotSeePass.png"))); // NOI18N
        Nview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NviewMouseClicked(evt);
            }
        });
        getContentPane().add(Nview);
        Nview.setBounds(810, 610, 40, 50);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginScreen.png"))); // NOI18N
        Fundo.setText("jLabel1");
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    ///// SETTINGS ANIMATIONS/BUTTONS    
    private void ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseClicked
        View.setVisible(false);
        Nview.setVisible(true);
        Pass.setEchoChar((char)0);
    }//GEN-LAST:event_ViewMouseClicked

    private void NviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NviewMouseClicked
        View.setVisible(true);
        Nview.setVisible(false);
        Pass.setEchoChar('*');
    }//GEN-LAST:event_NviewMouseClicked

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        String admEmail = "adm@email.com";
        String admSenha = "Admin";
    
        // Obtenha os valores dos campos de email e senha
        String email = User.getText();
        String senha = new String(Pass.getPassword());

        // Verifique as credenciais
        if (email.equals(admEmail) && senha.equals(admSenha)) {
        // Mostrar mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Seja Bem-vindo, Administrador!");

        HomeScreenADM homeScreen = new HomeScreenADM();
        homeScreen.setVisible(true);
        dispose();
        } else {
            // Se não houver registro correspondente, exiba uma mensagem de erro
            JOptionPane.showMessageDialog(this, "E-mail ou senha incorretos. Tente novamente.");
        }
    }//GEN-LAST:event_EntrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Nview;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField User;
    private javax.swing.JLabel View;
    // End of variables declaration//GEN-END:variables
}
