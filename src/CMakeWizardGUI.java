import java.awt.*;
import javax.swing.*;

public class CMakeWizardGUI {

    private JFrame frame;
    private JPanel panel;

    public void InitWindow() {
        // Create and set up the window
        frame = new JFrame("CMake Wizard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panel and add the components
        panel = new JPanel();

        // Add the panel to the window
        frame.getContentPane().add(panel);
        
        // Set the size of the window
        frame.setPreferredSize(new Dimension(600, 450));
        frame.setResizable(false);

        // Display the window
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
