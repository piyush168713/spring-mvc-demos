package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")                            // parent mappping
public class HelloWorldController {

    // need the controller method to show the initial HTML form
    @RequestMapping("/showForm")                          // sub mappping
    public String showForm() {
        return "helloworld-form";                   // jsp file "helloworld-form"
    }

    // need the controller method to process the HTML form
    @RequestMapping("/processForm")                          // sub mappping
    public String processForm() {
        return "helloworld";                   // jsp file "helloworld"
    }


    // new a controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        // here we take the studentName from helloworld-form.jsp file for use
        String theName = request.getParameter("studentName");

        // convert the data to all uppercase
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model and pass the reference value of "result" using name "message"
        model.addAttribute("message", result);

        return "helloworld";
    }


    // add data to the model
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        // here we take the studentName from helloworld-form.jsp file for use and then we bind up this to theName.


        // convert the data to all uppercase
        theName = theName.toUpperCase();

        // create the message
        String result = "Heyy my Friend from v3! " + theName;

        // add message to the model and pass the reference value of "result" using name "message" or store the value of result in message.
        model.addAttribute("message", result);

        return "helloworld";
    }
}