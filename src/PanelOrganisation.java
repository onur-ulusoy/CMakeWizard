import java.awt.*;
import javax.swing.*;

class PanelOrganisation{

    private JFrame frame;

    PanelOrganisation(JFrame frame){
        this.frame = frame;
    }

    public JPanel Init() {
        // Create the panel for the left component
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);

        // Create the panel for the right component
        JPanel rightPanel = new JPanel(new BorderLayout());
        // Add a console header to the right panel
        JLabel header = new JLabel("Output:");
        Font headerFont = new Font("Consolas", Font.BOLD, 12);
        header.setFont(headerFont);
        rightPanel.add(header, BorderLayout.NORTH);
        // Add a console screen to the right panel
        JTextArea console = new JTextArea();
        console.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(console);
        rightPanel.add(scrollPane, BorderLayout.CENTER);

        // Create a split pane with the left and right panels
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setResizeWeight(0);
        
        // Add the split pane to the window
        frame.getContentPane().add(splitPane);

        return leftPanel;

    }
}
