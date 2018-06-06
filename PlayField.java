/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackJack;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import sun.nio.cs.ext.IBM939;

/**
 *
 * @author userx
 */
public class BlackJackOyunAlanı extends javax.swing.JFrame {

    PlayerCards pc = new PlayerCards();
    int ilkkart = 0;
    int total = 0;
    int totalk = 0;
    ArrayList<Integer> KasaCard = new ArrayList<Integer>();

    int getHandValue(PlayerCards pc, int total) {

        boolean hasAce = false;
        for (int i = 0; i < pc.PlayerCard.size(); i++) {
            total += pc.PlayerCard.get(i);
            if (pc.PlayerCard.get(i) == 11) {
                hasAce = true;
            }
        }
        if (hasAce && total > 21) {
            total = total - 10;   
            if(total>21){
            switch(Collections.frequency(pc.PlayerCard,11)){
                case 2:
                    total=total - 10;
                    break;
                case 3:
                    total=total-20;
                    break;
                case 4:
                    total=total-30;
                    break;
                case 5:
                    total=total-40;
                    break;
                case 6:
                    total=total-50;
                    break;
            }
            }
                
        }
        Oyunculbl.setText("" + total);
        return total;
    }

    int getKasaValue(PlayerCards pc, int totalk) {

        boolean hasAce = false;
        for (int i = 0; i < KasaCard.size(); i++) {
            totalk += KasaCard.get(i);
            if (KasaCard.get(i) == 11) {
                hasAce = true;
            }
        }
        if (hasAce && totalk > 21) {

            totalk = totalk - 10;
            if(totalk>21){
            switch(Collections.frequency(KasaCard,11)){
                case 2:
                    totalk=totalk - 10;
                    break;
                case 3:
                    totalk=totalk-20;
                    break;
                case 4:
                    totalk=totalk-30;
                    break;
                case 5:
                    totalk=totalk-40;
                    break;
                case 6:
                    totalk=totalk-50;
                    break;
            }
            }
            
            
        }
        Kasalbl.setText("" + totalk);
        return totalk;
    }

    void winlosee() {
        winLose wl = new winLose(this);
        if (k > 16 && p <= 21 && k <= 21 && k < p) {
            wl.jLabel1.setText("Oyuncu kazandı!");
            wl.setVisible(true);
            wl.setResizable(false);
            jButton3.setEnabled(false);
            jButton3.setVisible(true);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        } else if (k > 16 && p <= 21 && k <= 21 && p < k) {
            wl.jLabel1.setText("Kasa kazandı!");
            wl.setVisible(true);
            wl.setResizable(false);
            jButton3.setEnabled(false);
            jButton3.setVisible(true);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        } else if (k > 16 && p <= 21 && k <= 21 && p == k) {
            wl.jLabel1.setText("Berabere!");
            wl.setVisible(true);
            wl.setResizable(false);
            jButton3.setEnabled(false);
            jButton3.setVisible(true);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        }

    }
    
    void winlosebj ()
    {
        winLose wl = new winLose(this);
        if (k!=21 && p == 21 ) {
            wl.jLabel1.setText("BlackJack!");
            wl.setVisible(true);
            wl.setResizable(false);
            jButton3.setEnabled(false);
            jButton3.setVisible(true);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        } else if (k == 21 && p == 21) {
            wl.jLabel1.setText("Berabere");
            wl.setVisible(true);
            wl.setResizable(false);
            jButton3.setEnabled(false);
            jButton3.setVisible(true);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        } else if (k==21 && p<21) {
            wl.jLabel1.setText("Kasa Blackjack yaptı!");
            wl.setVisible(true);
            wl.setResizable(false);
            jButton3.setEnabled(false);
            jButton3.setVisible(true);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        }

    }

    void PlayerPatladı() {
        if (p > 21) {

            boom bm = new boom(this);
            bm.setVisible(true);
            bm.setResizable(false);
            jButton3.setEnabled(false);
            jButton3.setVisible(true);
            jButton1.setVisible(false);
            jButton2.setVisible(false);

        }
    }

    void KasaPatladı() {
        if (k > 21) {

            KasaPatladı kp = new KasaPatladı(this);
            kp.setVisible(true);
            kp.setResizable(false);
            jButton3.setEnabled(false);
            jButton3.setVisible(true);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
        }

    }

    void TemizleResim() {
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
    }

    void Temizle() {
        jButton5.setIcon(null);
        jButton6.setIcon(null);
        jButton7.setIcon(null);
        jButton8.setIcon(null);
        jButton9.setIcon(null);
        jButton10.setIcon(null);
        jButton11.setIcon(null);
        jButton12.setIcon(null);
        jButton13.setIcon(null);
        jButton14.setIcon(null);
        jButton15.setIcon(null);
        jButton16.setIcon(null);
        jButton17.setIcon(null);
        jButton18.setIcon(null);
        jButton19.setIcon(null);
        Oyunculbl.setText("");
        Kasalbl.setText("");
        a = 0;
        b = 0;
        p = 0;
        pc.PlayerCard.clear();
        KasaCard.clear();
    }

    void Timer() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(BlackJackOyunAlanı.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Creates new form BlackJackOyunAlanı
     */
    int a = 0;
    Deste d = new Deste();
    int p = 0;
    int k = 0;
    int b = 0;
    int i = 0;

    public BlackJackOyunAlanı() {
        super("Black Jack");
        initComponents1();
        setSize(720, 425);
        TemizleResim();

        jButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (d.deck.size() <= 216) {
                    Collections.shuffle(d.deck);
                    Collections.shuffle(d.Icard);
                }
                TemizleResim();
                Temizle();

                Random rnd = new Random();
                int ilkkart = rnd.nextInt(d.deck.size());
                p = d.deck.get(ilkkart).getValue();
                jButton4.setIcon(d.Icard.get(ilkkart));
                pc.PlayerCard.add(new Integer(p));
                d.Icard.remove(ilkkart);
                d.deck.remove(ilkkart);
                jButton4.setVisible(true);
                Timer();

                ilkkart = rnd.nextInt(d.deck.size());
                jButton5.setIcon(d.Icard.get(ilkkart));
                p = d.deck.get(ilkkart).getValue();
                pc.PlayerCard.add(new Integer(p));
                p = getHandValue(pc, total);
                d.Icard.remove(ilkkart);
                d.deck.remove(ilkkart);
                jButton5.setVisible(true);

                ilkkart = rnd.nextInt(d.deck.size());
                k = d.deck.get(ilkkart).getValue();
                jButton9.setIcon(d.Icard.get(ilkkart));
                KasaCard.add(new Integer(k));
                k = getKasaValue(pc, totalk);
                d.Icard.remove(ilkkart);
                d.deck.remove(ilkkart);
                jButton9.setVisible(true);

                a = 4;
                b = 1;

                if (p == 21) {
                    ilkkart = rnd.nextInt(d.deck.size());
                    jButton10.setIcon(d.Icard.get(ilkkart));
                    k = d.deck.get(ilkkart).getValue();
                    KasaCard.add(new Integer(k));
                    k = getKasaValue(pc, totalk);
                    d.Icard.remove(ilkkart);
                    d.deck.remove(ilkkart);
                    jButton10.setVisible(true);                   
                    winlosebj();
                }
                else{
                jButton1.setVisible(true);
                jButton2.setVisible(true);
                jButton3.setVisible(false);
                }
            
          }
        });

        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (a < 5) {
                    Random rnd = new Random();
                    int ilkkart = 0;

                    ilkkart = rnd.nextInt(d.deck.size());
                    jButton6.setIcon(d.Icard.get(ilkkart));
                    p = d.deck.get(ilkkart).getValue();
                    pc.PlayerCard.add(new Integer(p));
                    p = getHandValue(pc, total);
                    d.Icard.remove(ilkkart);
                    d.deck.remove(ilkkart);
                    jButton6.setVisible(true);
                    Timer();
                    winlosee();
                    PlayerPatladı();
                    a = 5;
                } else {
                    if (a == 5) {
                        int ilkkart = 0;
                        jButton7.setIcon(d.Icard.get(ilkkart));
                        p = d.deck.get(ilkkart).getValue();
                        pc.PlayerCard.add(new Integer(p));
                        p = getHandValue(pc, total);
                        d.Icard.remove(ilkkart);
                        d.deck.remove(ilkkart);
                        jButton7.setVisible(true);
                        Timer();
                        winlosee();
                        PlayerPatladı();
                        a = 6;
                    } else {
                        if (a == 6) {
                            int ilkkart = 0;
                            jButton8.setIcon(d.Icard.get(ilkkart));
                            p = d.deck.get(ilkkart).getValue();
                            pc.PlayerCard.add(new Integer(p));
                            p = getHandValue(pc, total);
                            d.Icard.remove(ilkkart);
                            d.deck.remove(ilkkart);
                            jButton8.setVisible(true);
                            Timer();
                            winlosee();
                            PlayerPatladı();
                            a = 7;
                        } else {
                            if (a == 7) {
                                int ilkkart = 0;
                                jButton17.setIcon(d.Icard.get(ilkkart));
                                p = d.deck.get(ilkkart).getValue();
                                pc.PlayerCard.add(new Integer(p));
                                p = getHandValue(pc, total);
                                d.Icard.remove(ilkkart);
                                d.deck.remove(ilkkart);
                                jButton17.setVisible(true);
                                Timer();
                                winlosee();
                                PlayerPatladı();
                                a = 8;
                            } else {
                                if (a == 8) {
                                    jButton18.setIcon(d.Icard.get(ilkkart));
                                    p = d.deck.get(ilkkart).getValue();
                                    pc.PlayerCard.add(new Integer(p));
                                    p = getHandValue(pc, total);
                                    d.Icard.remove(ilkkart);
                                    d.deck.remove(ilkkart);
                                    jButton18.setVisible(true);
                                    Timer();
                                    winlosee();
                                    PlayerPatladı();
                                    a = 9;

                                } else {
                                    if (a == 9) {
                                        jButton19.setIcon(d.Icard.get(ilkkart));
                                        p = d.deck.get(ilkkart).getValue();
                                        pc.PlayerCard.add(new Integer(p));
                                        p = getHandValue(pc, total);
                                        d.Icard.remove(ilkkart);
                                        d.deck.remove(ilkkart);
                                        jButton19.setVisible(true);
                                        Timer();
                                        winlosee();
                                        PlayerPatladı();
                                        a = 10;
                                    }

                                }
                            }
                        }

                    }
                }

            }

        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();
                int ilkkart = 0;
                ilkkart = rnd.nextInt(d.deck.size());
                k = d.deck.get(ilkkart).getValue();
                jButton10.setIcon(d.Icard.get(ilkkart));
                KasaCard.add(new Integer(k));
                k = getKasaValue(pc, totalk);
                d.Icard.remove(ilkkart);
                d.deck.remove(ilkkart);
                jButton10.setVisible(true);
                Timer();
                winlosee();
                if (k < 17) {
                    ilkkart = rnd.nextInt(d.deck.size());
                    jButton11.setIcon(d.Icard.get(ilkkart));
                    k = d.deck.get(ilkkart).getValue();
                    KasaCard.add(new Integer(k));
                    k = getKasaValue(pc, totalk);
                    d.Icard.remove(ilkkart);
                    d.deck.remove(ilkkart);
                    jButton11.setVisible(true);
                    Timer();
                    winlosee();
                    KasaPatladı();
                    if (k < 17) {
                        ilkkart = rnd.nextInt(d.deck.size());
                        jButton12.setIcon(d.Icard.get(ilkkart));
                        k = d.deck.get(ilkkart).getValue();
                        KasaCard.add(new Integer(k));
                        k = getKasaValue(pc, totalk);
                        d.Icard.remove(ilkkart);
                        d.deck.remove(ilkkart);
                        jButton12.setVisible(true);
                        Timer();
                        winlosee();
                        KasaPatladı();
                        if (k < 17) {
                            ilkkart = rnd.nextInt(d.deck.size());
                            jButton13.setIcon(d.Icard.get(ilkkart));
                            k = d.deck.get(ilkkart).getValue();
                            KasaCard.add(new Integer(k));
                            k = getKasaValue(pc, totalk);
                            d.Icard.remove(ilkkart);
                            d.deck.remove(ilkkart);
                            jButton13.setVisible(true);
                            Timer();
                            winlosee();
                            KasaPatladı();
                        }
                        if (k < 17) {
                            ilkkart = rnd.nextInt(d.deck.size());
                            jButton14.setIcon(d.Icard.get(ilkkart));
                            k = d.deck.get(ilkkart).getValue();
                            KasaCard.add(new Integer(k));
                            k = getKasaValue(pc, totalk);
                            d.Icard.remove(ilkkart);
                            d.deck.remove(ilkkart);
                            jButton14.setVisible(true);
                            Timer();
                            winlosee();
                            KasaPatladı();
                        }
                        if (k < 17) {
                            ilkkart = rnd.nextInt(d.deck.size());
                            jButton15.setIcon(d.Icard.get(ilkkart));
                            k = d.deck.get(ilkkart).getValue();
                            KasaCard.add(new Integer(k));
                            k = getKasaValue(pc, totalk);
                            d.Icard.remove(ilkkart);
                            d.deck.remove(ilkkart);
                            jButton15.setVisible(true);
                            Timer();
                            winlosee();
                            KasaPatladı();
                        }
                        if (k < 17) {
                            ilkkart = rnd.nextInt(d.deck.size());
                            jButton16.setIcon(d.Icard.get(ilkkart));
                            k = d.deck.get(ilkkart).getValue();
                            KasaCard.add(new Integer(k));
                            k = getKasaValue(pc, totalk);
                            d.Icard.remove(ilkkart);
                            d.deck.remove(ilkkart);
                            jButton16.setVisible(true);
                            Timer();
                            winlosee();
                            KasaPatladı();
                        }

                    }
                }

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        Kasalbl = new javax.swing.JLabel();
        Oyunculbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\userx\\Desktop\\blackjack project\\b.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 300, 40, 40);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\userx\\Desktop\\blackjack project\\a.jpg")); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 300, 40, 40);

        jButton3.setText("Dağıt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 270, 73, 23);

        jLabel2.setText("Oyuna başlamak için Dağıt'a basınız!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 340, 200, 14);

        jButton4.setAlignmentY(0.0F);
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton4.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton4.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(340, 280, 40, 60);

        jButton5.setAlignmentY(0.0F);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 270, 40, 60);

        jButton6.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton6.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton6.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(360, 260, 40, 60);

        jButton7.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton7.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton7.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(370, 250, 40, 60);

        jButton8.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton8.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton8.setPreferredSize(new java.awt.Dimension(38, 54));
        getContentPane().add(jButton8);
        jButton8.setBounds(380, 240, 40, 60);

        jButton9.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton9.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton9.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(400, 90, 40, 60);

        jButton10.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton10.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton10.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(390, 90, 40, 60);

        jButton11.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton11.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton11.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(380, 90, 40, 60);

        jButton12.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton12.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton12.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(370, 90, 40, 60);

        jButton13.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton13.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton13.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(360, 90, 40, 60);

        jButton14.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton14.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton14.setPreferredSize(new java.awt.Dimension(38, 54));
        getContentPane().add(jButton14);
        jButton14.setBounds(350, 90, 40, 60);
        getContentPane().add(jButton15);
        jButton15.setBounds(340, 90, 40, 60);
        getContentPane().add(jButton16);
        jButton16.setBounds(330, 90, 40, 60);
        getContentPane().add(jButton17);
        jButton17.setBounds(390, 230, 40, 60);
        getContentPane().add(jButton18);
        jButton18.setBounds(400, 220, 40, 60);
        getContentPane().add(jButton19);
        jButton19.setBounds(410, 210, 40, 60);

        Kasalbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Kasalbl);
        Kasalbl.setBounds(350, 160, 40, 30);

        Oyunculbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Oyunculbl);
        Oyunculbl.setBounds(300, 260, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\userx\\Desktop\\blackjack project\\Blackjack-Games2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(BlackJackOyunAlanı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJackOyunAlanı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJackOyunAlanı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJackOyunAlanı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJackOyunAlanı().setVisible(true);
            }
        });
    }

    private void initComponents1() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        Kasalbl = new javax.swing.JLabel();
        Oyunculbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\userx\\Desktop\\blackjack project\\b.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 300, 40, 40);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\userx\\Desktop\\blackjack project\\a.jpg")); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 300, 40, 40);

        jButton3.setText("Dağıt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 270, 73, 23);

        jLabel2.setText("Oyuna başlamak için Dağıt'a basınız!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 340, 200, 14);

        jButton4.setAlignmentY(0.0F);
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton4.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton4.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(340, 280, 40, 60);

        jButton5.setAlignmentY(0.0F);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 270, 40, 60);

        jButton6.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton6.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton6.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(360, 260, 40, 60);

        jButton7.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton7.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton7.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(370, 250, 40, 60);

        jButton8.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton8.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton8.setPreferredSize(new java.awt.Dimension(38, 54));
        getContentPane().add(jButton8);
        jButton8.setBounds(380, 240, 40, 60);

        jButton9.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton9.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton9.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(400, 90, 40, 60);

        jButton10.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton10.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton10.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(390, 90, 40, 60);

        jButton11.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton11.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton11.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(380, 90, 40, 60);

        jButton12.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton12.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton12.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(370, 90, 40, 60);

        jButton13.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton13.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton13.setPreferredSize(new java.awt.Dimension(38, 54));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(360, 90, 40, 60);

        jButton14.setMaximumSize(new java.awt.Dimension(38, 54));
        jButton14.setMinimumSize(new java.awt.Dimension(38, 54));
        jButton14.setPreferredSize(new java.awt.Dimension(38, 54));
        getContentPane().add(jButton14);
        jButton14.setBounds(350, 90, 40, 60);
        getContentPane().add(jButton15);
        jButton15.setBounds(340, 90, 40, 60);
        getContentPane().add(jButton16);
        jButton16.setBounds(330, 90, 40, 60);
        getContentPane().add(jButton17);
        jButton17.setBounds(390, 230, 40, 60);
        getContentPane().add(jButton18);
        jButton18.setBounds(400, 220, 40, 60);
        getContentPane().add(jButton19);
        jButton19.setBounds(410, 210, 40, 60);

        Kasalbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Kasalbl);
        Kasalbl.setBounds(350, 160, 40, 30);

        Oyunculbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Oyunculbl);
        Oyunculbl.setBounds(300, 260, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\userx\\Desktop\\blackjack project\\Blackjack-Games2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 390);
        jButton1.setVisible(false);
        jButton2.setVisible(false);

        pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Kasalbl;
    public javax.swing.JLabel Oyunculbl;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
