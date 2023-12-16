package ru.mirea.lab11;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    // Упражнение 1
    public static void insertionSortByIDNumber(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].iDNumber > current.iDNumber) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    // Упражнение 2
    static class SortingStudentsByGPA implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s2.getGPA(), s1.getGPA());
        }
    }

    public static void quickSortByGPA(Student[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        double pivot = arr[middle].GPA;
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].GPA < pivot) {
                i++;
            }
            while (arr[j].GPA > pivot) {
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSortByGPA(arr, low, j);
        }
        if (high > i) {
            quickSortByGPA(arr, i, high);
        }
    }

    // Упражнение 3
    public static Student[] mergeSortStudents(Student[] arr1, Student[] arr2) {
        Student[] merged = new Student[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        Arrays.sort(merged, new SortingStudentsByGPA());
        return merged;
    }

    public static void main(String[] args) {
        // Упражнение 1
        Student[] students = {new Student(3, 3.5), new Student(1, 3.9), new Student(2, 3.7)};
        insertionSortByIDNumber(students);
        System.out.println("Sorted by ID number:");
        for (Student student : students) {
            System.out.println("ID: " + student.iDNumber + ", GPA: " + student.GPA);
        }

        // Упражнение 2
        Student[] students2 = {new Student(101, 3.8), new Student(102, 3.6), new Student(103, 3.9)};
        quickSortByGPA(students2, 0, students2.length - 1);
        System.out.println("\nSorted by GPA:");
        for (Student student : students2) {
            System.out.println("ID: " + student.iDNumber + ", GPA: " + student.GPA);
        }

        // Упражнение 3
        Student[] mergedStudents = mergeSortStudents(students, students2);
        System.out.println("\nMerged and sorted by GPA:");
        for (Student student : mergedStudents) {
            System.out.println("ID: " + student.iDNumber + ", GPA: " + student.GPA);
        }
    }
}
