package com.example.SpringRestAPI.api.repo;

import com.example.SpringRestAPI.api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
