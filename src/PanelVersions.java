import java.awt.*;
import javax.swing.*;

public class PanelVersions extends JPanel{
    PanelVersions(JPanel leftPanel){
        
        JLabel label = new JLabel("CMake versions:");
        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 2));
        JPanel comboBoxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 2));
        labelPanel.setMaximumSize(new Dimension(2523,0));
        JComboBox<String> comboBox1 = new JComboBox<String>();
        JComboBox<String> comboBox2 = new JComboBox<String>();
        comboBox1.setPreferredSize(new Dimension(175, 24));
        comboBox2.setPreferredSize(new Dimension(165, 24));
        comboBoxPanel.add(comboBox1);
        comboBoxPanel.add(comboBox2);

        Font font = new Font("Calibri", Font.BOLD, 12);

        comboBox1.setFont(font);
        comboBox2.setFont(font);

        comboBox1.addItem("CMake Version 3.0    ");
        comboBox2.addItem("C++ Standart 11    ");

        labelPanel.add(label);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(labelPanel);
        this.add(Box.createRigidArea(new Dimension(0,5)));
        this.add(comboBoxPanel);

        leftPanel.add(this);
        leftPanel.add(Box.createVerticalStrut(5)); // add some spacing
    }
}
