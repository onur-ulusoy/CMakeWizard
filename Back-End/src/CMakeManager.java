import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class CMakeManager {
    @Getter @Setter
    private String projectName;

    @Getter @Setter
    private String projectMainDir;

    @Getter @Setter
    private String projectOutputDir;

    @Setter
    private String minCMakeReq;

    @Setter
    private String cVersion;

    @Getter
    private List<String> srcDirs = new ArrayList<>();

    @Getter
    private List<String> incDirs = new ArrayList<>();


    public CMakeManager(String projectName) {
        this.projectName = projectName;
    }

    public void addSrcDir(String srcDir){
        srcDirs.add(srcDir);
    }

    public void addIncDir(String incDir){
        incDirs.add(incDir);
    }

    public void createParentCMakeLists(){
        new FileCreator(projectMainDir, "CMakeLists.txt");
        
        String contents[] = {minCMakeReq, projectName, cVersion};
        //new MainListContentCreator(projectMainDir, "CMakeLists.txt", contents, srcDirs);
        //String[] contents, List<String> srcDirs

        String content = "trial";
        new MainListContentFiller(projectMainDir, "CMakeLists.txt", content);
    }
}
