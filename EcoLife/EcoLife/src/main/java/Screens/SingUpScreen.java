package Screens;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Rodrigo
 */
public class SingUpScreen extends javax.swing.JFrame {

    public SingUpScreen() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Definir campo Nome
        Nome.setBackground(new Color(0, 0, 0, 0));
        Nome.setBorder(null);
        Nome.setOpaque(false);
        
        // Definir campo Data de Nascimento
        DataDeNascimento.setBackground(new Color(0, 0, 0, 0));
        DataDeNascimento.setBorder(null);
        DataDeNascimento.setOpaque(false);
        
        // Definir campo Email
        Email.setBackground(new Color(0, 0, 0, 0));
        Email.setBorder(null);
        Email.setOpaque(false);
        
        // Definir campo Confirmar Email
        ConfirmarEmail.setBackground(new Color(0, 0, 0, 0));
        ConfirmarEmail.setBorder(null);
        ConfirmarEmail.setOpaque(false);
        
        // Definir campo Senha
        Senha.setBackground(new Color(0, 0, 0, 0));
        Senha.setBorder(null);
        Senha.setOpaque(false);
        
        // Definir campo Confirmar Senha
        ConfirmarSenha.setBackground(new Color(0, 0, 0, 0));
        ConfirmarSenha.setBorder(null);
        ConfirmarSenha.setOpaque(false);
        
        // Definir campo Entrar
        Entrar.setBackground(new Color(0, 0, 0, 0));
        Entrar.setBorder(null);
        Entrar.setOpaque(false);
        
        // Definir campo Limpar
        Limpar.setBackground(new Color(0, 0, 0, 0));
        Limpar.setBorder(null);
        Limpar.setOpaque(false);
        
        // Definir campo Voltar
        Voltar.setBackground(new Color(0, 0, 0, 0));
        Voltar.setBorder(null);
        Voltar.setOpaque(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JTextField();
        DataDeNascimento = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        ConfirmarEmail = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        ConfirmarSenha = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Nome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Nome);
        Nome.setBounds(252, 190, 560, 110);

        DataDeNascimento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DataDeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DataDeNascimento);
        DataDeNascimento.setBounds(260, 370, 560, 120);

        Email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Email);
        Email.setBounds(260, 560, 560, 120);

        ConfirmarEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ConfirmarEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ConfirmarEmail);
        ConfirmarEmail.setBounds(260, 750, 560, 120);

        Senha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("123456789");
        getContentPane().add(Senha);
        Senha.setBounds(1090, 190, 540, 110);

        ConfirmarSenha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmarSenha.setText("123456789");
        getContentPane().add(ConfirmarSenha);
        ConfirmarSenha.setBounds(1080, 370, 540, 110);

        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar);
        Entrar.setBounds(1540, 890, 200, 90);

        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        getContentPane().add(Limpar);
        Limpar.setBounds(1270, 890, 190, 90);

        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(990, 890, 190, 90);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SingUpScreen.png"))); // NOI18N
        Fundo.setText("jLabel1");
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        JOptionPane.showMessageDialog(null, "Casdastro realizado com sucesso!");
        HomeScreenUser homeScreenUser = new HomeScreenUser();
        homeScreenUser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EntrarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        Nome.setText("");
        DataDeNascimento.setText("");
        Email.setText("");
        ConfirmarEmail.setText("");
        Senha.setText("");
        ConfirmarSenha.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed


    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SingUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SingUpScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmarEmail;
    private javax.swing.JPasswordField ConfirmarSenha;
    private javax.swing.JTextField DataDeNascimento;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JButton Voltar;
    // End of variables declaration//GEN-END:variables
}
