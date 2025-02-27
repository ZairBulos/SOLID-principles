package org.zair.single_responsibility.correct;

import java.util.List;

public class TaskRepository {

    public void saveTasksToFile(String fileName, List<String> tasks) {}

    public void loadTasksFromFile(String fileName) {}
}
