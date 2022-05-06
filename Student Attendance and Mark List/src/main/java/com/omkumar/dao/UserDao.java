package com.omkumar.dao;

import com.omkumar.model.Student;

import java.util.List;

public interface UserDao {

  int register(Student student);

  int addmark(Student student);

  List<Student> view();

  List<Student> viewgrade();

  Student validate(Student student);

  int present(Student student);

  int absent(Student student);
}
