package ru.mirea.lab15.task2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);
        controller.start();
    }
}