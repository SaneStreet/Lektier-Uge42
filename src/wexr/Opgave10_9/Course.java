package wexr.Opgave10_9;

public class Course {
        private String courseName;
        private String[] students = new String[1];
        private int numberOfStudents;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void addStudent(String student) {
            // Forøger automatisk array størrelse.
            if (numberOfStudents == students.length) {
                String[] a = new String[students.length + 1];
                for (int i = 0; i < numberOfStudents; i++) {
                    a[i] = students[i];
                }
                students = a;
            }
            students[numberOfStudents] = student;
            numberOfStudents++;
        }

        public String[] getStudents() {
            return students;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public String getCourseName() {
            return courseName;
        }

        // Fjerner en student fra course.
        public void dropStudent(String student) {
            int index = findStudent(student);
            if (index >= 0) {
                dropStudent(index);
            }
            else {
                System.out.println(student + " is not in the course: " + courseName);
            }
        }

        // sletter en student
        private void dropStudent(int index) {
            String[] s = new String[students.length - 1];
            for (int i = 0, j = 0; i < s.length; i++, j++) {
                if (i == index) {
                    j++;
                }
                s[i] = students[j];
            }
            this.students = s;
            numberOfStudents--;
        }

        // fjerner alle students fra course
        public void clear() {
            students = new String[1];
            numberOfStudents = 0;
        }

        // Returnere index hvis student er fundet, ellers return -1
        private int findStudent(String student) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (students[i].equals(student)) {
                    return i;
                }
            }
            return -1;
        }
    }
