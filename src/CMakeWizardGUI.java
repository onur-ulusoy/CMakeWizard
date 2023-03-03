import java.awt.*;
import javax.swing.*;

public class CMakeWizardGUI {

    private JFrame frame;

    public void InitWindow() {
        // Create and set up the window
        frame = new JFrame("CMake Wizard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the size of the window
        int dims[] = {800, 450};
        frame.setPreferredSize(new Dimension(dims[0], dims[1]));
        frame.setResizable(false);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        int centerXY[] = {(screenWidth - dims[0])/2, (screenHeight - dims[1])/2};

        frame.setLocation(centerXY[0], centerXY[1]);
        frame.setVisible(true);

    }

    public void SetUIContents(){
        PanelOrganisation panelOrg = new PanelOrganisation(frame);
        panelOrg.Init();
    }
}
