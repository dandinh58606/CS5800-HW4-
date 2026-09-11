package aggregation;

public class Course {
    private String course_name;
    private Instructor[] instructors;
    private Textbook[] textbooks;

    public Course(String class_name, Instructor[] instructor_list, Textbook[] book_list){
        this.course_name = class_name;
        this.instructors = instructor_list;
        this.textbooks = book_list;
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
