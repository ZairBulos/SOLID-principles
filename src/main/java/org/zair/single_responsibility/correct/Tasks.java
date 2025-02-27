package org.zair.single_responsibility.correct;

import java.util.List;

// ✅ Después: Aplicando SRP
public class Tasks {

    private List<String> tasks;

    public Tasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String taskDescription) {
        this.tasks.add(taskDescription);
        System.out.println("Task added: " + taskDescription);
    }

    public void removeTask(Integer taskIndex) {
        if (taskIndex >= 0 && taskIndex < this.tasks.size()) {
            String task = tasks.get(taskIndex);
            this.tasks.remove(taskIndex);
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void completeTask(Integer taskIndex) {
        if (taskIndex >= 0 && taskIndex < this.tasks.size()) {
            String task = tasks.get(taskIndex);
            tasks.set(taskIndex, task + " (completed)");
            System.out.println("Task marked as completed: " + task);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void listTasks() {
        if (this.tasks.isEmpty()) {
            System.out.println("Your to-do list is empty");
        } else {
            for (String task : this.tasks) {
                System.out.println(task);
            }
        }
    }
}
