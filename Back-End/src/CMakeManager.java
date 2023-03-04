import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class CMakeManager {
    @Getter @Setter
    private String projectName;

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
}
