package me.soulyana.demo.Repositories;

import me.soulyana.demo.Models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
