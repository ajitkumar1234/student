package com.sfc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sfc.form.Driver;
import com.sfc.validator.DriverValidator;

@Controller
@EnableWebMvc
public class DriverController {
	@Autowired
	private DriverValidator validator;

	@RequestMapping(method = RequestMethod.GET, value = "/newdriver.htm")
	public String setUpForm(Model model) {
		model.addAttribute("driver", new Driver());
		return "newdriver";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String process(Model model, @ModelAttribute("driver") Driver driver,
			BindingResult errors) {
		if (validator.supports(driver.getClass())) {
			validator.validate(driver, errors);
			if (errors.hasErrors()) {
				return "newdriver";
			}
		}
		model.addAttribute("id", driver.getId());
		return "success";
	}
}
