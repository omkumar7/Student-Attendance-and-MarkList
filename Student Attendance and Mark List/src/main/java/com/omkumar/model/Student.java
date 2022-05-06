package com.omkumar.model;

import com.omkumar.service.UserService;
import lombok.Data;

@Data
public class Student {

    private int rollno;

    private String name;

    private String phone;

    private String dept;

    private String status;

    private int mark1;

    private int mark2;

    private int mark3;

    private int mark4;

    private  int mark5;

    private int total;

    private String grade;

    public int getTotal() {
        return mark1+ mark2+ mark3+ mark4 + mark5;
    }

    public String getGrade(){
        String grade=null;
        int marks= mark1+mark2+mark3+mark4+mark5 ;

        if (marks>=475){return grade="A";}
        else if (marks>=450){return grade="B";}
        else if (marks>=400){return grade="C";}
        else if (marks>=350){return grade="D";}
        else if (marks>=250){return grade="E";}
        else if (marks<5){return grade=null;}
       else if (marks<250){return grade="Fail";}
        return grade;


    }
}
