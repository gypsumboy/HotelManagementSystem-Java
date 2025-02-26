/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Developers extends JFrame
{
    Developers()
    {
        setLayout(null);
        setVisible(true);
        setSize(600,300);
        setLocation(500,200);

        JLabel developers = new JLabel("DEVELOPERS INFO");
        developers.setForeground(Color.BLACK);
        developers.setFont(new Font("Tahoma", Font.BOLD, 25));
        developers.setBounds(30,30,200,50);
        developers.add(developers);
    }
    public static void main(String[] arg)
    {
        new Developers();
    }
}
