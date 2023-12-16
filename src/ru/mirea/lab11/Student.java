package ru.mirea.lab11;

public class Student {
    int iDNumber;
    double GPA;

    public Student(int iDNumber, double GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }
}
