package com.example.first.Repository;

import com.example.first.Model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result,Long> {
    List<Result> findByStudentName(String studentName);
}
