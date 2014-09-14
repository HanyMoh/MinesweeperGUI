/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweepergui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author HussinMhahoud
 */
public class Testopen extends javax.swing.JFrame {

    private String[] listSapjectLevl = {"Beginner", "Intrmediate", "Advanced"};
   private int storIndexHrz;
   private int storIndexVir;
   private static volatile Testopen myTestopen;
   public int storwidth ;
   public int storhide ;
   public String playername ;



    public  int getStorIndexHrz() {
        return storIndexHrz;
    }

    public int getStorIndexVir() {
        return storIndexVir;
    }

    private Testopen() {
         initComponents();
         this.setVisible(true);
    }
 public static Testopen getmyTestopen() {
        if (myTestopen == null) {
            myTestopen = new Testopen();
        }
        return myTestopen ;
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        northPanal = new javax.swing.JPanel();
        welcomLabel = new javax.swing.JLabel();
        testLabel = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        namePlayerLabel = new javax.swing.JLabel();
        playernameTextF = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        levelComBox = new javax.swing.JComboBox();
        southPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        playNowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Minesweeper Game");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        welcomLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        welcomLabel.setForeground(new java.awt.Color(0, 0, 153));
        welcomLabel.setText("Welcom Game");

        javax.swing.GroupLayout northPanalLayout = new javax.swing.GroupLayout(northPanal);
        northPanal.setLayout(northPanalLayout);
        northPanalLayout.setHorizontalGroup(
            northPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(testLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        northPanalLayout.setVerticalGroup(
            northPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, northPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(northPanalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(testLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(northPanal);

        centerPanel.setRequestFocusEnabled(false);

        namePlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namePlayerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namePlayerLabel.setText("Player Name");

        levelLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        levelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelLabel.setText("Level Game");

        levelComBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        levelComBox.setMaximumRowCount(3);
        levelComBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Beginner", "Intrmediate", "Advanced" }));

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(levelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namePlayerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(levelComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playernameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        centerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {levelLabel, namePlayerLabel});

        centerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {levelComBox, playernameTextF});

        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namePlayerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playernameTextF, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(levelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelComBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        centerPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {levelLabel, namePlayerLabel});

        centerPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {levelComBox, playernameTextF});

        getContentPane().add(centerPanel);

        exitButton.setText("Exit ");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        playNowButton.setText("Play Now");
        playNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playNowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout southPanelLayout = new javax.swing.GroupLayout(southPanel);
        southPanel.setLayout(southPanelLayout);
        southPanelLayout.setHorizontalGroup(
            southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, southPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(playNowButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(61, 61, 61))
        );

        southPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exitButton, playNowButton});

        southPanelLayout.setVerticalGroup(
            southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(playNowButton))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        southPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {exitButton, playNowButton});

        getContentPane().add(southPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playNowButtonActionPerformed
        // TODO add your handling code here:

        if (this.levelComBox.getSelectedItem().equals("Beginner")) {
            this.testLabel.setText("Beginner");
            this.storIndexHrz = 9 ;
            this.storIndexVir = 9 ;
            this.storwidth = 400;
            this.storhide = 300;
        } else if (this.levelComBox.getSelectedItem().equals("Intrmediate")) {
            this.testLabel.setText("Intrmediate");
             this.storIndexHrz = 16 ;
            this.storIndexVir = 16 ;
             this.storwidth = 800;
            this.storhide = 600;
        } else if (this.levelComBox.getSelectedItem().equals("Advanced")) {
            this.testLabel.setText("Advanced");
             this.storIndexHrz = 16 ;
            this.storIndexVir = 30 ;
             this.storwidth = 1350;
            this.storhide = 600;
        }
       this.playername = this.playernameTextF.getText() ;
        this.setVisible(false);
        MianGame.main(listSapjectLevl);

//        Intrmediate", "Advanced





    }//GEN-LAST:event_playNowButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        //////*
        this.dispose();
       
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Testopen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testopen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testopen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testopen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testopen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox levelComBox;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel namePlayerLabel;
    private javax.swing.JPanel northPanal;
    private javax.swing.JButton playNowButton;
    private javax.swing.JTextField playernameTextF;
    private javax.swing.JPanel southPanel;
    private javax.swing.JLabel testLabel;
    private javax.swing.JLabel welcomLabel;
    // End of variables declaration//GEN-END:variables
}
