package aggregation;

public class Instructor {
    private String first_name;
    private String last_name;
    private String office_number;

    public Instructor(String first, String last, String office_num){
        this.first_name = first;
        this.last_name = last;
        this.office_number = office_num;
    }

    public String get_first_name(){
        return first_name;
    }

    public void set_first_name(String new_first){
        this.first_name = new_first;
    }

    public String get_last(){
        return last_name;
    }

    public void set_last_name(String new_last){
        this.last_name = new_last;
    }

    public String get_office_number(){
        return office_number;
    }

    public void set_office_number(String new_room){
        this.office_number = new_room;
    }
}
