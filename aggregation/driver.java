package aggregation;

public class driver {
    public static void main(String[] args) {
        Instructor prof = new Instructor("Numa", "Davarpanah", "8-03");
        Textbook book = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        Course cs5800 = new Course("CS 5800 - Advanced Software Engineering", prof, book);

        cs5800.print();

        cs5800.add_Instructor(new Instructor("John", "Smith", "Rm 801"));
        cs5800.add_Textbook(new Textbook("How to Code", "Jane Seymour", "Stereotypical Publishing"));

        cs5800.print();
    }
}
