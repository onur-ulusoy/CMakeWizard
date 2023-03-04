import java.awt.*;
import javax.swing.*;

public class CMakeWizardGUI extends JFrame{

    //private JFrame frame;
    private JPanel leftPanel;
    private JPanel rightPanel;


    public void InitWindow() {
        // Create and set up the window
        this.setTitle("CMakeWizard");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the size of the window
        int dims[] = {800, 450};
        this.setPreferredSize(new Dimension(dims[0], dims[1]));
        this.setResizable(false);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        int centerXY[] = {(screenWidth - dims[0])/2, (screenHeight - dims[1])/2};

        this.setLocation(centerXY[0], centerXY[1]);
        this.setVisible(true);

    }

    public void SetUIContents(){
        PanelOrganisation panelOrg = new PanelOrganisation(this);
        JPanel panels[];
        
        panels = panelOrg.Init();
        leftPanel = panels[0];
        rightPanel = panels[1];
        leftPanel.setBackground(new Color(238,238,238));

        PanelSettings sp = new PanelSettings(leftPanel, rightPanel);
        sp.addSettingsHeader();
        sp.addProjectName();
        sp.addVersions();
    }

    public void setFramePacked(){
        this.pack();
    }
}
