import java.util.Arrays;

public class Program1 {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Program1(String courseName) {
        this.courseName = courseName;
        this.students = new String[1]; // Initial size of the array is 1
        this.numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            // If the array is full, create a new larger array
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        int index = indexOf(student);
        if (index != -1) {
            // Shift the elements to remove the student
            System.arraycopy(students, index + 1, students, index, numberOfStudents - index - 1);
            numberOfStudents--;
        }
    }

    public void clear() {
        // creating a new array with the initial size
        students = new String[1];
        numberOfStudents = 0;
    }

    public String[] getStudents() {
        // Create a new array with the exact size needed
        return Arrays.copyOf(students, numberOfStudents);
    }

    private int indexOf(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Program1 course = new Program1("Computer Science");

        // Add three students
        course.addStudent("Man Deep");
        course.addStudent("Alex Moreno");
        course.addStudent("Khalifa Octopus");

        // the students in the course
        System.out.println("Students in the course: " + Arrays.toString(course.getStudents()));

        // Remove one student
        course.dropStudent("Khalifa Octopus");

        // the students in the course after removing one
        System.out.println("Students in the course after removing one: " + Arrays.toString(course.getStudents()));

        // removing all student
        course.clear();

        // Showing the student in the course after clearing
        System.out.println("Students in the course after clearing: " + Arrays.toString(course.getStudents()));
    }
}
