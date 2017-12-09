/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import complementos.AtributosGUI;
import dao.UsuarioDAO;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import to.UsuarioTO;

/**
 *
 * @author Alisoft
 */
public class LogIn extends javax.swing.JFrame {


    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        setLocationRelativeTo(null);
        codigoInicial();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpaneHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlblCodigo = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jlblContrasenia = new javax.swing.JLabel();
        jsepContrasenia = new javax.swing.JSeparator();
        jsepCodigo = new javax.swing.JSeparator();
        jtxtContrasenia = new javax.swing.JPasswordField();
        jlblError = new javax.swing.JLabel();
        jpaneSinConexion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jpaneHeader.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Lt", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("        Intranet Universitaria");

        javax.swing.GroupLayout jpaneHeaderLayout = new javax.swing.GroupLayout(jpaneHeader);
        jpaneHeader.setLayout(jpaneHeaderLayout);
        jpaneHeaderLayout.setHorizontalGroup(
            jpaneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpaneHeaderLayout.setVerticalGroup(
            jpaneHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Roboto Lt", 0, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setText("mantener sesión");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlblCodigo.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jlblCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jlblCodigo.setText("Código universitario:");

        jtxtCodigo.setFont(new java.awt.Font("Roboto Lt", 0, 11)); // NOI18N
        jtxtCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jtxtCodigo.setText("Código universitario:");
        jtxtCodigo.setBorder(null);
        jtxtCodigo.setSelectionColor(new java.awt.Color(0, 102, 255));
        jtxtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtCodigoFocusLost(evt);
            }
        });

        jlblContrasenia.setFont(new java.awt.Font("Roboto Lt", 0, 11)); // NOI18N
        jlblContrasenia.setForeground(new java.awt.Color(51, 51, 51));
        jlblContrasenia.setText("Contraseña:");

        jsepContrasenia.setForeground(new java.awt.Color(153, 153, 153));

        jsepCodigo.setForeground(new java.awt.Color(153, 153, 153));

        jtxtContrasenia.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jtxtContrasenia.setForeground(new java.awt.Color(51, 51, 51));
        jtxtContrasenia.setBorder(null);
        jtxtContrasenia.setSelectionColor(new java.awt.Color(0, 102, 255));
        jtxtContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtContraseniaFocusLost(evt);
            }
        });

        jlblError.setForeground(new java.awt.Color(102, 209, 36));
        jlblError.setText("La contraseña es incorrecta");

        jpaneSinConexion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sadcloud-50.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(149, 165, 166));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("No se ha podido conectar con el servidor...");

        javax.swing.GroupLayout jpaneSinConexionLayout = new javax.swing.GroupLayout(jpaneSinConexion);
        jpaneSinConexion.setLayout(jpaneSinConexionLayout);
        jpaneSinConexionLayout.setHorizontalGroup(
            jpaneSinConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );
        jpaneSinConexionLayout.setVerticalGroup(
            jpaneSinConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaneSinConexionLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jsepCodigo)
                    .addComponent(jlblCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblContrasenia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpaneSinConexion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsepContrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtContrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsepCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsepContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpaneSinConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaneHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpaneHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jtxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCodigoFocusGained
        enFoco(jlblCodigo, jtxtCodigo, jsepCodigo, "Código universitario:", true);
    }//GEN-LAST:event_jtxtCodigoFocusGained

    private void jtxtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCodigoFocusLost
        enFoco(jlblCodigo, jtxtCodigo, jsepCodigo, "Código universitario:", false);
    }//GEN-LAST:event_jtxtCodigoFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("procesar datos");
        mandarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContraseniaFocusGained
        enFoco(jlblContrasenia, jtxtContrasenia, jsepContrasenia, "Contraseña:", true);
        jtxtContrasenia.setFont(new java.awt.Font("Calibri", 0, 11));
        jtxtContrasenia.setEchoChar('●');
    }//GEN-LAST:event_jtxtContraseniaFocusGained

    private void jtxtContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContraseniaFocusLost
        enFoco(jlblContrasenia, jtxtContrasenia, jsepContrasenia, "Contraseña:", false);
        if (jtxtContrasenia.getText().isEmpty() || jtxtContrasenia.getText().equals("Contraseña:")) {
            jtxtContrasenia.setFont(new java.awt.Font("Roboto Lt", 0, 11));
            jtxtContrasenia.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_jtxtContraseniaFocusLost

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
                //new PrincipalGUI().setVisible(true);
                //new PrincipalGUIOpcional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlblCodigo;
    private javax.swing.JLabel jlblContrasenia;
    private javax.swing.JLabel jlblError;
    private javax.swing.JPanel jpaneHeader;
    private javax.swing.JPanel jpaneSinConexion;
    private javax.swing.JSeparator jsepCodigo;
    private javax.swing.JSeparator jsepContrasenia;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JPasswordField jtxtContrasenia;
    // End of variables declaration//GEN-END:variables

    private void enFoco(JLabel lbl, JTextField txt, JSeparator sep, String placeholder, boolean enFoco) {
        jlblError.setVisible(false);
        if (enFoco) {
            sep.setForeground(AtributosGUI.color_principal);
            lbl.setForeground(AtributosGUI.color_principal);
            lbl.setFont(new java.awt.Font("Roboto", 1, 11));
            lbl.setVisible(true);
            if (!txt.getText().isEmpty() && txt.getText().equals(placeholder)) {
                txt.setText(null);
            }
            jlblError.setVisible(false);
        } else {
            sep.setForeground(AtributosGUI.color_secundario);
            if (txt.getText().isEmpty()) {
                lbl.setForeground(AtributosGUI.color_secundario);
                lbl.setFont(new java.awt.Font("Roboto Lt", 0, 11));
                txt.setText(placeholder);
                lbl.setVisible(false);
            }
        }
    }

    private void mandarDatos() {
        int resultado;
        UsuarioTO usuario = new UsuarioTO();
        usuario.setNombre(jtxtCodigo.getText());
        usuario.setPass(new String(jtxtContrasenia.getPassword()));
        if (usuario.getNombre().equals("Código universitario:") || usuario.getNombre().isEmpty()) {
            mostrarError("Ingrese su código universitario.");
        } else if (usuario.getPass().equals("Contraseña:") || usuario.getPass().isEmpty()) {
            mostrarError("Ingrese su contraseña.");
        } else {
            UsuarioDAO dao = new UsuarioDAO();
            try {
                resultado = dao.validar(usuario);
                //-1 si el usuario no existe
                //0 si el usuario existe pero la contaseña es incorrecta
                //1 si el usuario existe y la contraseña es correcta
                switch (resultado) {
                    case -1:
                        mostrarError("Ingrese un código universitario válido.");
                        break;
                    case 0:
                        mostrarError("La contraseña es incorrecta.");
                        break;
                    case 1:
                        mostrarError("Usuario válido.");
                        jlblError.setForeground(AtributosGUI.color_success);
                        abrirPrincipalGUI();
                }
            } catch (Exception ex) {
                jpaneSinConexion.setVisible(true);
                ex.printStackTrace();
            }
        }
    }

    private void mostrarError(String mensaje) {
        jlblError.setText(mensaje);
        jlblError.setForeground(AtributosGUI.color_error);
        jlblError.setVisible(true);
    }

    private void abrirPrincipalGUI() {
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PrincipalGUI().setVisible(true);
                new PrincipalGUIOpcional().setVisible(true);
            }
        });
    }

    private void codigoInicial() {
        AtributosGUI.setColoresEstandar();
        jlblCodigo.setVisible(false);
        jlblContrasenia.setVisible(false);
        jlblError.setVisible(false);
        jtxtContrasenia.setText("Contraseña:");
        jtxtContrasenia.setFont(new java.awt.Font("Roboto Lt", 0, 11));
        jtxtContrasenia.setEchoChar((char) 0);
        jpaneHeader.setBackground(AtributosGUI.color_principal);
        jpaneSinConexion.setVisible(false);
    }
}
