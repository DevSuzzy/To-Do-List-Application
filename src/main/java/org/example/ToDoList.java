package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class ToDoList {
    private ArrayList<String> todoList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    private void addTask() {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        todoList.add(task);
        System.out.println("Task added: " + task);
    }

    private void viewTasks() {
        System.out.println("Tasks: ");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + " " + todoList.get(i));
        }
    }

    private void deleteTask() {
        System.out.print("Enter task index: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index > 0 && index <= todoList.size()) {
            System.out.println("Task deleted: " + todoList.remove(index - 1));
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        while (true) {
            System.out.print("What would you like to do? (add/view/delete/exit): ");
            String action = toDoList.scanner.nextLine();
            if (action.equals("add")) {
                toDoList.addTask();
            } else if (action.equals("view")) {
                toDoList.viewTasks();
            } else if (action.equals("delete")) {
                toDoList.deleteTask();
            } else if (action.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid action");
            }
        }
    }
}