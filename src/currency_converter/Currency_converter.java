/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package currency_converter;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author admodev
 */
public class Currency_converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter 2021");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(800, 400);
        
        JMenuBar mb = new JMenuBar();       
        JMenu m1 = new JMenu("Moneda");       
        JMenu m2 = new JMenu("Ayuda");       
        mb.add(m1);       
        mb.add(m2);       
        JMenuItem m11 = new JMenuItem("Moneda para convertir");       
        JMenuItem m22 = new JMenuItem("Moneda a la que desea convertir");       
        m1.add(m11);       
        m1.add(m22);
        
        JPanel panel = new JPanel();     
        JLabel label = new JLabel("Introducir cantidad");       
        JTextField tf = new JTextField(100);
        JButton send = new JButton("Convertir");       
        JButton reset = new JButton("Restablecer");       
        panel.add(label);
        panel.add(label);
        panel.add(tf);       
        panel.add(send);       
        panel.add(reset);        
 
        // Área de texto en el centro    
        JTextArea ta = new JTextArea();        
 
        // Agregar componentes al marco.      
        frame.getContentPane().add(BorderLayout.SOUTH, panel);       
        frame.getContentPane().add(BorderLayout.NORTH, mb);       
        frame.getContentPane().add(BorderLayout.CENTER, ta);       
        frame.setVisible(true); 
    }
    
}
