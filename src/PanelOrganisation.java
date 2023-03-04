import java.awt.*;
import javax.swing.*;

class PanelOrganisation{

    private JFrame frame;
    private JPanel leftPanel;
    private JPanel rightPanel;

    PanelOrganisation(JFrame frame){
        this.frame = frame;
    }

    public JPanel Init() {
        // Create the panel for the left component
        leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS)); // set BoxLayout with Y_AXIS orientation

        // Add some spacing
        leftPanel.add(Box.createVerticalStrut(10));
        rightPanel = new JPanel();
        // Create a split pane with the left and right panels
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel); // set the right panel to an empty JPanel
        splitPane.setResizeWeight(0); // set resize weight to 1 to keep the left panel at its preferred size
        
        
        // Add the split pane to the window
        frame.getContentPane().add(splitPane);
        addSettingsHeader();
        addConsoleHeader();
        return leftPanel;

    }

    public void addSettingsHeader(){
        // Create a text field
        JLabel projectNamePanel = new JLabel("CMake Settings");
        JTextField textField = new JTextField();
        textField.setFont(new Font("Calibri", Font.PLAIN, 12));
/*         textField.setHorizontalAlignment(0);
        textField.setAlignmentX(1); */
        //textField.setMinimumSize(new Dimension(240, 24));

        projectNamePanel.add(textField);
        //textField.setHorizontalAlignment(JTextField.LEFT); // set left alignment
        leftPanel.add(projectNamePanel, BorderLayout.EAST);
        //projectNamePanel.setMinimumSize(new Dimension(150, 100));
        //projectNamePanel.setMaximumSize(new Dimension(150, 100));;

        leftPanel.add(Box.createVerticalStrut(5)); // add some spacing
    }

    public void addConsoleHeader(){
        // Create a text field
        JLabel projectNamePanel = new JLabel("Output");
        JTextField textField = new JTextField();
        textField.setFont(new Font("Calibri", Font.PLAIN, 12));
/*         textField.setHorizontalAlignment(0);
        textField.setAlignmentX(1); */
        //textField.setMinimumSize(new Dimension(240, 24));

        projectNamePanel.add(textField);
        //textField.setHorizontalAlignment(JTextField.LEFT); // set left alignment
        rightPanel.add(projectNamePanel, BorderLayout.EAST);
        //projectNamePanel.setMinimumSize(new Dimension(150, 100));
        //projectNamePanel.setMaximumSize(new Dimension(150, 100));;

        leftPanel.add(Box.createVerticalStrut(5)); // add some spacing
    }
}
