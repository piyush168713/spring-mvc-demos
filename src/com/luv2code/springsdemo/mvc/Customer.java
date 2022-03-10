package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.*;
import java.util.stream.Stream;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "is required")         // when field is empty, log this message
    @Min(value = 0, message="must be greater than or equal to zero")
    @Max(value = 10, message = "must be less than or equal to 10")
    private Integer freePasses;

    @NotNull(message="is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{6}" , message="only 6 chars/digits")
    private String postalCode;

    @NotNull(message="is required")
    @CourseCode(value="TOPS", message="must starts with TOPS")       // we can customize the starting value also from here.
    //@CourseCode(value="MNT", message="must starts with MNT")
    //@CourseCode(value={"TOPS", "LUV"}, message="must start with TOPS or LUV")
    private String courseCode;

    // getter and setter methods
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Integer getFreePasses(){
        return freePasses;
    }

    public void setFreePasses(Integer freePasses){
        this.freePasses = freePasses;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
