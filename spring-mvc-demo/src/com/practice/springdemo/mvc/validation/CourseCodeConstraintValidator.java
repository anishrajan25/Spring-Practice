package com.practice.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String dataFromOurForm, ConstraintValidatorContext theConstraintValidatorContext) {
		
		if(dataFromOurForm != null && coursePrefix != null) {
			return dataFromOurForm.startsWith(coursePrefix);
		}
		
		return false;
	}

}
