package com.luv2code.springdemo.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)        // Helper class that contains business rules/ validation logic.
@Target( {ElementType.METHOD, ElementType.FIELD } )           // can apply our annotation to a method or field
@Retention(RetentionPolicy.RUNTIME)                   // Retain this annotation in java class file and also use it at RUNTIME by the JVL.
// @Retention basically says, how long will the marked annotation be stored or used.
public @interface CourseCode {

    // Define default course code
    public String value() default "LUV";

    // define default error message
    public String message() default "must start with LUV";

    // define default groups         // This is for who are using the actual annotation
    public Class<?>[] groups() default {};

    // define default payloads         // provide custom details about validation failure(security level, error code etc)
    public Class<? extends Payload>[] payload() default {};

}
