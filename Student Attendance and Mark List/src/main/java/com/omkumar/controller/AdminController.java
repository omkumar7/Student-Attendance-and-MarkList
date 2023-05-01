package com.omkumar.controller;
//
import com.omkumar.model.Student;
import com.omkumar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    public UserService userService;


    @RequestMapping("/addstudent")
    public String addstudent(Model model){
        model.addAttribute("student",new Student());
        return "addstudent";
    }



    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("student") Student student) {

        ModelAndView mav = new ModelAndView("welcome");
        userService.register(student);

        return mav;
    }

    @RequestMapping(value = "/markprocess", method = RequestMethod.POST)
    public ModelAndView addmark(@ModelAttribute("student") Student student){

        ModelAndView mav =new ModelAndView("markadded");

        userService.addmark(student);


        return mav;
    }


    @RequestMapping("/attendence")
    public ModelAndView attendence(@ModelAttribute("student") Student student){

        List<Student> students = userService.view();
        ModelAndView mav =new ModelAndView("attendence");
        mav.addObject("students",students);
        return  mav;
    }

    @RequestMapping("/status")
    public  ModelAndView lists(@ModelAttribute("student")Student student){
        List<Student> students = userService.view();
        ModelAndView mav =new ModelAndView("status");
        mav.addObject("students",students);
        return mav;

    }
    @RequestMapping("/marklist")
    public ModelAndView marklist(@ModelAttribute("student")Student student){
        List<Student> students = userService.view();
        ModelAndView mav = new ModelAndView("marklist");
        mav.addObject("students",students);
        return mav;
    }




    @RequestMapping(value = "/present/{rollno}",method = RequestMethod.GET)
    public ModelAndView present(@ModelAttribute("student") Student student){
        ModelAndView mav =new ModelAndView("redirect:/attendence");
        userService.present(student);
        return mav;
    }

    @RequestMapping(value = "/absent/{rollno}",method = RequestMethod.GET)
    public ModelAndView absent(@ModelAttribute("student") Student student){
        ModelAndView mav =new ModelAndView("redirect:/attendence");
        userService.absent(student);
        return mav;
    }

    @RequestMapping("/rollno")
    public String rollno(Model model){
        model.addAttribute("student",new Student());
        return "roll";
    }

    @RequestMapping(value = "/validrollno", method = RequestMethod.POST)
    public ModelAndView editprocess(HttpServletRequest request, HttpServletResponse response,
                                    @ModelAttribute("student")Student student) {
        ModelAndView mav = null;
        Student student1 = userService.validate(student);
        if (null != student1) {
            mav = new ModelAndView("addmark");

            mav.addObject("Rollno",student1.getRollno());
            mav.addObject("name",student1.getName());
            mav.addObject("phone",student1.getPhone());
            mav.addObject("dept",student1.getDept());
            mav.addObject("status",student1.getStatus());
            mav.addObject("mark1",student1.getMark1());
            mav.addObject("mark2",student1.getMark2());
            mav.addObject("mark3",student1.getMark3());
            mav.addObject("mark4",student1.getMark4());
            mav.addObject("total",student1.getTotal());
            mav.addObject("grade",student1.getGrade());
        }
        else {
            mav = new ModelAndView("roll");
            mav.addObject("message", "No Student in this RollNo!!");
        }
        return mav;
    }
    @RequestMapping("/gradelist")
    public ModelAndView gradelist(@ModelAttribute("student")Student student){
        List<Student> students = userService.viewgrade();
        ModelAndView mav = new ModelAndView("gradelist");
        mav.addObject("students",students);
        return mav;
    }




}
