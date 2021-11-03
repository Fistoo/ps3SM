package com.example.ps3;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks;

    public static TaskStorage getInstance(){return taskStorage;}

    private TaskStorage(){
        tasks = new ArrayList<>();
        for(int i=0; i <=100 ;i++){
            Task task = new Task();
            task.setName("Zadanie #" + i );
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }


}
