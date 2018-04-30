package me.soulyana.demo.Controllers;

import me.soulyana.demo.Models.Student;
import me.soulyana.demo.Repositories.CourseRepository;
import me.soulyana.demo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentRepository studentRepository;

    public String showHomePage(Model model) {
        model.addAttribute("menuoption", "homepage");
        return "homepage";
    }

    public String addStudent(Model model) {
        model.addAttribute("menuoption", "addstudent");
        model.addAttribute("aStudent", new Student());
        return "studentform";
    }
}
