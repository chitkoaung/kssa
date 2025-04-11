package com.kssa.cms.repository;

import com.kssa.cms.model.Course;
import com.kssa.cms.model.Enrollment;
import com.kssa.cms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment> findByStudent(User student);
    boolean existsByStudentAndCourse(User student, Course course);
}
