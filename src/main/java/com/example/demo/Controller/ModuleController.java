package com.example.demo.Controller;

import com.example.demo.Repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ModuleController {

    @Autowired
    private ModuleRepository moduleRepository;


}
