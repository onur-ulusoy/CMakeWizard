import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainListContentFiller {
    public MainListContentFiller(String directoryPath, String fileName, String content) {
        File directory = new File(directoryPath);

        // Check if directory exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            File file = new File(directory, fileName);

            // Check if file exists and is a file
            if (file.exists() && file.isFile()) {
                try (FileWriter writer = new FileWriter(file)) {
                    
                    writer.write(content);
                    System.out.println("File content written successfully!");
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file.");
                    e.printStackTrace();
                }
            } else {
                System.out.println("File does not exist or is not a file.");
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
