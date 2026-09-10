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
}
