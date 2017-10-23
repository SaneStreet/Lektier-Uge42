package wexr.Opgave10_9;

public class Main {
    public static void main(String[] args) {
        // Create a course
        Course nyFag = new Course("math101");

        // Add three students
        nyFag.addStudent("Benjamin");
        nyFag.addStudent("Matthias");
        nyFag.addStudent("Jesper");

        // remove one student
        nyFag.dropStudent("Jesper");

        // Displays the students in the course
        System.out.println("\nThe students in the course " +
                nyFag.getCourseName() + ":");
        String[] students = nyFag.getStudents();
        for (int i = 0; i < nyFag.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}
