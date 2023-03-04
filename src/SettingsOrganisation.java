import java.awt.*;
import javax.swing.*;

public class SettingsOrganisation {

    private JPanel leftPanel;
    SettingsOrganisation(JPanel leftPanel){
        this.leftPanel = leftPanel;
    }

    public void addSettingsHeader(){
        JPanel projectNamePanel = new JPanel();
        projectNamePanel.setLayout(new BoxLayout(projectNamePanel, BoxLayout.X_AXIS));

        JLabel projectNameLabel = new JLabel("CMake Settings");
        JTextField textField = new JTextField();
        textField.setFont(new Font("Calibri", Font.PLAIN, 12));

        projectNameLabel.add(textField);
        projectNamePanel.add(Box.createHorizontalStrut(10));
        projectNamePanel.add(projectNameLabel);
        projectNamePanel.add(Box.createHorizontalGlue());
        
        leftPanel.add(projectNamePanel, BorderLayout.EAST);

        leftPanel.add(Box.createVerticalStrut(5)); // add some spacing
    }

    public void addProjectName(){
        new PanelProjectName(leftPanel);
    }

    public void addVersions(){
        new PanelVersions(leftPanel);
    }

}
