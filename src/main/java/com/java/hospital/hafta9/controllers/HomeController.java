package com.java.hospital.hafta9.controllers;

import com.java.hospital.hafta9.models.Doctor;
import com.java.hospital.hafta9.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private DoctorRepository doctorRepository;

    public HomeController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/{doctor}")
    public String home(Model model){
        Doctor doctor = new Doctor();
//        doctor = doctorRepository.findById(1);
        model.addAttribute("doctor", doctor);
        return "index";
    }


}
