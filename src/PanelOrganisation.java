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
        splitPane.setResizeWeight(0); // set resize weight to 0 to keep the left panel at its preferred size
        
        
        // Add the split pane to the window
        frame.getContentPane().add(splitPane);
        
        addConsoleHeader();
        return leftPanel;

    }

    public void addConsoleHeader(){
        JPanel consolePanel = new JPanel();
        consolePanel.setLayout(new BoxLayout(consolePanel, BoxLayout.X_AXIS));

        JLabel consoleLabel = new JLabel("Output");
        JTextField textField = new JTextField();
        textField.setFont(new Font("Calibri", Font.PLAIN, 12));

        consoleLabel.add(textField);
        consolePanel.add(Box.createHorizontalStrut(10));
        consolePanel.add(consoleLabel);
        consolePanel.add(Box.createHorizontalGlue());
        
        rightPanel.add(consolePanel, BorderLayout.EAST);

        rightPanel.add(Box.createVerticalStrut(5)); // add some spacing
    }
}
