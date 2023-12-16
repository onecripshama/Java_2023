package ru.mirea.lab17.task2;

import ru.mirea.lab17.task2.Student;
import ru.mirea.lab17.task2.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LabClass {
    private List<Student> students;

    public LabClass() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void sortByAverageScore() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore));
    }

    public Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with full name '" + fullName + "' not found.");
    }
}
