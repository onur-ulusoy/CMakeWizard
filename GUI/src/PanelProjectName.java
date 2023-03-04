import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelProjectName {
    PanelProjectName(JPanel leftPanel, JPanel rightPanel) {
        // Create a text field
        JPanel projectNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JLabel projectName = new JLabel("Project name:");

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(230, 20)); // set preferred size to cover entire panel
        textField.setFont(new Font("Calibri", Font.PLAIN, 12));
        textField.setText("Untitled Project");

        // Add an action listener to the text field to listen for the Enter key
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remove the focus from the text field when Enter key is pressed
                leftPanel.requestFocusInWindow();
            }
        });

        // Add a focus listener to the text field to listen for when the field loses focus
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                // Update the value of the text field when the field loses focus
                String value = textField.getText();
                System.out.println("New project name: " + value);
            }
        });

        // Add a mouse listener to the leftPanel to remove the focus from the text field.
        leftPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                leftPanel.requestFocusInWindow();
            }
        });

        // Add a focus listener to rightPanel to listen for when it gains focus
        rightPanel.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                // Remove the focus from the text field when rightPanel gains focus
                textField.transferFocus();
            }
        });
        
        // Add a mouse listener to rightPanel to remove the focus from the text field.
        rightPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                leftPanel.requestFocusInWindow();
            }
        });

        projectNamePanel.add(projectName);
        projectNamePanel.add(textField);
        leftPanel.add(projectNamePanel, BorderLayout.EAST);

        leftPanel.add(Box.createVerticalStrut(5)); // add some spacing
    }
}
