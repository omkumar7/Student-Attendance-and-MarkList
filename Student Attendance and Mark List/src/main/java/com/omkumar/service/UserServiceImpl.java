package com.omkumar.service;

import com.omkumar.dao.UserDao;
import com.omkumar.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(Student student) {
    return userDao.register(student);
  }


  public  int addmark(Student student){return userDao.addmark(student);}

  public List<Student> view() {
    return userDao.view();
  }

  public List<Student> viewgrade(){return userDao.viewgrade();}

  public Student validate(Student student){return  userDao.validate(student);}

  public int present(Student student){return userDao.present(student);}

  public  int absent(Student student){return userDao.absent(student);}


}
