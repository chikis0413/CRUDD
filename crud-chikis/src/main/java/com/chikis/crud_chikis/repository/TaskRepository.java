package com.chikis.crud_chikis.repository;

import com.chikis.crud_chikis.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}