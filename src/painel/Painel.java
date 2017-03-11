/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painel;

import com.marcos.app.bean.Message;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author trabalho
 */
public class Painel extends javax.swing.JFrame implements ChangeListener {

    /**
     * Creates new form Painel
     */
    public Painel() {
        initComponents();
        jlDisplay1.setText("");
        jlDisplay2.setText("");

        sensor1.addChangeListener(this);
        sensor2.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        jtValorS1.setText("" + sensor1.getValue());
        jtValorS2.setText("" + sensor2.getValue());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chave1 = new javax.swing.JToggleButton();
        chave2 = new javax.swing.JToggleButton();
        chave3 = new javax.swing.JToggleButton();
        chave4 = new javax.swing.JToggleButton();
        sensor1 = new javax.swing.JSlider();
        sensor2 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        led1 = new javax.swing.JLabel();
        led2 = new javax.swing.JLabel();
        led3 = new javax.swing.JLabel();
        led4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlDisplay1 = new javax.swing.JLabel();
        jlDisplay2 = new javax.swing.JLabel();
        jtValorS1 = new javax.swing.JTextField();
        jtValorS2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        chave1.setText("C1");
        chave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chave1ActionPerformed(evt);
            }
        });

        chave2.setText("C2");

        chave3.setText("C3");

        chave4.setText("C4");

        sensor1.setMaximum(10);
        sensor1.setMinimum(-10);
        sensor1.setValue(0);

        sensor2.setMaximum(10);
        sensor2.setMinimum(-10);
        sensor2.setValue(0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        led1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png"))); // NOI18N

        led2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png"))); // NOI18N

        led3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png"))); // NOI18N

        led4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png"))); // NOI18N

        jLabel7.setText("L1");

        jLabel8.setText("L2");

        jLabel9.setText("L3");

        jLabel10.setText("L4");

        jLabel12.setText("D1 - Display");

        jLabel13.setText("S1");

        jLabel14.setText("S2");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jlDisplay1.setText("1234567890123456");

        jlDisplay2.setText("1234567890123456");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jlDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jtValorS1.setEditable(false);
        jtValorS1.setText("0");

        jtValorS2.setEditable(false);
        jtValorS2.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(led1)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(led2)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(led3)
                            .addComponent(jLabel9))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(led4)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chave1)
                        .addGap(9, 9, 9)
                        .addComponent(chave2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chave3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chave4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sensor1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jtValorS1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(jtValorS2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(103, 103, 103)
                            .addComponent(jLabel14)
                            .addGap(39, 39, 39))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel12))))))
                .addGap(86, 86, 86)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(led1)
                        .addComponent(led2)
                        .addComponent(led3))
                    .addComponent(led4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chave1)
                    .addComponent(chave2)
                    .addComponent(chave3)
                    .addComponent(chave4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sensor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtValorS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtValorS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chave1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    static Painel painel = new Painel();
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Painel().setVisible(true);
                painel.setVisible(true);
            }
        });
    }*/
    public double getValorSensor(String c) {
        switch (c) {
            case "S1":
                return sensor1.getValue();

            case "S2":
                return sensor2.getValue();

        }
        return 0;
    }

    public boolean getEstadoComponente(String c) {

        switch (c) {
            case "L1":
                if (led1.getIcon().toString().equals("led_on.png")) {
                    return true;
                } else {
                    return false;
                }
            case "L2":
                if (led1.getIcon().toString().equals("led_on.png")) {
                    return true;
                } else {
                    return false;
                }
            case "L3":
                if (led1.getIcon().toString().equals("led_on.png")) {
                    return true;
                } else {
                    return false;
                }
            case "L4":
                if (led1.getIcon().toString().equals("led_on.png")) {
                    return true;
                } else {
                    return false;
                }
            /*
            case L5:
                if (led1.getIcon().toString().equals("led_on.png")){
                    return true;
                }else{
                    return false;
                }*/

            case "C1":
                if (chave1.isSelected()) {
                    return true;
                } else {
                    return false;
                }
            case "C2":
                if (chave2.isSelected()) {
                    return true;
                } else {
                    return false;
                }
            case "C3":
                if (chave3.isSelected()) {
                    return true;
                } else {
                    return false;
                }
            case "C4":
                if (chave4.isSelected()) {
                    return true;
                } else {
                    return false;
                }
            /* case "C5":
                if (chave5.isSelected()){
                    return true;
                }else{
                    return false;
                }
             */
        }

        return false;
    }

    public void escreverEmComponente(String c, String msg) {
        msg = msg.concat("                                        ");
        switch (c) {
            case "D1":
                String msg1= msg.substring(0, 16).trim();
                String msg2= msg.substring(16, 32).trim();
                jlDisplay1.setText(msg1);
                jlDisplay2.setText(msg2);
                break;
        }
    }

    public void alterarEstadoComponente(String c, boolean e) {

        switch (c) {
            case "L1":
                if (e) {
                    led1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_on.png")));
                } else {
                    led1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png")));
                }
                break;
            case "L2":
                if (e) {
                    led2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_on.png")));
                } else {
                    led2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png")));
                }
                break;
            case "L3":
                if (e) {
                    led3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_on.png")));
                } else {
                    led3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png")));
                }
                break;

            case "L4":
                if (e) {
                    led4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_on.png")));
                } else {
                    led4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png")));
                }
                break;

            /*case "L5":
                if (e){
                    led5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_on.png")));
                }else{
                    led5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/marcos/app/imagens/led_off.png")));
                }
                break;
             */
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton chave1;
    private javax.swing.JToggleButton chave2;
    private javax.swing.JToggleButton chave3;
    private javax.swing.JToggleButton chave4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlDisplay1;
    private javax.swing.JLabel jlDisplay2;
    private javax.swing.JTextField jtValorS1;
    private javax.swing.JTextField jtValorS2;
    private javax.swing.JLabel led1;
    private javax.swing.JLabel led2;
    private javax.swing.JLabel led3;
    private javax.swing.JLabel led4;
    private javax.swing.JSlider sensor1;
    private javax.swing.JSlider sensor2;
    // End of variables declaration//GEN-END:variables

}