import java.awt.*;
import javax.swing.*;

public class VersionsPanel{
    VersionsPanel(JPanel leftPanel){
        // Create a panel for the comboboxes and add them to it
        JPanel comboBoxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10)); // horizontal and vertical gap of 10 pixels

        JComboBox<String> comboBox1 = new JComboBox<String>();
        JComboBox<String> comboBox2 = new JComboBox<String>();
        //comboBox1.setPreferredSize(new Dimension(120, 24));
        //comboBox2.setPreferredSize(new Dimension(120, 24));
        comboBoxPanel.add(comboBox1, BorderLayout.EAST);
        comboBoxPanel.add(comboBox2, BorderLayout.EAST);

        Font font = new Font("Calibri", Font.BOLD, 12);

        comboBox1.setFont(font);
        comboBox2.setFont(font);

        comboBox1.addItem("CMake Version 3.0    ");
        comboBox2.addItem("C++ Standart 11    ");

        // Add the combobox panel to the top of the left panel
        leftPanel.add(comboBoxPanel);
        leftPanel.add(Box.createVerticalStrut(5)); // add some spacing
    }
}