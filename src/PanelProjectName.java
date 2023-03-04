import java.awt.*;
import javax.swing.*;

public class PanelProjectName {
    PanelProjectName(JPanel leftPanel) {
        // Create a text field
        JPanel projectNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JTextField textField = new JTextField();
        textField.setFont(new Font("Calibri", Font.PLAIN, 12));
        textField.setText("Untitled Project");
        //textField.setMinimumSize(new Dimension(240, 24));

        projectNamePanel.add(textField);
        //textField.setHorizontalAlignment(JTextField.LEFT); // set left alignment
        leftPanel.add(projectNamePanel, BorderLayout.EAST);
        //projectNamePanel.setMinimumSize(new Dimension(150, 100));
        //projectNamePanel.setMaximumSize(new Dimension(150, 100));;

        leftPanel.add(Box.createVerticalStrut(5)); // add some spacing
    }
}
