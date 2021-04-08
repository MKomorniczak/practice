package com.example.practice.controller;

import com.example.practice.dto.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class WebController {


    @GetMapping("/")
    public String showForm(Model model) {
        Customer dto = new Customer();
        model.addAttribute("dto", dto);
        return "form";
    }

    @PostMapping("/save")
    public String saveButton(@Valid @ModelAttribute("dto") Customer customer, BindingResult bindingResult){
        System.out.println("customer to string"+ customer.toString());
        if (bindingResult.hasErrors())
            return "form";

        return "redirect:/";


    }



}


