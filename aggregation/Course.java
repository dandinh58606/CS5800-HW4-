package aggregation;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String course_name;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;

    public Course(String class_name, Instructor main_instructor, Textbook book){
        this.course_name = class_name;
        this.instructors = new ArrayList<>();
        this.textbooks = new ArrayList<>();

        add_Instructor(main_instructor);
        add_Textbook(book);
    }

    public String get_course_name(){
        return course_name;
    }

    public void set_course_name(String new_course){
        this.course_name = new_course;
    }

    public void add_Instructor(Instructor new_instructor){
        if(new_instructor != null){
            this.instructors.add(new_instructor);
        }
    }

    public void add_Textbook(Textbook new_book){
        if(new_book != null){
            this.textbooks.add(new_book);
        }
    }

    public void print(){
        System.out.println("Course: " + course_name);

        System.out.println("Instructors: ");
        for(Instructor inst : instructors){
            System.out.println(" - " + inst.get_first_name() + " " + inst.get_last_name());
        }

        System.out.println("Textbooks: ");
        for(Textbook txtbk : textbooks){
            System.out.println(" - " + txtbk.get_title() + " by " + txtbk.get_author());
        }
    }
}
