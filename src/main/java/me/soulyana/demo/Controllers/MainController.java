package me.soulyana.demo.Controllers;

import me.soulyana.demo.Repositories.CourseRepository;
import me.soulyana.demo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentRepository studentRepository;


}
