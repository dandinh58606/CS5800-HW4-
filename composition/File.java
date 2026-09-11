package composition;

public class File {
    private String file_name;
    private String file_type;

    public File(String f_name, String f_type){
        this.file_name = f_name;
        this.file_type = f_type;
    }

    public String get_file_name(){
        return file_name;
    }

    public void set_file_name(String new_name){
        this.file_name = new_name;
    }

    public String get_file_type(){
        return file_type;
    }

    public void set_file_type(String new_type){
        this.file_type = new_type;
    }
}
