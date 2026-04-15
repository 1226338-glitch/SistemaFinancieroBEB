package com.sistemasfinancieros.view;

import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        // Set the title of the dashboard
        setTitle("Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the main layout
        setLayout(new BorderLayout());

        // Create sidebar menu
        JPanel sidebar = new JPanel();
        sidebar.setBackground(Color.GRAY);
        sidebar.setPreferredSize(new Dimension(200, 0));

        // Add sidebar items (this is a placeholder)
        sidebar.add(new JLabel("Menu Item 1"));
        sidebar.add(new JLabel("Menu Item 2"));
        sidebar.add(new JLabel("Menu Item 3"));

        // Create header
        JPanel header = new JPanel();
        header.setBackground(Color.LIGHT_GRAY);
        header.add(new JLabel("Dashboard Header"));

        // Create content panel with statistical cards
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 2)); // 2x2 grid for statistical cards
        
        for (int i = 1; i <= 4; i++) {
            JPanel card = new JPanel();
            card.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            card.add(new JLabel("Statistical Card " + i));
            contentPanel.add(card);
        }

        // Add components to the main frame
        add(sidebar, BorderLayout.WEST);
        add(header, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DashboardFrame frame = new DashboardFrame();
            frame.setVisible(true);
        });
    }
}