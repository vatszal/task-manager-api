package com.vatsal.taskmanager;

public class Task {
    private Long id;
    private String title;
    private boolean completed;
    private static long nextId = 1;

    public Task() {
        id = nextId++;
        title = "Learn Spring Boot";
        completed = false;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
