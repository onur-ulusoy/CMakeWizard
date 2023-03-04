public class Main {
    public static void main(String[] args) {
        var CMakeManager = new CMakeManager("Untitled Project");
        CMakeManager.setProjectMainDir("/home/onur/Desktop/New Folder");
        CMakeManager.createParentCMakeLists();
    }
}
