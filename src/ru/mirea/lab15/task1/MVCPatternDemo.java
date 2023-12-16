package ru.mirea.lab15.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = new Employee("John Doe", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateEmployeeDetails("Shamil Aliev", 30.0, 100);
        controller.updateView();
    }}