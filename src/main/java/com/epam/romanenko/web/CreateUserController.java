package com.epam.romanenko.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.romanenko.domain.model.User;
import com.epam.romanenko.services.UserService;

@Controller
@RequestMapping("/create")
public class CreateUserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public String create(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "createUser";
		}
		userService.insertUser(user);
		return "redirect:/welcome";

	}

	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createUserForm(Model model) {
		model.addAttribute(new User());
		return "createUser";
	}

}
