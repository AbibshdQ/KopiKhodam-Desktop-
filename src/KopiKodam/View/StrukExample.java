/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KopiKodam.View;

/**
 *
 * @author ASUS ID
 */
import javax.swing.*;
import java.awt.*;

public class StrukExample {

    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Struk Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        
        // Panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        // Panel header
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // Label header
        JLabel headerLabel = new JLabel("Toko ABC");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(headerLabel);
        
        // Panel isi struk
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(0, 2, 10, 10));
        
        // Label item 1
        JLabel item1Label = new JLabel("Item 1");
        JLabel item1ValueLabel = new JLabel("Rp 10.000");
        contentPanel.add(item1Label);
        contentPanel.add(item1ValueLabel);
        
        // Label item 2
        JLabel item2Label = new JLabel("Item 2");
        JLabel item2ValueLabel = new JLabel("Rp 15.000");
        contentPanel.add(item2Label);
        contentPanel.add(item2ValueLabel);
        
        // Label total
        JLabel totalLabel = new JLabel("Total");
        JLabel totalValueLabel = new JLabel("Rp 25.000");
        contentPanel.add(totalLabel);
        contentPanel.add(totalValueLabel);
        
        // Panel footer
        JPanel footerPanel = new JPanel();
        footerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // Label footer
        JLabel footerLabel = new JLabel("Terima kasih telah berbelanja!");
        footerPanel.add(footerLabel);
        
        // Menambahkan panel ke panel utama
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);
        
        // Menambahkan panel utama ke frame
        frame.getContentPane().add(mainPanel);
        
        // Menampilkan frame
        frame.setVisible(true);
    }
}

