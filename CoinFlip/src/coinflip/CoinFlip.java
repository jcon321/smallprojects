/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinflip;

import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jconner
 */
public class CoinFlip {

    static JLabel picLabel = new JLabel();
    static ImageIcon heads = new ImageIcon(CoinFlip.class.getResource("/images/pennyHeads.png"));
    static ImageIcon tails = new ImageIcon(CoinFlip.class.getResource("/images/pennyTails.png"));

    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Coin Flip");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setPreferredSize(new Dimension(250, 250));

        JPanel panel = new JPanel();

        picLabel.setIcon(heads);
        panel.add(picLabel);

        frame.getContentPane().add(panel);

        panel.addMouseListener(new MouseEvent());

        //Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CoinFlip cf = new CoinFlip();
                cf.createAndShowGUI();
            }
        });
    }

    public static void setHeads() {
        picLabel.setIcon(heads);
    }

    public static void setTails() {
        picLabel.setIcon(tails);
    }
}

class MouseEvent implements MouseListener {

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        int rnd = 0 + (int) (Math.random() * ((1 - 0) + 1));
        if (rnd == 0) {
            CoinFlip.setTails();
        } else {
            CoinFlip.setHeads();
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }

}
