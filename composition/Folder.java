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

    public String get_folder_name(){
        return folder_name;
    }

    public void set_folder_name(String new_name){
        this.folder_name = new_name;
    }

    public void add_File(File new_file){
        if(new_file != null){
            this.files.add(new_file);
        }
    }

    public void add_Folder(Folder new_subfolder){
        if(new_subfolder != null){
            this.subfolders.add(new_subfolder);
        }
    }

    public void print() {
        print("");
    }

    public void print(String spacing){
        System.out.println(spacing + "📁 " + folder_name);
        for(File file: files){
            System.out.print(spacing + "  📄 ");
            file.print();
        }
        for(Folder folder : subfolders){
            folder.print(spacing + "  ");
        }
    }

    public void deleteFolder() {
        for(Folder sub: subfolders){
            sub.deleteFolder();
        }

        subfolders.clear();
        files.clear();
    }

    public boolean deleteSubFolder(String targetName) {
    for (int i = 0; i < subfolders.size(); i++) {
        Folder sub = subfolders.get(i);
        if (sub.get_folder_name().equalsIgnoreCase(targetName)) {
            sub.deleteFolder(); 
            subfolders.remove(i); 
            return true;
        }
    }
    for (Folder sub : subfolders) {
        if (sub.deleteSubFolder(targetName)) {
            return true;
            }
        }
        return false;
    }
}
