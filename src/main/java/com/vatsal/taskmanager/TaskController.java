package com.vatsal.taskmanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/tasks")
@RestController
public class TaskController {
    private List<Task> tasks = new ArrayList<>();

    @GetMapping
    public List<Task> getTasks() {
        return tasks;
    }

    @PostMapping
    public Task postTasks() {
        tasks.add(new Task());
        return tasks.getLast();
    }

    @PatchMapping("/{id}")
    public Task patchCompletedTask(@PathVariable Long id, @RequestBody ArrayList<String, Object> ) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId().equals(id)) {
                tasks.get(i).setCompleted(completed);
                return tasks.get(i);
            }

        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Task not found");
    }
}
