/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

/**
 *
 * @author ERICK
 */
public class Calculadora2 extends javax.swing.JFrame {
    
    private float num1, num2;
    private String signo;

    /**
     * Creates new form Calculadora2
     */
    public Calculadora2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        contenedor = new javax.swing.JLabel();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        numCero = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        comilla = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        jButton6.setText("4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        contenedor.setBackground(new java.awt.Color(51, 51, 51));
        contenedor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        contenedor.setForeground(new java.awt.Color(255, 255, 255));
        contenedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        contenedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        contenedor.setOpaque(true);

        ocho.setBackground(new java.awt.Color(51, 51, 51));
        ocho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ocho.setForeground(new java.awt.Color(255, 255, 255));
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(51, 51, 51));
        nueve.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nueve.setForeground(new java.awt.Color(255, 255, 255));
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        dividir.setBackground(new java.awt.Color(51, 51, 51));
        dividir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dividir.setForeground(new java.awt.Color(255, 255, 255));
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(51, 51, 51));
        siete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        siete.setForeground(new java.awt.Color(255, 255, 255));
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(51, 51, 51));
        cinco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(51, 51, 51));
        seis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        multiplicacion.setBackground(new java.awt.Color(51, 51, 51));
        multiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        multiplicacion.setText("x");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(51, 51, 51));
        cuatro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cuatro.setForeground(new java.awt.Color(255, 255, 255));
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(51, 51, 51));
        dos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dos.setForeground(new java.awt.Color(255, 255, 255));
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(51, 51, 51));
        tres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        menos.setBackground(new java.awt.Color(51, 51, 51));
        menos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menos.setForeground(new java.awt.Color(255, 255, 255));
        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(51, 51, 51));
        uno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        uno.setForeground(new java.awt.Color(255, 255, 255));
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        numCero.setBackground(new java.awt.Color(51, 51, 51));
        numCero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numCero.setForeground(new java.awt.Color(255, 255, 255));
        numCero.setText("0");
        numCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCeroActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(204, 153, 255));
        igual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        igual.setForeground(new java.awt.Color(0, 0, 0));
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(51, 51, 51));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("+");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        comilla.setBackground(new java.awt.Color(51, 51, 51));
        comilla.setForeground(new java.awt.Color(255, 255, 255));
        comilla.setText(",");
        comilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comillaActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(51, 51, 51));
        borrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("C");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comilla, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numCero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numCero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comilla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "9");
    }//GEN-LAST:event_nueveActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        // TODO add your handling code here:
        num1 = Float.parseFloat(contenedor.getText()); // Almacenamos el número del contenedor dentro de la variable
        signo = "/";
        
        // Borramos el contenedor para obtener el segundo número
        contenedor.setText("");
    }//GEN-LAST:event_dividirActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "7");
    }//GEN-LAST:event_sieteActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "6");
    }//GEN-LAST:event_seisActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        // TODO add your handling code here:
        num1 = Float.parseFloat(contenedor.getText()); // Almacenamos el número del contenedor dentro de la variable
        signo = "*";
        
        // Borramos el contenedor para obtener el segundo número
        contenedor.setText("");
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "3");
    }//GEN-LAST:event_tresActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        // TODO add your handling code here:
        num1 = Float.parseFloat(contenedor.getText()); // Almacenamos el número del contenedor dentro de la variable
        signo = "-";
        
        // Borramos el contenedor para obtener el segundo número
        contenedor.setText("");
    }//GEN-LAST:event_menosActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + "1");
    }//GEN-LAST:event_unoActionPerformed

    // Número 0
    private void numCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCeroActionPerformed
        // Variable cambiada en el design
        contenedor.setText(contenedor.getText() + "0"); // Hay que colocar variable.getText() para que no se borre lo que ya estaba puesto
    }//GEN-LAST:event_numCeroActionPerformed

    // Igual
    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        num2 = Float.parseFloat(contenedor.getText()); // Obtenemos los datos del contenedor para realizar la operación con la variable num1
        
        switch(signo){
            case "+":
                contenedor.setText(Float.toString(num1 + num2)); // Hay que cambiar el tipo ya que el JLabel solo admite String
                break;
            case "-":
                contenedor.setText(Float.toString(num1 - num2));
                break;
            case "*":
                contenedor.setText(Float.toString(num1 * num2));
                break;
            case "/":
                contenedor.setText(Float.toString(num1 / num2));
                break;
        }
                
    }//GEN-LAST:event_igualActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        num1 = Float.parseFloat(contenedor.getText()); // Almacenamos el número del contenedor dentro de la variable
        signo = "+";
        
        // Borramos el contenedor para obtener el segundo número
        contenedor.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed

    // Comillas 
    private void comillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comillaActionPerformed
        // TODO add your handling code here:
        contenedor.setText(contenedor.getText() + ".");
    }//GEN-LAST:event_comillaActionPerformed

    // Borrar
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
        contenedor.setText("");
    }//GEN-LAST:event_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Calculadora2().setVisible(true);
                
                Calculadora2 calculadora = new Calculadora2();
                
                calculadora.setResizable(false);
                calculadora.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton cinco;
    private javax.swing.JButton comilla;
    private javax.swing.JLabel contenedor;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menos;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton nueve;
    private javax.swing.JButton numCero;
    private javax.swing.JButton ocho;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
