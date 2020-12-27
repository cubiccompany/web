package com.example.controller;

import com.example.domain.Role;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@PreAuthorize("hasAuthority('ADMIN')")
@Controller
public class UserListController {

    @Autowired
    private UserService userService;


    @GetMapping("/userList")
    public String userList(Model model) {
        model.addAttribute("users", userService.findAll());

        return "userList";
    }


}
