/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackJack;

import javax.swing.JFrame;

/**
 *
 * @author userx
 */
public class BlackJackmain {

    public static void main(String[] args) {
        BlackJackOyunAcılmaSayfası bja = new BlackJackOyunAcılmaSayfası();
        bja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bja.setVisible(true);
        bja.setResizable(true);

    }
}
