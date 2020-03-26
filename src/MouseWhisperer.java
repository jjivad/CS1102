/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIJ Global
 */
import java.awt.event.*;
import javax.swing.*;

public class MouseWhisperer extends JFrame implements MouseListener {
    MouseWhisperer() {
        super("COME CLOSER");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) { setTitle("OUCH"); }
    @Override
    public void mousePressed(MouseEvent e) { setTitle("LET GO"); }
    @Override
    public void mouseReleased(MouseEvent e) { setTitle("WHEW"); }
    @Override
    public void mouseEntered(MouseEvent e) { setTitle("I SEE YOU"); }
    @Override
    public void mouseExited(MouseEvent e) { setTitle("COME CLOSER"); }
    
    public static void main(String[] args) { new MouseWhisperer(); }
}
