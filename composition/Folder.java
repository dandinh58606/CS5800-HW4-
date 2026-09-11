package composition;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folder_name;
    private List<File> files;
    private List<Folder> subfolders;

    public Folder(String name){
        this.folder_name = name;
        this.files = new ArrayList<>();
        this.subfolders = new ArrayList<>();
    }
}
