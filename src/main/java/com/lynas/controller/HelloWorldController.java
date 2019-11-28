package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")   //parent mapping
public class HelloWorldController extends HttpServlet {

    //controller method for show the initial HTMl form
    @RequestMapping("/showForm")  //sub mapping (relative)
    public String showForm(){
        return "helloworld-form";
    }

    //controller method for process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result= "Yo!" + theName;

        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        theName = theName.toUpperCase();

        String result= "Hey my friend  from v3! " + theName;

        model.addAttribute("message", result);

        return "helloworld";
    }
}
