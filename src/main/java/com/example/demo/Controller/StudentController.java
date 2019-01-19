package com.example.demo.Controller;


import com.example.demo.Model.Student;
import com.example.demo.Repository.ModuleRepository;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;





    @RequestMapping("/StudentDetails")
    public ModelAndView doHome(Model model) {

        ModelAndView mv = new ModelAndView( "index" );
        List<Student> users = (List<Student>) studentRepository.findAll();
        System.out.println( users );
        for (Student user : users) {
            System.out.println( user.toString() );
        }

        return mv.addObject( "StudentList", users );
    }

}

