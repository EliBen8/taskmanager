package com.taskapi.taskmanager.repository;

import com.taskapi.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Find all of the completed tasks...
    List<Task> findByCompleted(Boolean completed);

    // Find tasks by title containing a word
    List<Task> findByTitleContainingIgnoreCase(String keyword);
}
