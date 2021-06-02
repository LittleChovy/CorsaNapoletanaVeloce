package com.company;

import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {

        ImageIcon Image = new ImageIcon("Senza titolo.png");

        JFrame frame = new JFrame();
        JLabel titolo = new JLabel();
        JLabel immagine = new JLabel();


        immagine.setIcon(Image);

        immagine.setHorizontalAlignment(JLabel.CENTER);
        immagine.setVerticalAlignment(JLabel.CENTER);

        titolo.setText(" CORSA SBROCCATA NAPOLETANA VELOCE \"LEGALE\" ");
        titolo.setHorizontalAlignment(JLabel.CENTER);
        titolo.setVerticalAlignment(JLabel.TOP);
        titolo.setForeground(Color.YELLOW);
        titolo.setFont(new Font("Verdana", Font.ITALIC,20));


        frame.setVisible(true);
        frame.setSize(700,800);
        frame.setTitle("Corsa Napoletana");
        frame.setResizable(false); // non può essere modificata la grandezza della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //esce dall'app appena la chiudi

        frame.add(titolo);
        frame.add(immagine);

        frame.getContentPane().setBackground(Color.black);
        frame.setIconImage(Image.getImage());

    }

}
