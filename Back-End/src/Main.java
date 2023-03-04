public class Main {
    public static void main(String[] args) {
        var CMakeManager = new CMakeManager("Untitled Project");
        System.out.println(CMakeManager.getProjectName());
        CMakeManager.addIncDir("/home/inc");
        CMakeManager.addSrcDir("/home/src");

        var incDirs = CMakeManager.getIncDirs();
        for (String incDir : incDirs) {
            System.out.println(incDir);
        }
    }
}
