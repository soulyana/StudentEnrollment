package me.soulyana.demo.Repositories;

import me.soulyana.demo.Models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
