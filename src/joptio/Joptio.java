/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptio;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Joptio {

    public static void main(String[] args){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(102, 205, 170));
        panel.setSize(new Dimension(200, 64));
        panel.setLayout(null);

        JLabel label = new JLabel("Information Technology");
        label.setBounds(0, 0, 200, 64);
        label.setFont(new Font("Arial", Font.BOLD, 11));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);

        UIManager.put("OptionPane.minimumSize",new Dimension(300, 120));
        JOptionPane.showMessageDialog(null, panel, " Message Dialog", JOptionPane.PLAIN_MESSAGE);
    }
}