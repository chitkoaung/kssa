package com.kssa.cms.repository;

import com.kssa.cms.model.Course;
import com.kssa.cms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByInstructor(User instructor);
}
