/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.settings.esp;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import org.json.JSONObject;

/**
 *
 * @author Jan
 */
public class FrmSettings extends javax.swing.JFrame {

    private Setting mSetting = new Setting();
    private String mMelding = "";

    /**
     * Creates new form FrmSettings
     */
    public FrmSettings() {
        initComponents();
        sInvulScherm(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIP = new javax.swing.JLabel();
        txtIP1 = new javax.swing.JTextField();
        lbNaam = new javax.swing.JLabel();
        txtNaam = new javax.swing.JTextField();
        lbOmschr = new javax.swing.JLabel();
        txtOmschr = new javax.swing.JTextField();
        lbLAN = new javax.swing.JLabel();
        txtLAN = new javax.swing.JTextField();
        lbWachtwoord = new javax.swing.JLabel();
        txtWachtwoord = new javax.swing.JTextField();
        lbMAC = new javax.swing.JLabel();
        lbLogNiveau = new javax.swing.JLabel();
        chkDrukknop = new javax.swing.JCheckBox();
        btnLees = new javax.swing.JButton();
        lbMelding = new javax.swing.JLabel();
        txtIP2 = new javax.swing.JTextField();
        txtIP3 = new javax.swing.JTextField();
        txtIP4 = new javax.swing.JTextField();
        btnSchrijf = new javax.swing.JButton();
        cmbLogNiveau = new javax.swing.JComboBox<>();
        txtMAC1 = new javax.swing.JTextField();
        txtMAC2 = new javax.swing.JTextField();
        txtMAC3 = new javax.swing.JTextField();
        txtMAC4 = new javax.swing.JTextField();
        txtMAC5 = new javax.swing.JTextField();
        txtMAC6 = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings Esp schakelaar");

        lbIP.setText("IP:");
        lbIP.setToolTipText("");

        txtIP1.setToolTipText("");
        txtIP1.setMaximumSize(new java.awt.Dimension(6, 20));
        txtIP1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIP1FocusLost(evt);
            }
        });
        txtIP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIP1KeyTyped(evt);
            }
        });

        lbNaam.setText("Naam");

        txtNaam.setToolTipText("");

        lbOmschr.setText("Omschr.");
        lbOmschr.setToolTipText("");

        txtOmschr.setToolTipText("");

        lbLAN.setText("LAN");
        lbLAN.setToolTipText("");

        txtLAN.setToolTipText("");

        lbWachtwoord.setText("Wachtwoord");
        lbWachtwoord.setToolTipText("");

        txtWachtwoord.setToolTipText("");

        lbMAC.setText("MAC");
        lbMAC.setToolTipText("");

        lbLogNiveau.setText("Logniveau");
        lbLogNiveau.setToolTipText("");

        chkDrukknop.setText("Drukknop");
        chkDrukknop.setToolTipText("");

        btnLees.setLabel("Lees");
        btnLees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeesActionPerformed(evt);
            }
        });

        lbMelding.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMelding.setForeground(new java.awt.Color(255, 0, 1));
        lbMelding.setToolTipText("");

        txtIP2.setToolTipText("");
        txtIP2.setMaximumSize(new java.awt.Dimension(6, 20));
        txtIP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIP2FocusLost(evt);
            }
        });
        txtIP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIP2KeyTyped(evt);
            }
        });

        txtIP3.setToolTipText("");
        txtIP3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIP3FocusLost(evt);
            }
        });
        txtIP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIP3KeyTyped(evt);
            }
        });

        txtIP4.setToolTipText("");
        txtIP4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIP4FocusLost(evt);
            }
        });
        txtIP4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIP4KeyTyped(evt);
            }
        });

        btnSchrijf.setText("Schrijf");
        btnSchrijf.setToolTipText("");
        btnSchrijf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchrijfActionPerformed(evt);
            }
        });

        cmbLogNiveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geen logging", "Niet persistent", "Persistent" }));

        txtMAC1.setToolTipText("");
        txtMAC1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMAC1FocusLost(evt);
            }
        });
        txtMAC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMAC1KeyTyped(evt);
            }
        });

        txtMAC2.setToolTipText("");
        txtMAC2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMAC2FocusLost(evt);
            }
        });
        txtMAC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMAC2KeyTyped(evt);
            }
        });

        txtMAC3.setToolTipText("");
        txtMAC3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMAC3FocusLost(evt);
            }
        });
        txtMAC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMAC3KeyTyped(evt);
            }
        });

        txtMAC4.setToolTipText("");
        txtMAC4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMAC4FocusLost(evt);
            }
        });
        txtMAC4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMAC4KeyTyped(evt);
            }
        });

        txtMAC5.setToolTipText("");
        txtMAC5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMAC5FocusLost(evt);
            }
        });
        txtMAC5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMAC5KeyTyped(evt);
            }
        });

        txtMAC6.setToolTipText("");
        txtMAC6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMAC6FocusLost(evt);
            }
        });
        txtMAC6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMAC6KeyTyped(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbOmschr)
                                .addComponent(lbNaam)
                                .addComponent(lbLogNiveau)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lbIP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(txtIP2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIP3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIP4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbMelding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLAN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(cmbLogNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(chkDrukknop))
                                            .addComponent(txtNaam, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOmschr, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtMAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMAC4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMAC5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMAC6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(txtWachtwoord, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReset)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSchrijf))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbWachtwoord)
                                .addComponent(lbMAC)
                                .addComponent(lbLAN))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLees)
                        .addGap(73, 73, 73)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIP)
                    .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMelding)
                    .addComponent(txtIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNaam)
                    .addComponent(txtNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOmschr)
                    .addComponent(txtOmschr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogNiveau)
                    .addComponent(cmbLogNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkDrukknop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLAN)
                    .addComponent(txtLAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWachtwoord)
                    .addComponent(txtWachtwoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMAC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMAC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMAC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMAC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMAC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMAC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbMAC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset)
                            .addComponent(btnLees)
                            .addComponent(btnSchrijf))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeesActionPerformed
        int lResult;
        boolean lIPOK;

        lIPOK = true;
        if (!sTestIPField(txtIP1)) {
            lIPOK = false;
        }
        if (!sTestIPField(txtIP2)) {
            lIPOK = false;
        }
        if (!sTestIPField(txtIP3)) {
            lIPOK = false;
        }
        if (!sTestIPField(txtIP4)) {
            lIPOK = false;
        }
        if (lIPOK) {
            lResult = sLeesSetting();
            if (lResult == Resultaat.cResultOK) {
                sVulScherm();
            } else {
                lbMelding.setText(mMelding);
                sInvulScherm(false);
            }
        } else {
            lbMelding.setText("Ongeldig IP adres");
        }
    }//GEN-LAST:event_btnLeesActionPerformed

    private void txtIP1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIP1FocusLost
        sTestIPField(txtIP1);
    }//GEN-LAST:event_txtIP1FocusLost

    private void txtIP2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIP2FocusLost
        sTestIPField(txtIP2);
    }//GEN-LAST:event_txtIP2FocusLost

    private void txtIP3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIP3FocusLost
        sTestIPField(txtIP3);
    }//GEN-LAST:event_txtIP3FocusLost

    private void txtIP4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIP4FocusLost
        sTestIPField(txtIP4);
    }//GEN-LAST:event_txtIP4FocusLost

    private void txtIP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIP1KeyTyped
        hInputCijfer(evt);
    }//GEN-LAST:event_txtIP1KeyTyped

    private void txtIP2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIP2KeyTyped
        hInputCijfer(evt);
    }//GEN-LAST:event_txtIP2KeyTyped

    private void txtIP3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIP3KeyTyped
        hInputCijfer(evt);
    }//GEN-LAST:event_txtIP3KeyTyped

    private void txtIP4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIP4KeyTyped
        hInputCijfer(evt);
    }//GEN-LAST:event_txtIP4KeyTyped

    private void txtMAC1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMAC1FocusLost
        sTestMACField(txtMAC1);
    }//GEN-LAST:event_txtMAC1FocusLost

    private void txtMAC2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMAC2FocusLost
        sTestMACField(txtMAC2);
    }//GEN-LAST:event_txtMAC2FocusLost

    private void txtMAC3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMAC3FocusLost
        sTestMACField(txtMAC3);
    }//GEN-LAST:event_txtMAC3FocusLost

    private void txtMAC4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMAC4FocusLost
        sTestMACField(txtMAC4);
    }//GEN-LAST:event_txtMAC4FocusLost

    private void txtMAC5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMAC5FocusLost
        sTestMACField(txtMAC5);
    }//GEN-LAST:event_txtMAC5FocusLost

    private void txtMAC6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMAC6FocusLost
        sTestMACField(txtMAC6);
    }//GEN-LAST:event_txtMAC6FocusLost

    private void txtMAC1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMAC1KeyTyped
        hInputHex(evt);
    }//GEN-LAST:event_txtMAC1KeyTyped

    private void txtMAC2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMAC2KeyTyped
        hInputHex(evt);
    }//GEN-LAST:event_txtMAC2KeyTyped

    private void txtMAC3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMAC3KeyTyped
        hInputHex(evt);
    }//GEN-LAST:event_txtMAC3KeyTyped

    private void txtMAC4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMAC4KeyTyped
        hInputHex(evt);
    }//GEN-LAST:event_txtMAC4KeyTyped

    private void txtMAC5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMAC5KeyTyped
        hInputHex(evt);
    }//GEN-LAST:event_txtMAC5KeyTyped

    private void txtMAC6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMAC6KeyTyped
        hInputHex(evt);
    }//GEN-LAST:event_txtMAC6KeyTyped

    private void btnSchrijfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchrijfActionPerformed
        sVerwerkScherm();
    }//GEN-LAST:event_btnSchrijfActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int lResult;

        lResult = sSchrijfSetting(true);
        if (lResult == Resultaat.cResultOK) {
            sVulScherm();
        } else {
            lbMelding.setText(mMelding);
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void hInputCijfer(KeyEvent pEvent) {
        char lInput;

        lInput = pEvent.getKeyChar();
        if (lInput < '0' || lInput > '9') {
            pEvent.consume();
        }
    }

    private void hInputHex(KeyEvent pEvent) {
        char lInput;

        lInput = pEvent.getKeyChar();
        if (!((lInput >= '0' && lInput <= '9') || (lInput >= 'a' && lInput <= 'f') || (lInput >= 'A' && lInput <= 'F'))) {
            pEvent.consume();
        }
    }

    private boolean sTestIPField(JTextField pIP) {
        String lTekst;
        boolean lOK;
        int lComp;

        lTekst = pIP.getText().trim();
        try {
            lComp = Integer.parseInt(lTekst);
            if (lComp < 0 || lComp > 255) {
                lOK = false;
            } else {
                lOK = true;
            }
        } catch (NumberFormatException pExc) {
            lOK = false;
        }
        if (lOK) {
            pIP.setForeground(Color.BLACK);
        } else {
            pIP.setForeground(Color.red);
        }
        return lOK;
    }

    private boolean sTestMACField(JTextField pMAC) {
        String lTekst;
        boolean lOK;

        lTekst = pMAC.getText().trim();
        if (lTekst.length() == 2) {
            if (Setting.xHexToInt(lTekst) < 0) {
                lOK = false;
            } else {
                lOK = true;
            }
        } else {
            lOK = false;
        }
        if (lOK) {
            pMAC.setForeground(Color.BLACK);
        } else {
            pMAC.setForeground(Color.red);
        }
        return lOK;
    }

    private int sLeesSetting() {
        int lResult;
        RestAPI lRest;
        RestAPI.RestResult lAntwoord;
        JSONObject lSettingJ;
        String lResultaat;

        lRest = new RestAPI();
        lRest.xMethod(RestAPI.cMethodGet);
        lRest.xMediaVraag(RestAPI.cMediaTekst);
        lRest.xAktie("");
        lRest.xMediaAntwoord(RestAPI.cMediaJSON);
        lRest.xUrl("http://" + txtIP1.getText() + "." + txtIP2.getText() + "." + txtIP3.getText() + "." + txtIP4.getText() + "/Switch/Setting");
        lAntwoord = lRest.xRoepApi();
        lResult = lAntwoord.xResult();
        mMelding = lAntwoord.xMelding();
        if (lResult == Resultaat.cResultOK) {
            lSettingJ = lAntwoord.xAntwoordJ();
            mSetting.xSetting(lSettingJ);
        }
        return lResult;
    }

    private void sVulScherm() {
        if (mSetting.xGeldig()) {
            lbMelding.setText("");
            txtLAN.setText(mSetting.xLAN());
            cmbLogNiveau.setSelectedIndex(mSetting.xLogNiveau());
            txtMAC1.setText(Setting.xIntToHex(mSetting.xMacPos(0)));
            txtMAC2.setText(Setting.xIntToHex(mSetting.xMacPos(1)));
            txtMAC3.setText(Setting.xIntToHex(mSetting.xMacPos(2)));
            txtMAC4.setText(Setting.xIntToHex(mSetting.xMacPos(3)));
            txtMAC5.setText(Setting.xIntToHex(mSetting.xMacPos(4)));
            txtMAC6.setText(Setting.xIntToHex(mSetting.xMacPos(5)));
            txtNaam.setText(mSetting.xNaam());
            txtOmschr.setText(mSetting.xOmschr());
            txtWachtwoord.setText(mSetting.xWachtwoord());
            chkDrukknop.setSelected(mSetting.xDrukknop());
            sInvulScherm(true);
        } else {
            lbMelding.setText("Ongeldige settings");
            sInvulScherm(false);
        }
    }

    private void sInvulScherm(boolean pEnable) {
        txtLAN.setEnabled(pEnable);
        cmbLogNiveau.setEnabled(pEnable);
        txtMAC1.setEnabled(pEnable);
        txtMAC2.setEnabled(pEnable);
        txtMAC3.setEnabled(pEnable);
        txtMAC4.setEnabled(pEnable);
        txtMAC5.setEnabled(pEnable);
        txtMAC6.setEnabled(pEnable);
        txtNaam.setEnabled(pEnable);
        txtOmschr.setEnabled(pEnable);
        txtWachtwoord.setEnabled(pEnable);
        chkDrukknop.setEnabled(pEnable);
        btnReset.setEnabled(pEnable);
        btnSchrijf.setEnabled(pEnable);
    }

    private void sVerwerkScherm() {
        boolean lOK;
        int lLogNiveau;
        int lResult;

        lOK = sTestScherm();
        if (lOK) {
            mSetting.xNaam(txtNaam.getText().trim());
            mSetting.xOmschr(txtOmschr.getText().trim());
            lLogNiveau = cmbLogNiveau.getSelectedIndex();
            if (lLogNiveau < 0) {
                lLogNiveau = 0;
            }
            mSetting.xLogNiveau(lLogNiveau);
            mSetting.xDrukknop(chkDrukknop.isSelected());
            mSetting.xLAN(txtLAN.getText().trim());
            mSetting.xWachtwoord(txtWachtwoord.getText().trim());
            mSetting.xMacPos(0, Setting.xHexToInt(txtMAC1.getText()));
            mSetting.xMacPos(1, Setting.xHexToInt(txtMAC2.getText()));
            mSetting.xMacPos(2, Setting.xHexToInt(txtMAC3.getText()));
            mSetting.xMacPos(3, Setting.xHexToInt(txtMAC4.getText()));
            mSetting.xMacPos(4, Setting.xHexToInt(txtMAC5.getText()));
            mSetting.xMacPos(5, Setting.xHexToInt(txtMAC6.getText()));

            lResult = sSchrijfSetting(false);
            if (lResult == Resultaat.cResultOK) {
                sVulScherm();
            } else {
                lbMelding.setText(mMelding);
            }
        }
    }

    private boolean sTestScherm() {
        boolean lOK;

        lOK = true;
        if (!sTestMACField(txtMAC1)) {
            lOK = false;
        }
        if (!sTestMACField(txtMAC2)) {
            lOK = false;
        }
        if (!sTestMACField(txtMAC3)) {
            lOK = false;
        }
        if (!sTestMACField(txtMAC4)) {
            lOK = false;
        }
        if (!sTestMACField(txtMAC5)) {
            lOK = false;
        }
        if (!sTestMACField(txtMAC6)) {
            lOK = false;
        }
        if (lOK) {
            lbMelding.setText("");
        } else {
            lbMelding.setText("Onjuiste MAC");
        }
        return lOK;
    }

    private int sSchrijfSetting(boolean pReset) {
        int lResult;
        RestAPI lRest;
        RestAPI.RestResult lAntwoord;
        JSONObject lSettingJ;
        String lResultaat;

        lRest = new RestAPI();
        lRest.xMethod(RestAPI.cMethodPut);
        lRest.xMediaVraag(RestAPI.cMediaJSON);
        if (pReset) {
            lRest.xAktie(mSetting.xSettingReset().toString());
        } else {
            lRest.xAktie(mSetting.xSetting().toString());
        }
        lRest.xMediaAntwoord(RestAPI.cMediaJSON);
        lRest.xUrl("http://" + txtIP1.getText() + "." + txtIP2.getText() + "." + txtIP3.getText() + "." + txtIP4.getText() + "/Switch/Setting");
        lAntwoord = lRest.xRoepApi();
        lResult = lAntwoord.xResult();
        mMelding = lAntwoord.xMelding();
        if (lResult == Resultaat.cResultOK) {
            lSettingJ = lAntwoord.xAntwoordJ();
            mSetting.xSetting(lSettingJ);
        }
        return lResult;
    }

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
            java.util.logging.Logger.getLogger(FrmSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLees;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSchrijf;
    private javax.swing.JCheckBox chkDrukknop;
    private javax.swing.JComboBox<String> cmbLogNiveau;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel lbIP;
    private javax.swing.JLabel lbLAN;
    private javax.swing.JLabel lbLogNiveau;
    private javax.swing.JLabel lbMAC;
    private javax.swing.JLabel lbMelding;
    private javax.swing.JLabel lbNaam;
    private javax.swing.JLabel lbOmschr;
    private javax.swing.JLabel lbWachtwoord;
    private javax.swing.JTextField txtIP1;
    private javax.swing.JTextField txtIP2;
    private javax.swing.JTextField txtIP3;
    private javax.swing.JTextField txtIP4;
    private javax.swing.JTextField txtLAN;
    private javax.swing.JTextField txtMAC1;
    private javax.swing.JTextField txtMAC2;
    private javax.swing.JTextField txtMAC3;
    private javax.swing.JTextField txtMAC4;
    private javax.swing.JTextField txtMAC5;
    private javax.swing.JTextField txtMAC6;
    private javax.swing.JTextField txtNaam;
    private javax.swing.JTextField txtOmschr;
    private javax.swing.JTextField txtWachtwoord;
    // End of variables declaration//GEN-END:variables
}
