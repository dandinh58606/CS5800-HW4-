package inheritance;

public class employee{
    private String first_name;
    private String last_name;
    private String social_security_num;

    public employee(String first_name, String last_name, String ssn){
        this.first_name = first_name;
        this.last_name = last_name;
        this.social_security_num = ssn;
    }

    public String get_firstname(){
        return first_name;
    }

    public String get_lastname(){
        return last_name;
    }

    public String get_ssn(){
        return social_security_num;
    }

    public void set_firstname(String new_name){
        this.first_name = new_name;
    }

    public void set_lastname(String new_name){
        this.last_name = new_name;
    }

    public void set_ssn(String new_ssn){
        this.social_security_num = new_ssn;
    }
}