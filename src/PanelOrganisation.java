import java.awt.*;
import javax.swing.*;

class PanelOrganisation{
    
    private JFrame frame;

    PanelOrganisation(JFrame frame){
        this.frame = frame;
    }

    public void Init() {
        // Create the panel for the left component
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);
        // Add components to the left panel
        JLabel label = new JLabel("This is the left component");
        leftPanel.add(label);

        // Create the panel for the right component
        JPanel rightPanel = new JPanel(new BorderLayout());
        // Add a console screen to the right panel
        JTextArea console = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(console);
        rightPanel.add(scrollPane, BorderLayout.CENTER);

        // Create a split pane with the left and right panels
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setResizeWeight(0.5);

        // Add the split pane to the window
        frame.getContentPane().add(splitPane);
        frame.pack();
        
    }
}