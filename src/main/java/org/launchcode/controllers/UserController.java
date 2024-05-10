package org.launchcode.controllers;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm(Model model) {
    model.addAttribute("title", "Add User");
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute SecurityProperties.User user, String verify) {
// add form submission handling code here
    }

}
