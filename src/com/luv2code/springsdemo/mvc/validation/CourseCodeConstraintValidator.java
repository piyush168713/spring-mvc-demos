package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;      // define coursePrefix that can validate against.

    @Override
    public void initialize(CourseCode theCourseCode){         // we have to implement or override
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext){      // we'll put our actual business logic to return true or false if the given string validates.
        // Validation logic: test if the form data starts with our course prefix.
        boolean result;

        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        }
        else {
            result = true;
        }

        return result;
        // If you writing your own custom validation rule,you can do anything you want in this method(isValid()), you can talk to a database, call a web service, or rest API, or whatever you need.
    }
}
