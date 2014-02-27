package com.epam.romanenko.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.romanenko.domain.model.DoctorType;
import com.epam.romanenko.services.DoctorTypeService;

@Controller
public class WelcomeController {

	@Autowired
	private DoctorTypeService doctorTypeService;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcomePage(Model model) {
		List<DoctorType> list = doctorTypeService.getAll();
		// return back to welcome.jsp
		model.addAttribute("lists", list);
		DoctorType doctorType = doctorTypeService.getDoctorTypeById(1L);
		model.addAttribute("doctorType", doctorType);
		return "welcome";
	}

	@RequestMapping(value = "/adminWelcome", method = RequestMethod.GET)
	public String getAdminWelcomePage() {
		return "adminWelcome";
	}

}