package com.sfc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sfc.form.Driver;

@Component
public class DriverValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(Driver.class);
			
	}

	@Override
	public void validate(Object form, Errors errors) {
		Driver driver = (Driver) form;
		if (driver.getId() < 0 || String.valueOf(driver.getId()).equals("")) {
			errors.rejectValue("id", "id.invalid");
		}
	}

}
