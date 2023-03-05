import java.io.File;
import java.io.IOException;

public class FileCreator {
    public FileCreator(String directoryPath, String fileName) {
        File directory = new File(directoryPath);

        // Check if directory exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            File file = new File(directory, fileName);
            try {
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("File created successfully!");
                } else {
                    if (file.delete() && file.createNewFile()) {
                        System.out.println("File overwritten successfully!");
                    } else {
                        System.out.println("Unable to overwrite file.");
                    }
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
